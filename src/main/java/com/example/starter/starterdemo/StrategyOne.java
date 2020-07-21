package com.example.starter.starterdemo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
public class StrategyOne implements ImportStrategy {

    @Override
    public void show(String msg) {
        log.info("StrategyOne: {}", msg);
    }
}
