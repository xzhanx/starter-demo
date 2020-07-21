package xzx.starterdemo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xzx.starterdemo.properties.TestMsg;
import xzx.starterdemo.service.TestService;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Configuration
@EnableConfigurationProperties(TestMsg.class)
public class TestConfig {

    @Bean
    public TestService testService(TestMsg testMsg) {
        return new TestService(testMsg.getMsg());
    }
}
