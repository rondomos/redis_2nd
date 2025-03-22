package com.redis.movie.repository.dto;

import com.redis.movie.entity.movie.Grade;
import com.redis.movie.entity.movie.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class MoviesNowShowDto {

    private String theaterId;
    private LocalDateTime modifyDate;   // ✅ LocalDateTime 확인!
    private String movieId;
    private String movieNm;
    private Genre genreCd;
    private int showTm;                 // ✅ int인지 확인!
    private String showYn;
    private LocalDateTime openDt;
    private Grade grade;                // ✅ Enum인지 체크!
    private int movieRound;
    private LocalDateTime theaterMovieStartTm;  // ✅ LocalDateTime인지 체크!
    private LocalDateTime theaterMovieEndTm;    // ✅ LocalDateTime인지 체크!
    private int theaterMovieHall;
    private String theaterNm;
    private String screenShowYn;
    private int imgSeq;
    private String imgPath;
    private String imgNm;


    


}