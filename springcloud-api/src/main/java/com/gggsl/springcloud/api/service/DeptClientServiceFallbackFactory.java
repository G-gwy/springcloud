package com.gggsl.springcloud.api.service;

import com.gggsl.springcloud.api.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//降级
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> list() {
                System.out.println(111);
                return new ArrayList<>();
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDbSource("降级null").setDName("null");
            }
        };
    }
}
