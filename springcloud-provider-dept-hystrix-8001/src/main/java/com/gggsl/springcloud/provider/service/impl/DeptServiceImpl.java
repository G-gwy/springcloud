package com.gggsl.springcloud.provider.service.impl;

import com.gggsl.springcloud.api.entity.Dept;
import com.gggsl.springcloud.provider.dao.DeptDao;
import com.gggsl.springcloud.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public Integer addDept(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public List<Dept> listDept() {
        return deptDao.selectAll();
    }

    @Override
    public Dept get(Long id) {
        Dept dept = deptDao.selectOne(new Dept().setDeptNo(id));
        if (dept == null) {
            throw new RuntimeException("错误");
        } else return dept;
    }
}
