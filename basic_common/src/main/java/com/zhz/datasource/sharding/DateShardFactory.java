package com.zhz.datasource.sharding;

import com.zhz.datasource.TableSharding;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 按日期分表
 * Created by zz1987 on 17/7/21.
 */
//public class DateShardFactory extends ShardStrategy {
//
////    @Override
////    public String convert(TableSharding tableSharding, Object param) {
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        StringBuilder sb = new StringBuilder(tableSharding.table());
////        sb.append("_");
////        sb.append(sdf.format(new Date()));
////        return sb.toString();
////    }
//}
