package com.redis.cinema.movie.entity;
import lombok.*;
import jakarta.persistence.*; //spring boot 3  javax -> jakartr로 바뀜


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movieInfo")
public class MovieInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //사용자 입력하는 값 아니면 자동으로 번호 생성
    @Column(name="movieId")
    private String movieId;

    private int thumImg;
    private String movieNm;
    private String subTitle;
    private String genreCd;
    private String directorNm;
    private String pubDate;
    private String countryCd;
    private String castNm;
    private String movieLink;
    private int movieRate;
    private String openDt;
    private String showTm;
    private String theaterNm;
    private String theaterAddress;
    private int theaterMovieTm;




}
