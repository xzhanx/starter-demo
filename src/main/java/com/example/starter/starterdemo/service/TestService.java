package com.example.starter.starterdemo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
@AllArgsConstructor
public class TestService {

    private final String msg;

    public void testMsg() {
        log.info("test msg : {}", msg);
    }
}
