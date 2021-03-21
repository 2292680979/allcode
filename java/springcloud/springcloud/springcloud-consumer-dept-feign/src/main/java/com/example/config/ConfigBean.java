package com.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description:
 * @author: xjh
 * @create: 2020-11-16 17:28
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //配置负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
