package com.redis.cinema.entity;
import lombok.*;
import jakarta.persistence.*; //spring boot 3  javax -> jakartr로 바뀜


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movieGenreCd")
public class MovieGenreCd {
    @Id
    @Column(name="gnreCd")
    private String gnreCd;
    private String genreNm;


}
