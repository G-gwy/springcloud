package com.dubbo.trans.trans;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
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
@EnableDubbo(scanBasePackages = "com.dubbo.trans.trans.service")
//@NacosPropertySource(dataId = "wetland-application.properties", groupId = "1.0.0", first = true)
@MapperScan("com.dubbo.trans.trans.dao")
@ComponentScan(basePackages = { "com.dubbo.trans"})
//@EnableAutoDataSourceProxy
public class TransApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TransApplication.class, args);
        //new CountDownLatch(1).await();
    }

}
