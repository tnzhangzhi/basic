package com.zhz.datasource;

import com.zhz.datasource.sharding.ShardStrategy;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Properties;

/**
 * Created by zz1987 on 17/7/21.
 */

@Intercepts({@Signature(type = StatementHandler.class,method = "prepare",args = {Connection.class})})
public class ShardingInterceptor implements Interceptor{

    Logger logger = LoggerFactory.getLogger(ShardingInterceptor.class);

    private static final ObjectFactory OBJECT_FACTORY = new DefaultObjectFactory();
    private static ObjectWrapperFactory OBJECT_WRAPPER_FACTORY = new DefaultObjectWrapperFactory();

    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaObject = MetaObject.forObject(statementHandler,OBJECT_FACTORY,OBJECT_WRAPPER_FACTORY);
        BoundSql boundSql = (BoundSql) metaObject.getValue("delegate.boundSql");
        Object parameterObject = metaObject.getValue("delegate.boundSql.parameterObject");
        Configuration configuration = (Configuration) metaObject.getValue("delegate.configuration");
        String originSql = (String) metaObject.getValue("delegate.boundSql.sql");
        if(originSql != null && !originSql.equals("")){
            logger.info("分表前的SQL:"+originSql);
            MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
            String id = mappedStatement.getId();
            String className = id.substring(0,id.lastIndexOf("."));
            Class<?> classObj = Class.forName(className);


            TableSharding tableSharding = classObj.getAnnotation(TableSharding.class);
            if(tableSharding!=null){
                ShardStrategy strategy = new ShardStrategy(boundSql,configuration,parameterObject,mappedStatement);
                String targetSQl = strategy.getTargetSql(originSql,tableSharding);
                metaObject.setValue("delegate.boundSql.sql",targetSQl);
                logger.info("分表后的SQL:"+targetSQl);
            }
        }

        return invocation.proceed();
    }

    public Object plugin(Object target) {
        if (target instanceof StatementHandler) {
            return Plugin.wrap(target, this);
        } else {
            return target;
        }
    }

    public void setProperties(Properties properties) {

    }

}
