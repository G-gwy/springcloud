package com.springcloud.consumer.controller;

import com.gggsl.springcloud.api.entity.Dept;
import com.gggsl.springcloud.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    //理解：消费者不应该有service
    @Autowired
    RestTemplate restTemplate;
    //ribbon时，这是个变量（通过服务访问--ribbon）
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    //private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";
    //http://localhost:8001/dept/list
    @Resource
    DeptClientService service;
    @GetMapping("/consumer/dept/list")
    public List<Dept> list() {
        //return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return service.list();
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        //return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
        return service.get(id);
    }

}
