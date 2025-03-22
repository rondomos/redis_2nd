package com.redis.movie.entity.movie;

import jakarta.persistence.*;
import com.redis.BaseEntity;
import java.time.LocalDateTime;

@Entity
@Table(name = "theaterMoveTm")
public class Screening extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String theaterId;

    private String movieId;
    private int movieRound;
    private LocalDateTime theaterMovieStartTm;
    private LocalDateTime theaterMovieEndTm;
    private int theaterMovieHall;
    private String theaterNm;
    private String screenShowYn;
}
