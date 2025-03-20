package com.redis.cinema.common.entity;

import com.redis.cinema.common.dto.UserDto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import jakarta.persistence.*; //spring boot 3  javax -> jakartr로 바뀜


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movieUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //사용자 입력하는 값 아니면 자동으로 번호 생성
    @Column(name="userId")
    private String userId;
    private String userNm;
    private String loginId;
    private String pwd;

    private int phoneNum01;
    private int phoneNum02;
    private int phoneNum03;

    private String address01;
    private String address02;
    private String address03;

    private String email01;
    private String email02;

    private String userImg; //이미지
    private String createDate; //생성날짜
    private String lastLoginDate; //마지막으로 로그인한 날짜
    private String useYn; //사용여부

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public User(String userId, String userNm, String loginId, String pwd, int phoneNum01, int phoneNum02, int phoneNum03, String address01, String address02, String address03, String email01, String email02, String userImg, String createDate, String lastLoginDate, String useYn, Role role) {
        this.userId = userId;
        this.userNm = userNm;
        this.loginId = loginId;
        this.pwd = pwd;
        this.phoneNum01 = phoneNum01;
        this.phoneNum02 = phoneNum02;
        this.phoneNum03 = phoneNum03;
        this.address01 = address01;
        this.address02 = address02;
        this.address03 = address03;
        this.email01 = email01;
        this.email02 = email02;
        this.userImg = userImg;
        this.createDate = createDate;
        this.lastLoginDate = lastLoginDate;
        this.useYn = useYn;
        this.role = role;
    }

}
