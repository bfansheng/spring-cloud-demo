package com.bfans.portal.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lwb
 * @date 2020-3-29
 */
@Configuration
public class RibbonConfig {

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
