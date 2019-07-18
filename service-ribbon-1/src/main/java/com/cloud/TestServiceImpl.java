package com.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: Copyright 2011-2018 B5M.COM. All rights reserved
 * @author: yangren
 * @version: 1.0
 * @createdate: 2018/10/29
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2018/10/29      yangren       1.0             Why & What is modified
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    /**
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        String forObject = restTemplate.getForObject("http://service-2/hi?name=" + name, String.class);
        return forObject;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
