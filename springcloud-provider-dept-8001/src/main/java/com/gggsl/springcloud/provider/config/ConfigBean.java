package com.gggsl.springcloud.provider.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //配置restTemplate
    /*@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }*/

    //配置负载均衡实现restTemplate
    //IRule
    //AvailabilityFilteringRule: 先过滤掉故障五福，对剩下轮询
    //RoundRobinRule 轮询
    //RetryRule 重试 会先按照轮询获取服务，如果服务获取失败，则会在指定时间进行重试
    //RandomRule 随机
    @Bean
    @LoadBalanced//Ribbon

    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
