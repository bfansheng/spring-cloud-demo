package com.bfans.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lwb
 * @date 2020-3-26
 */
@RefreshScope
@RestController
@RequestMapping("/portal/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${portal.version}")
    private String version;

    @GetMapping("/info")
    public String info() {
        return restTemplate.getForObject("http://user-service/user/test/info", String.class);
    }

    @GetMapping("/version")
    public String version() {
        return version;
    }

}
