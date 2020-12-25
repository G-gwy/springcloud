package com.dubbo.trans.trans.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.trans.trans.dao.TTTDao;
import com.sun.org.apache.xpath.internal.operations.String;
import com.trans.api.transapi.api.TTTService;
import com.trans.api.transapi.domain.TTT;
import io.seata.spring.annotation.GlobalTransactional;
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
    @Resource
    TTTDao tttDao;
    @Override
    @GlobalTransactional
    public Integer update(Integer id,Integer c) {
        tttDao.update(new com.dubbo.trans.trans.domain.TTT(id+2, c));
        if (id == 3) {
            throw new RuntimeException("异常异常--消费者（消费前）");
        }
        int i= tttService.update(new TTT(id,c));
        if (id == 2) {
            throw new RuntimeException("异常异常--消费者（消费后）");
        }
        return i;
    }
}
