package com.zhz.datasource;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zz1987 on 17/7/19.
 */
public class MapperInterceptor implements MethodBeforeAdvice, AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        Class<?> entityClass = method.getDeclaringClass();
        if (entityClass.isAnnotationPresent(DataSource.class)) {
            DataSource dataSource = entityClass.getAnnotation(DataSource.class);
            if (dataSource != null) {
                DataSourceContextHolder.setDbKey(dataSource.value());
            }
        } else {
            DataSourceContextHolder.setDbKey("default");
        }
    }
}
