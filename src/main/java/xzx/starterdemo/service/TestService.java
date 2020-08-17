package xzx.starterdemo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import xzx.starterdemo.properties.TestMsg;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class TestService implements InitializingBean {

    private TestMsg testMsg;

    public void testMsg() {
        log.info("test msg : {}", testMsg.getMsg());
    }

    @Override
    public void afterPropertiesSet() {
        log.info("[InitializingBean] afterPropertiesSet() invoke : TestService has bean Initialized! ");
    }
}
