package com.gggsl.springcloud.provider.service;

import com.gggsl.springcloud.api.entity.Dept;

import java.util.List;

public interface DeptService {
    Integer addDept(Dept dept);

    List<Dept> listDept();

}
