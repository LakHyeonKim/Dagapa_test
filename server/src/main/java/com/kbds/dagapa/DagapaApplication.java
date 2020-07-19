package com.kbds.dagapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kbds")   //하위 폴더를 디폴트로 스캔!!!
public class DagapaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DagapaApplication.class, args);
    }
}
