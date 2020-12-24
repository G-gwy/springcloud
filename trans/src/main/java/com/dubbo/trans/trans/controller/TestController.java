package com.dubbo.trans.trans.controller;

import com.dubbo.trans.trans.domain.TTT;
import com.dubbo.trans.trans.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    TestService testService;

    public Integer  test(Integer id,Integer c) {
        return testService.update(id, c);
    }
}
