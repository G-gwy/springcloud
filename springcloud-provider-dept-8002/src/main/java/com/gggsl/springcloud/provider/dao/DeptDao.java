package com.gggsl.springcloud.provider.dao;

import com.gggsl.springcloud.api.entity.Dept;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface DeptDao extends Mapper<Dept> {
    //boolean addDept(Dept dept);
}
