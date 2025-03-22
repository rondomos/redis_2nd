package com.redis.reservation.entity;

import com.redis.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;


@Entity
public class Reservation extends BaseEntity {
    @Id
    private String reserId;
    private String seatId;
    private String loginId;
    private LocalDateTime reserTm;
    private LocalDateTime reserveAt;
    private LocalDateTime reserCd;
}
