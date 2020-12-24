package com.dubbo.trans.trans.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sun.org.apache.xpath.internal.operations.String;
import com.trans.api.transapi.api.TTTService;
import com.trans.api.transapi.domain.TTT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service(version = "1.0.0", group = "SEATA_GROUP")
public class TestServiceImpl implements TestService {
    @Resource
    TTTService tttService;
    @Override
    public Integer update(Integer id,Integer c) {
        return tttService.update(new TTT(id,c));
    }
}