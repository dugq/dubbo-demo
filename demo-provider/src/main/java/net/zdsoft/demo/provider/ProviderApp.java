package net.zdsoft.demo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shenke
 * @since 2019/5/6 下午2:45
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "net.zdsoft.demo.provider")
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
