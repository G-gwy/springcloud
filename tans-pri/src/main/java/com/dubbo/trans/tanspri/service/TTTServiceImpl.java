package com.dubbo.trans.tanspri.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.trans.tanspri.dao.TTTDao;
import com.trans.api.transapi.api.TTTService;
import com.trans.api.transapi.domain.TTT;
import io.seata.spring.annotation.GlobalTransactional;

import javax.annotation.Resource;

@Service(version = "1.0.0", group = "${registry.group}")
public class TTTServiceImpl implements TTTService {
    @Resource
    TTTDao tttDao;
    @Override
    @GlobalTransactional
    public Integer update(TTT ttt) {
        if (ttt.getId() == 1) {
            throw new RuntimeException("异常异常--提供者");
        }
        return tttDao.update(ttt);

    }
}
