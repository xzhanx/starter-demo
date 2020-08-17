package xzx.starterdemo.annotation;

import org.springframework.context.annotation.Import;
import xzx.starterdemo.config.EnableTestConfig;

/**
 * @author xzx
 * @date 2020/8/17
 */
@Import({EnableTestConfig.class})
public @interface EnableStarterTest {
}
