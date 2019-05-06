package net.zdsoft.demo.provider;

import net.zdsoft.demo.api.ApiInterface;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author shenke
 * @since 2019/5/6 下午2:46
 */
@Component
@Service
public class ApiImpl implements ApiInterface {

    @Override
    public void hello(String message) {
        System.out.println("Message: " + message);
    }
}
