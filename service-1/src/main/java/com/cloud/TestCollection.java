package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class TestCollection {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
