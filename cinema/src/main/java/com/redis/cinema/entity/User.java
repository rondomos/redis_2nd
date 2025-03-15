package com.redis.cinema.entity;

import com.redis.cinema.dto.UserDto;
import lombok.*;
import jakarta.persistence.*; //spring boot 3  javax -> jakartr로 바뀜


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movieUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //사용자 입력하는 값 아니면 자동으로 번호 생성
    @Column(name="userId")
    private String userId;

    @Column
    private String userNm;
    @Column
    private String userImg;
    @Column
    private String loginId;
    @Column
    private String pwd;
    @Column
    private int phoneNum01;
    @Column
    private int phoneNum02;
    @Column
    private int phoneNum03;
    @Column
    private String address01;
    @Column
    private String address02;
    @Column
    private String useYn;
    @Column
    private String createDate;
    @Column
    private String lastLoginDate;
    @Column
    private String email01;
    @Column
    private String email02;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userNm='" + userNm + '\'' +
                ", userImg='" + userImg + '\'' +
                ", loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phoneNum01=" + phoneNum01 +
                ", phoneNum02=" + phoneNum02 +
                ", phoneNum03=" + phoneNum03 +
                ", address01='" + address01 + '\'' +
                ", address02='" + address02 + '\'' +
                ", useYn='" + useYn + '\'' +
                ", createDate='" + createDate + '\'' +
                ", lastLoginDate='" + lastLoginDate + '\'' +
                ", email01='" + email01 + '\'' +
                ", email02='" + email02 + '\'' +
                '}';
    }

    public static User toUserEntity(UserDto userdto) {
        User user = new User();
        user.setUserId(userdto.getUserId());
        user.setUserNm(userdto.getUserNm());
        user.setUserImg(userdto.getUserImg());
        user.setLoginId(userdto.getLoginId());
        user.setPwd(userdto.getPwd());
        user.setPhoneNum01(userdto.getPhoneNum01());
        user.setPhoneNum02(userdto.getPhoneNum02());
        user.setPhoneNum03(userdto.getPhoneNum03());
        user.setAddress01(userdto.getAddress01());
        user.setAddress02(userdto.getAddress02());
        user.setUseYn(userdto.getUseYn());
        user.setCreateDate(userdto.getCreateDate());
        user.setLastLoginDate(userdto.getLastLoginDate());
        user.setEmail01(userdto.getEmail01());
        user.setEmail02(userdto.getEmail02());
        return user;
    }

}
