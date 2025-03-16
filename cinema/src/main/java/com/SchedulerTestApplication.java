package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling    // 추가된 어노테이션
public class SchedulerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulerTestApplication.class, args);
    }

}
