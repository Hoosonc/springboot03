package com.hxc.springboot03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@MapperScan({"com.**.dao","com.**.dao.*"})
@ServletComponentScan
@SpringBootApplication
public class Springboot03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

}
