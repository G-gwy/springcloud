package com.dubbo.trans.trans.controller;

import com.dubbo.trans.trans.domain.TTT;
import com.dubbo.trans.trans.service.TestService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    TestService testService;

    public Integer  test(Integer id,Integer c) {
        return testService.update();
    }
}
