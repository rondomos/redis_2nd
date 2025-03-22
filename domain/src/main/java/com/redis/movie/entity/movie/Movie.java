package com.redis.movie.entity.movie;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import com.redis.BaseEntity;

@Entity
@Table(name = "movieInfo")
public class Movie extends BaseEntity {
    @Id
    private String theaterId;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Enumerated(EnumType.STRING)
    private Grade grade;

    private String movieId;
    private String movieNm;
    private String genreCd;
    private int showTm;
    private String showYn;
    private String  openDt;
    private int movieRound;
    private String theaterMovieStartTm;
    private String theaterMovieEndTm;
    private int theaterMovieHall;
    private String theaterNm;
    private int thumImg;
    private LocalDateTime modifyDate;
    private String imgPath;
    private String imgNm;





}
