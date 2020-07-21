package xzx.starterdemo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xzx
 * @date 2020/7/21
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "import")
public class TestMsg {
    private String msg;
}
