package com.chuyuqiao.ssm.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 17021629 on 2017/11/7.
 */
public class LogbackTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);
    public static void main(String[] args) {
        LOGGER.trace("======trace");
        LOGGER.debug("======debug");
        LOGGER.info("======info");
        LOGGER.warn("======warn");
        LOGGER.error("======error");
    }
}
