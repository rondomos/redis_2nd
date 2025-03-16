package com.redis.cinema.movie.entity;
import lombok.*;
import jakarta.persistence.*; //spring boot 3  javax -> jakartr로 바뀜


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movieGenreCd")
public class MovieGenreCd {
    @Id
    @Column(name="gnreCd")
    private String gnreCd; //장르코드
    private String genreNm; //장르이름

    @Builder
    public MovieGenreCd(String gnreCd, String genreNm) {
        this.gnreCd = gnreCd;
        this.genreNm = genreNm;
    }


}
