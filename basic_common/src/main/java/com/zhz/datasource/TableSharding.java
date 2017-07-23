package com.zhz.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zz1987 on 17/7/21.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TableSharding {
    //表名
    public String table();

    //分表策略
    public String shardType();

    //根据什么字段分表
    public String shardBy();

    //取模时候分表数量
    public int tableNum();
}
