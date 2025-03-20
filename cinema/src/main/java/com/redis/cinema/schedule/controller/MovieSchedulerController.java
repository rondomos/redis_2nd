package com.redis.cinema.schedule.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@EnableScheduling
@RequiredArgsConstructor
public class MovieSchedulerController {

    @Scheduled(cron ="0 0 13 * * *")
    public void movieApi01() {
    }

    @Scheduled(cron ="0 10 13 * * *")
    public void movieApi02() {

    }


}
