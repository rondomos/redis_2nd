CREATE TABLE `theaterMoveTm` (
                                 `theaterId`	varchar(100)	NOT NULL,
                                 `movieId`	varchar(100)	NOT NULL,
                                 `movieRound`	int	NULL,
                                 `theaterMovieStartTm`	dateTIme	NULL,
                                 `theaterMovieEndTm`	dateTIme	NULL,
                                 `theaterMovieHall`	int	NULL,
                                 `theaterNm`	varchar(30)	NULL,
                                 `screenShowYn`	char(1)	NULL
);

CREATE TABLE `userMovieArea` (
                                 `reserId`	varchar(100)	NOT NULL,
                                 `userId`	varchar(100)	NOT NULL,
                                 `movieId`	varchar(100)	NOT NULL
);

CREATE TABLE `commonImg` (
                             `imgSeq`	int	NOT NULL,
                             `imgNm`	varchar(50)	NULL,
                             `imgPath`	text	NULL
);

CREATE TABLE `movieAPI` (
                            `docid`	varchar(20)	NOT NULL,
                            `movieSeq`	int	NULL,
                            `title`	varchar(50)	NULL,
                            `titleEng`	varchar(50)	NULL,
                            `titleEtc`	varchar(50)	NULL,
                            `directorNm`	varchar(20)	NULL,
                            `directorId`	int	NULL,
                            `actorNm`	varchar(20)	NULL,
                            `nation`	varchar(10)	NULL,
                            `company`	varchar(20)	NULL,
                            `prodYear`	datetime	NULL,
                            `plot`	text	NULL,
                            `runtime`	datetime	NULL,
                            `rating`	varchar(10)	NULL,
                            `genre`	varchar(20)	NULL,
                            `kmdbUrl`	text	NULL,
                            `type`	varchar(10)	NULL,
                            `use`	varchar(10)	NULL,
                            `episodes`	text	NULL,
                            `ratedYn`	char(1)	NULL,
                            `repRatDate`	datetime	NULL,
                            `repRlsDate`	datetime	NULL,
                            `ratingGrade`	varchar(10)	NULL,
                            `releaseDate`	datetime	NULL,
                            `keywords`	varchar(50)	NULL,
                            `posterUrl`	text	NULL,
                            `staffRoleGroup`	varchar(10)	NULL,
                            `StaffRole`	varchar(30)	NULL,
                            `StaffEtc`	text	NULL,
                            `openThtr`	varchar(20)	NULL,
                            `screenArea`	varchar(50)	NULL,
                            `screenCnt`	int	NULL,
                            `audiAcc`	int	NULL
);

CREATE TABLE `movieUser` (
                             `userId`	varchar(100)	NOT NULL,
                             `userImg`	int	NOT NULL,
                             `loginId`	varchar(50)	NULL,
                             `pwd`	varchar(50)	NULL,
                             `userNm`	varchar(20)	NULL,
                             `phoneNum01`	varchar(5)	NULL,
                             `phoneNum02`	varchar(10)	NULL,
                             `phoneNum03`	varchar(10)	NULL,
                             `address01`	varchar(500)	NULL,
                             `address02`	varchar(100)	NULL,
                             `address03`	varchar(10)	NULL,
                             `useYn`	char(1)	NULL,
                             `createDate`	datetime	NULL,
                             `lastLoginDate`	datetime	NULL,
                             `email01`	varchar(15)	NULL,
                             `email02`	varchar(10)	NULL,
                             `role`	varchar(10)	NULL
);

CREATE TABLE `movieReser` (
                              `reserId`	varchar(100)	NOT NULL,
                              `seatId`	varchar(100)	NULL,
                              `seatLv`	varchar(20)	NULL,
                              `loginId`	varchar(50)	NULL,
                              `reserTm`	datetime	NULL,
                              `reserCd`	varchar(20)	NULL
);

CREATE TABLE `movieInfo` (
                             `movieId`	varchar(100)	NOT NULL,
                             `thumImg`	int	NOT NULL,
                             `theaterCd`	varchar(50)	NULL,
                             `movieNm`	varchar(50)	NULL,
                             `subTitle`	varchar(50)	NULL,
                             `genreCd`	varchar(20)	NULL,
                             `directorNm`	varchar(10)	NULL,
                             `pubDate`	datetime	NULL,
                             `countryCd`	varchar(20)	NULL,
                             `castNm`	varchar(20)	NULL,
                             `movieLink`	text	NULL,
                             `movieRate`	decimal(15,2)	NULL,
                             `openDt`	datetime	NULL,
                             `showTm`	int	NULL,
                             `showYN`	char(1)	NULL,
                             `createDate`	datetime	NULL,
                             `modifyDate`	datetime	NULL,
                             `genreNm`	varchar(20)	NULL,
                             `grade`	varchar(10)	NULL
);

ALTER TABLE `theaterMoveTm` ADD CONSTRAINT `PK_THEATERMOVETM` PRIMARY KEY (
                                                                           `theaterId`
    );

ALTER TABLE `userMovieArea` ADD CONSTRAINT `PK_USERMOVIEAREA` PRIMARY KEY (
                                                                           `reserId`
    );

ALTER TABLE `commonImg` ADD CONSTRAINT `PK_COMMONIMG` PRIMARY KEY (
                                                                   `imgSeq`
    );

ALTER TABLE `movieAPI` ADD CONSTRAINT `PK_MOVIEAPI` PRIMARY KEY (
                                                                 `docid`
    );

ALTER TABLE `movieUser` ADD CONSTRAINT `PK_MOVIEUSER` PRIMARY KEY (
                                                                   `userId`
    );

ALTER TABLE `movieReser` ADD CONSTRAINT `PK_MOVIERESER` PRIMARY KEY (
                                                                     `reserId`
    );

ALTER TABLE `movieInfo` ADD CONSTRAINT `PK_MOVIEINFO` PRIMARY KEY (
                                                                   `movieId`
    );

ALTER TABLE `userMovieArea` ADD CONSTRAINT `FK_movieReser_TO_userMovieArea_1` FOREIGN KEY (
                                                                                           `reserId`
    )
    REFERENCES `movieReser` (
                             `reserId`
        );

