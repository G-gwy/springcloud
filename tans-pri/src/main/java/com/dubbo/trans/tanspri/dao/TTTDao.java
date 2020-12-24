package com.dubbo.trans.tanspri.dao;


import com.trans.api.transapi.domain.TTT;
import org.apache.ibatis.annotations.Update;

public interface TTTDao {
    @Update("update ttt set c= #{c} where id = #{id}")
    Integer update(TTT ttt);
}
