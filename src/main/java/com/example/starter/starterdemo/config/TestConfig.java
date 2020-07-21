package com.example.starter.starterdemo.config;

import com.example.starter.starterdemo.properties.TestMsg;
import com.example.starter.starterdemo.service.TestService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Configuration
@EnableConfigurationProperties(TestMsg.class)
@ConditionalOnProperty(prefix = "import")
public class TestConfig {

    @Bean
    public TestService testService(TestMsg testMsg) {
        return new TestService(testMsg.getMsg());
    }
}
