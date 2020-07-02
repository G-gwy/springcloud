package com.gggsl.springcloud.api.service;

import com.gggsl.springcloud.api.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT-02", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @GetMapping("/provider/dept/list")
    List<Dept> list();

    @GetMapping("/provider/dept/get/{id}")
    Dept get(@PathVariable("id") Long id);

}
