package net.zdsoft.demo.consumber;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author shenke
 * @since 2019/5/6 下午2:49
 */
@SpringBootApplication
@EnableDubbo
@ImportResource(locations = "classpath*:/api.xml")
public class ConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
