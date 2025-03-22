package com.redis.movie.entity.movie;

import jakarta.persistence.*;
import com.redis.BaseEntity;

@Entity
@Table(name = "commonImg")
public class ImagePic extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imgSeq;
    private String imgPath;
    private String imgNm;



}
