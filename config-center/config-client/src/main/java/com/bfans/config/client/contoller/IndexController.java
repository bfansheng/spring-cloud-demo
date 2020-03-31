package com.bfans.config.client.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lwb
 * @date 2020-3-29
 */
@RefreshScope
@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${info}")
    private String info;

    @GetMapping("/info")
    public String info() {
        return info;
    }

}
