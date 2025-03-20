package com.redis.cinema.common.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "movie_api")
public class MovieApiEntity {
    @Id
    @Size(max = 20)
    @NotNull
    @Column(name = "docid", nullable = false, length = 20)
    private String docid;

    @Column(name = "movieSeq")
    private Integer movieSeq;

    @Size(max = 50)
    @Column(name = "title", length = 50)
    private String title;

    @Size(max = 50)
    @Column(name = "titleEng", length = 50)
    private String titleEng;

    @Size(max = 50)
    @Column(name = "titleEtc", length = 50)
    private String titleEtc;

    @Size(max = 20)
    @Column(name = "directorNm", length = 20)
    private String directorNm;

    @Column(name = "directorId")
    private Integer directorId;

    @Size(max = 20)
    @Column(name = "actorNm", length = 20)
    private String actorNm;

    @Size(max = 10)
    @Column(name = "nation", length = 10)
    private String nation;

    @Size(max = 20)
    @Column(name = "company", length = 20)
    private String company;

    @Column(name = "prodYear")
    private Instant prodYear;

    @Lob
    @Column(name = "plot")
    private String plot;

    @Column(name = "runtime")
    private Instant runtime;

    @Size(max = 10)
    @Column(name = "rating", length = 10)
    private String rating;

    @Size(max = 20)
    @Column(name = "genre", length = 20)
    private String genre;

    @Lob
    @Column(name = "kmdbUrl")
    private String kmdbUrl;

    @Size(max = 10)
    @Column(name = "type", length = 10)
    private String type;

    @Size(max = 10)
    @Column(name = "`use`", length = 10)
    private String use;

    @Lob
    @Column(name = "episodes")
    private String episodes;

    @Column(name = "ratedYn")
    private Character ratedYn;

    @Column(name = "repRatDate")
    private Instant repRatDate;

    @Column(name = "repRlsDate")
    private Instant repRlsDate;

    @Size(max = 10)
    @Column(name = "ratingGrade", length = 10)
    private String ratingGrade;

    @Column(name = "releaseDate")
    private Instant releaseDate;

    @Size(max = 50)
    @Column(name = "keywords", length = 50)
    private String keywords;

    @Lob
    @Column(name = "posterUrl")
    private String posterUrl;

    @Size(max = 10)
    @Column(name = "staffRoleGroup", length = 10)
    private String staffRoleGroup;

    @Size(max = 30)
    @Column(name = "StaffRole", length = 30)
    private String staffRole;

    @Lob
    @Column(name = "StaffEtc")
    private String staffEtc;

    @Size(max = 20)
    @Column(name = "openThtr", length = 20)
    private String openThtr;

    @Size(max = 50)
    @Column(name = "screenArea", length = 50)
    private String screenArea;

    @Column(name = "screenCnt")
    private Integer screenCnt;

    @Column(name = "audiAcc")
    private Integer audiAcc;

}