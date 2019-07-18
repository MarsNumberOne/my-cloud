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

    /**
     * 编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
     */
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
