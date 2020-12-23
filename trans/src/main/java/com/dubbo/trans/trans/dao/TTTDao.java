package com.dubbo.trans.trans.dao;


import com.dubbo.trans.trans.domain.TTT;
import org.apache.ibatis.annotations.Update;

public interface TTTDao {
    @Update("update ttt set c= #{c} where id = #{id}")
    Integer update(TTT ttt);
}
