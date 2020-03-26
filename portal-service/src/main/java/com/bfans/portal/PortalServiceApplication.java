package com.bfans.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lwb
 * @date 2020-3-24
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class PortalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalServiceApplication.class, args);
    }

}

