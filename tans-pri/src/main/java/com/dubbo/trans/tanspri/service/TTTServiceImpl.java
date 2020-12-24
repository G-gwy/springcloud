package com.dubbo.trans.tanspri.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.trans.tanspri.dao.TTTDao;
import com.trans.api.transapi.api.TTTService;
import com.trans.api.transapi.domain.TTT;

import javax.annotation.Resource;

@Service(version = "1.0.0", group = "SEATA_GROUP")
public class TTTServiceImpl implements TTTService {
    @Resource
    TTTDao tttDao;
    @Override
    public Integer update(TTT ttt) {
        return tttDao.update(ttt);

    }
}
