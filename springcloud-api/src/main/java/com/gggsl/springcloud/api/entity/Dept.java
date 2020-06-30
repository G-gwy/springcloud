package com.gggsl.springcloud.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    //这个数据存在哪个数据库字段 微服务。一个微服务对应一个数据库，同一个信息可能存在不同的数据库
    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
