package com.example.starter.starterdemo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
@AllArgsConstructor
public class ImportContext {

    private final ImportStrategy importStrategy;

    public void executeStrategy(String msg) {
        log.info("importStrategy will be executed soon : msg {}", msg);
        importStrategy.show(msg);
    }
}
