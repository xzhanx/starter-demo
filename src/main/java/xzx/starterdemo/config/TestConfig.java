package xzx.starterdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xzx.starterdemo.properties.TestMsg;
import xzx.starterdemo.service.TestService;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
@Configuration
@ConditionalOnClass(EnableTestConfig.class)
@EnableConfigurationProperties(TestMsg.class)
public class TestConfig {

    @Bean
    public TestService testService(TestMsg testMsg) {
        return new TestService(testMsg);
    }
}
