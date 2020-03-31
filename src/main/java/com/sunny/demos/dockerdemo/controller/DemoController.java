package com.sunny.demos.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxq
 * @version 1.0
 * @date 2020/3/28 10:13
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
