package com.sws.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sws.springboot.**.dao")
public class MyApplication {
    public static void main(String[] args){
        SpringApplication.run(MyApplication.class,args);
    }
}
