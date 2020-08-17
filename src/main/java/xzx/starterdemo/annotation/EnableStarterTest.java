package xzx.starterdemo.annotation;

import org.springframework.context.annotation.Import;
import xzx.starterdemo.config.EnableTestConfig;

import java.lang.annotation.*;

/**
 * @author xzx
 * @date 2020/8/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EnableTestConfig.class})
public @interface EnableStarterTest {
}
