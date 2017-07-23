package com.zhz.datasource;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * Created by zz1987 on 17/7/19.
 */
public class MapperInterceptor implements MethodBeforeAdvice, AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        Class<?> entityClass = method.getDeclaringClass();
        // 分表主键补全
//        if (entityClass.isAnnotationPresent(TableSharding.class)) {
//            TableSharding segmentTable = entityClass.getAnnotation(TableSharding.class);
//            if (segmentTable != null && StringUtils.isNotEmpty(segmentTable.shardKey())
//                    && method.getName().startsWith("insert")) {
//                for (Object obj : objs) {
//                    if (obj instanceof BaseDomain) {
//                        Class<?> clazz = (Class<?>) ((ParameterizedType) obj.getClass().getGenericSuperclass())
//                                .getActualTypeArguments()[0];
//
//                        if (domain.getId() == null) {
//                            long id = shardingTableUniqueKeyDao.getShardKey(segmentTable.shardKey());
//                            if (clazz.isAssignableFrom(Integer.class)) {
//                                domain.setId(Integer.valueOf(String.valueOf(id)));
//                            } else {
//                                domain.setId(id);
//                            }
//                        }
//                    }
//                }
//            }
//        }
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
