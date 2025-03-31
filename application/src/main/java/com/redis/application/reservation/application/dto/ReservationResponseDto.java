package com.redis.application.reservation.application.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class ReservationResponseDto {
    private final String cinemaNm;
    private final LocalDateTime movieStartTime;
    private final LocalDateTime movieEndTime;
    private final List<String> reservedSeats;
}
