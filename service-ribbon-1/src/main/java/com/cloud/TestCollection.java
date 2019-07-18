package com.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private TestService testService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return testService.hiService(name);
    }
}
