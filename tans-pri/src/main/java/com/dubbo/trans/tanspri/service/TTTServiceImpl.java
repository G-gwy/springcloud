package com.dubbo.trans.tanspri.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0", group = "SEATA_GROUP")
public class TTTServiceImpl implements TTTService {
    @Override
    public Integer update() {
        return null;
    }
}
