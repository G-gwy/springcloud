package com.dubbo.trans.trans.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service(version = "1.0.0", group = "SEATA_GROUP")
public class TestServiceImpl implements TestService {
    @Override
    public Integer update() {
        return null;
    }
}
