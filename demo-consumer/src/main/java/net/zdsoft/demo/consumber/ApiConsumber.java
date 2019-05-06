package net.zdsoft.demo.consumber;

import net.zdsoft.demo.api.ApiInterface;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author shenke
 * @since 2019/5/6 下午2:51
 */
@Component
public class ApiConsumber {

    @Resource
    private ApiInterface apiInterface;

    @PostConstruct
    public void init() {
        apiInterface.hello("hello");
    }
}
