package com.zhz.datasource.sharding;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.zhz.datasource.TableSharding;
import com.zhz.util.JsonUtils;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by zz1987 on 17/7/21.
 */
public class ShardStrategy {

    protected BoundSql boundSql;
    protected Configuration configuration;
    protected Object paramObject;
    protected MappedStatement mappedStatement;

    Logger logger = LoggerFactory.getLogger(ShardStrategy.class);

    public ShardStrategy(BoundSql boundSql,Configuration configuration,Object paramObject,MappedStatement mappedStatement){
        this.boundSql = boundSql;
        this.configuration = configuration;
        this.paramObject =paramObject;
        this.mappedStatement = mappedStatement;
    }

    public Object getFieldValue(String propertyName,Object param){
        MetaObject metaObject = paramObject == null ? null : configuration.newMetaObject(paramObject);
        TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
        Object value = null;
        if(boundSql.hasAdditionalParameter(propertyName)){
            //动态参数（如foreach））
            value = boundSql.getAdditionalParameter(propertyName);
        }else if(param == null){
            //参数为null
            value = null;
        }else if(typeHandlerRegistry.hasTypeHandler(paramObject.getClass())){
            //基本类型参数
            value = paramObject;
        }else{
            //复杂对象或者Map类型参数
            if(metaObject== null){
                value=null;
            }else{
                if(metaObject.hasGetter(propertyName)){
                    value = metaObject.getValue(propertyName);
                }else{
                    //借鉴duotinFM的 因参数形式而异
                    List<ParameterMapping> maps = boundSql.getParameterMappings();
                    if (maps!=null && maps.size()>0) {
                        for (ParameterMapping mapping : maps) {
                            if (mapping != null && mapping.getMode() != ParameterMode.OUT) {
                                PropertyTokenizer prop = new PropertyTokenizer(mapping.getProperty());
                                // condition 条件下数据库操作对应参数处理
                                if (mapping.getProperty().startsWith(ForEachSqlNode.ITEM_PREFIX)
                                        && boundSql.hasAdditionalParameter(prop.getName())) {
                                    Map<String, Object> map = JsonUtils.toMap(JsonUtils.toString(boundSql
                                            .getAdditionalParameter(prop.getName())));
                                    if (map != null && map.size()>0) {
                                        String key = (String) map.get("condition");
                                        if (StringUtils.isNotEmpty(key)) {
                                            key = key.replaceAll(" ", "").replaceAll("=", "");
                                            if (key.equals(propertyName)) {
                                                value = map.get("value");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return  value;
    }

    public String getTargetSql(String originSql, TableSharding tableSeg) {
        String newSql = null;
        if (tableSeg == null)
            return newSql;
        String tableName = tableSeg != null ? tableSeg.table().trim() : "";
        String shardType = tableSeg != null ? tableSeg.shardType().trim() : "";
        String shardBy = tableSeg != null ? tableSeg.shardBy().trim() : "";
        String suffix=null;
        if (shardType != null && shardType.startsWith("shard_mod")) {// 取模
            suffix= this.getShardModeValue(tableSeg, shardBy)+"";
        } else if (shardType != null && shardType.startsWith("shard_date")) {// 按日期分表
            suffix = this.getShardDateValue(shardBy);
        } else {
            // 待扩展
        }
        if(suffix==null||suffix.equals("")) {
            logger.error("分表失败，获取不到值或者参数名称不匹配");
            return newSql;
        }else{
            //替换新表名
            String newTableName=tableName+"_"+suffix;
            //表名尽量保持唯一，不要与字段重名
            newSql=originSql.replaceAll(tableName, newTableName);
        }
        return newSql;
    }


    public int getShardModeValue(TableSharding tableSharding,String shardBy){
        Object value = this.getFieldValue(shardBy,this.paramObject);
        return (Integer) value % tableSharding.tableNum();
    }

    public String getShardDateValue(String shardBy){
        Object value = this.getFieldValue(shardBy,this.paramObject);
        Date shardDate = (Date) value;
        if (shardDate == null) {
            shardDate = new Date();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//按月份分表
        String data = sdf.format(shardDate);
        return data;
    }


    public BoundSql getBoundSql() {
        return boundSql;
    }

    public void setBoundSql(BoundSql boundSql) {
        this.boundSql = boundSql;
    }


    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public Object getParamObject() {
        return paramObject;
    }

    public void setParamObject(Object paramObject) {
        this.paramObject = paramObject;
    }

    public MappedStatement getMappedStatement() {
        return mappedStatement;
    }

    public void setMappedStatement(MappedStatement mappedStatement) {
        this.mappedStatement = mappedStatement;
    }


}
