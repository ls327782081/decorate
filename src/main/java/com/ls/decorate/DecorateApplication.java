package com.ls.decorate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ls.decorate.**.mapper")
public class DecorateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorateApplication.class, args);
    }
}
