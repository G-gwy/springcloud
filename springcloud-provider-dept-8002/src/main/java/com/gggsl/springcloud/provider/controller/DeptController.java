package com.gggsl.springcloud.provider.controller;

import com.gggsl.springcloud.api.entity.Dept;
import com.gggsl.springcloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    //获取一些配置信息，得到具体的微服务
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public Integer addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/list")
    public List<Dept> listDept() {
        return deptService.listDept();
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id ) {
        return deptService.get(id);
    }
    /*@GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {

        return deptService.get(id);
    }
*/

    //注册进来的微服务，获取一些信息
    @GetMapping("/discovery")
    public Object discovery() {
        //获取微服务清单 团队开发使用
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);
        //具体微服务id
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach(in -> {
            System.out.println(in.getHost() + " " + in.getPort());
        });
        return this.discoveryClient;

    }
}
