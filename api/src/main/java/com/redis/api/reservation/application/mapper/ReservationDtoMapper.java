package com.redis.api.reservation.application.mapper;

import com.redis.application.reservation.application.dto.ReservationResponseDto;

public class ReservationDtoMapper {


    public static ReservationResponseDto toReservationResponseDto(ReservationResponseDto serviceReservationResponseDto) {
        return new ReservationResponseDto(serviceReservationResponseDto.getCinemaNm(),
                serviceReservationResponseDto.getMovieStartTime(),
                serviceReservationResponseDto.getMovieEndTime(),
                serviceReservationResponseDto.getReservedSeats()
        );
    }
}
