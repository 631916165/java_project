package com.example.personmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.personmanage.mapper")
public class PersonManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonManageApplication.class, args);
    }

}
