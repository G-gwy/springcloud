package com.dubbo.trans.tanspri;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ConfigurationPropertiesScan
@ImportResource({"classpath:rpc/*.xml"})
@EnableDubbo(scanBasePackages = "com.dubbo.trans.tanspri.service")
//@NacosPropertySource(dataId = "wetland-application.properties", groupId = "1.0.0", first = true)
@MapperScan("com.dubbo.trans.tanspri.dao")
@ComponentScan(basePackages = { "com.dubbo.trans"})
//@EnableAutoDataSourceProxy
public class TansPriApplication {

    public static void main(String[] args)throws InterruptedException {
        SpringApplication.run(TansPriApplication.class, args);
        new CountDownLatch(1).await();
    }

}
