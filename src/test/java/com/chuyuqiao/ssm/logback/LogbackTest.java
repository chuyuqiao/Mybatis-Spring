package com.chuyuqiao.ssm.logback;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogbackTest {
    public static void main(String[] args) {
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }
}
