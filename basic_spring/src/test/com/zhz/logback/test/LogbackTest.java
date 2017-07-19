package com.zhz.logback.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by zz1987 on 17/7/19.
 */
public class LogbackTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.info("test logback info");
        logger.error("test logback error");
        logger.debug("test logback debug");
    }
}
