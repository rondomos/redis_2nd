package com.redis.movie.repository;

import com.redis.movie.repository.dto.MoviesNowShowDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.redis.movie.entity.movie.Movie;

import java.time.LocalDateTime;
import java.util.List;



public interface MovieRepository extends JpaRepository<Movie,Long> {


    @Query("SELECT new com.redis.movie.repository.dto.MoviesNowShowDto( " +
            "tmt.theaterId, " +
            "CAST(mv.modifyDate AS java.time.LocalDateTime), " +
            "CAST(mv.openDt AS java.time.LocalDateTime), " +
            "CAST(mv.modifyDate AS java.time.LocalDateTime), " +
            "CAST(mv.theaterMovieStartTm AS java.time.LocalDateTime), " +
            "CAST(mv.theaterMovieEndTm AS java.time.LocalDateTime), " +
            "mv.movieId, mv.movieNm, mv.genreCd, " +
            "CAST(mv.showTm AS int), " +
            "mv.showYn, mv.grade, " +
            "tmt.movieRound, " +
            "tmt.theaterMovieHall, tmt.theaterNm, tmt.screenShowYn, " +
            "imgPic.imgSeq, imgPic.imgPath, imgPic.imgNm) " +
            "FROM Movie mv " +
            "LEFT JOIN Screening tmt ON mv.movieId = tmt.movieId " +
            "LEFT JOIN ImagePic imgPic ON mv.thumImg = imgPic.imgSeq " +
            "WHERE tmt.theaterMovieStartTm >= :now")


    List<MoviesNowShowDto> findNowShowing(LocalDateTime now);

}
