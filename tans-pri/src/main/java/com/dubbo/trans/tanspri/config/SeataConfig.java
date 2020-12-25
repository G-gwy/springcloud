package com.dubbo.trans.tanspri.config;

import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

//@Configuration
public class SeataConfig {

    @Primary
    @Bean("dataSource")
    public DataSourceProxy dataSource(DataSource druidDataSource) {
        //AT 代理 二选一
        return new DataSourceProxy(druidDataSource);
        //XA 代理
        //return new DataSourceProxyXA(druidDataSource);
    }

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {

        return new GlobalTransactionScanner("seata-trans-pri", "my_test_tx_group");
    }
}
