package com.cloud;

import org.springframework.stereotype.Component;

/**
 * @description: 断路器fallback
 * @author: yangren
 * @version: 1.0
 * @createdate: 2018/10/30
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2018/10/30      yangren       1.0             Why & What is modified
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
