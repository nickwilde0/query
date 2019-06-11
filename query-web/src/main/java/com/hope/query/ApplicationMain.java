package com.hope.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Date;

/**
 * @Description SpringBoot启动入口
 * @Date：Created in 下午23:45 2019/6/4
 */
@EnableConfigurationProperties
@SpringBootApplication(exclude = {KafkaAutoConfiguration.class})
@EnableAsync
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
        System.out.println("########Spring Boot start time:"+new Date()+"########");
        System.out.println("Server startup");
    }
}
