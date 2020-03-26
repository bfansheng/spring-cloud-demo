package com.bfans.user.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwb
 * @date 2020-3-26
 */
@RestController
@RequestMapping("/user/test")
public class TestController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String info() {
        return String.format("%s am from port: %s", appName, port);
    }

}
