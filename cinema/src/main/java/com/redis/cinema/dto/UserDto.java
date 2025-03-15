package com.redis.cinema.dto;

import com.redis.cinema.entity.User;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto {
    private String userId;
    private String userNm;
    private String userImg;
    private String loginId;
    private String pwd;
    private int phoneNum01;
    private int phoneNum02;
    private int phoneNum03;
    private String address01;
    private String address02;
    private String useYn;
    private String createDate;
    private String lastLoginDate;
    private String email01;
    private String email02;


    // 여기가 getter setter역할 하는 듯....
    public static UserDto toUserDto(User userEntity){
        UserDto userDto = new UserDto();
        userDto.setLoginId(userEntity.getLoginId());
        userDto.setEmail01(userEntity.getEmail01());
        userDto.setEmail02(userEntity.getEmail02());
        userDto.setUserNm(userEntity.getUserNm());
        userDto.setPwd(userEntity.getPwd());
        return userDto;
    }

}
