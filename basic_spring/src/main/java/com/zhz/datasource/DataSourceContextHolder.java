package com.zhz.datasource;

/**
 * Created by zz1987 on 17/7/19.
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDbKey(String key){
        contextHolder.set(key);
    }

    public static String getDbKey(){
        return contextHolder.get();
    }

    public static void clearDbKey(){
        contextHolder.remove();
    }
}
