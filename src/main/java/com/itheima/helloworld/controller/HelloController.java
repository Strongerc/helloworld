package com.itheima.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @version V1.0
 * @Package com.itheima.helloworld.controller
 * @date 2023/5/16 23:23
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {
        System.out.println("123");
        return "OK1";
    }
}
