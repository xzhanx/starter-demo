package xzx.starterdemo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class TestService {

    private String msg;

    public void testMsg() {
        log.info("test msg : {}", msg);
    }
}
