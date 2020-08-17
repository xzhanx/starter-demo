package xzx.starterdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
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
@EnableConfigurationProperties(TestMsg.class)
public class TestConfig implements InitializingBean {

    @Bean
    public TestService testService(TestMsg testMsg) {
        return new TestService(testMsg);
    }

    @Override
    public void afterPropertiesSet() {
        log.info("[InitializingBean] afterPropertiesSet() invoke : TestService has bean Initialized! ");
    }
}
