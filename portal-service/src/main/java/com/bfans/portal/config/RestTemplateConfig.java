package com.bfans.portal.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lwb
 * @date 2020-3-26
 */
@Configuration
public class RestTemplateConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    /**
     * ribbon负载均衡策略，默认是轮询
     *
     * @return
     */
    /*@Bean
    public IRule ribbonRule() {
        //return new BestAvailableRule();
        return new RandomRule();
    }*/

}

