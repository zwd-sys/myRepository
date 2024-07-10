package com;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cdtu.mapper")
public class App02 {
    public static void main(String[] args) {
        SpringApplication.run(App02.class);
    }
}
