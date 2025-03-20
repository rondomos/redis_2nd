package com.redis.cinema.common.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "commonImg")
public class Img {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //사용자 입력하는 값 아니면 자동으로 번호 생성
    @Column(name="imgSeq")
    private int imgSeq;

    private String imgNm;
    private String imgPath;

    @Builder
    public Img(String imgNm, String imgPath){
        this.imgNm = imgNm;
        this.imgPath = imgPath;
    }

}
