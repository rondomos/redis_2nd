package com.redis.cinema.common.dto;

import com.redis.cinema.common.entity.Role;
import com.redis.cinema.common.entity.User;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
public class UserDto {

    private String userId;
    @NotBlank(message = "성명을 입력해주세요")
    private String userNm;

    @NotBlank(message = "로그인아이디를 입력해주세요")
    private String loginId;

    @NotBlank(message = "비밀번호를 입력해주세요")
    private String pwd;

    @NotBlank(message = "핸드폰번호를 입력해주세요")
    private int phoneNum01;
    private int phoneNum02;
    private int phoneNum03;

    @NotBlank(message = "주소를 입력해주세요")
    private String address01;
    private String address02;
    private String address03;

    @NotBlank(message = "이메일을 입력해주세요")
    private String email01;
    private String email02;

    private String userImg; //이미지
    private String createDate; //생성날짜
    private String lastLoginDate; //마지막으로 로그인한 날짜
    private String useYn; //사용여부

    private Role role; //역할(관리자, 사용자 여부)


    @Builder
    public UserDto(String userId, String userNm, String loginId, String pwd, int phoneNum01, int phoneNum02, int phoneNum03, String address01, String address02, String address03, String email01, String email02, String userImg, String createDate, String lastLoginDate, String useYn, Role role) {
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



    // DTO안에 toEntity와  FromEntity를 다 만들어야함(의존성 한방향으로 만들기 위함:순환참조방지)
    public User toEntity(UserDto userDto) {
        User entity = User.builder()
                .userId(userDto.userId)
                .userNm(userDto.userNm)
                .loginId(userDto.loginId)
                .pwd(userDto.pwd)
                .phoneNum01(userDto.phoneNum01)
                .phoneNum02(userDto.phoneNum02)
                .phoneNum03(userDto.phoneNum03)
                .address01(userDto.address01)
                .address02(userDto.address02)
                .address03(userDto.address03)
                .email01(userDto.email01)
                .email02(userDto.email02)
                .userImg(userDto.userImg)
                .createDate(userDto.createDate)
                .lastLoginDate(userDto.lastLoginDate)
                .useYn(userDto.useYn)
                .role(userDto.role)

                .build();
        return entity;
    }


    // entiry에서 DTO로 변환하는 역할 == fromEntity == ofEntity
    // 주로 entity를 조회한 결과를 클라이언트로 전송 또는 DTO로 변환하여 컨트롤러에 전달
    // entity에서 필요한 필드값을 DTO에 설정하여 반환한다
    public UserDto ofEntity (User user){
        UserDto dto = UserDto.builder()
                .userId(user.getUserId())
                .userNm(user.getUserNm())
                .userImg(user.getUserImg())
                .loginId(user.getLoginId())
                .pwd(user.getPwd())
                .phoneNum01(user.getPhoneNum01())
                .phoneNum02(user.getPhoneNum02())
                .phoneNum03(user.getPhoneNum03())
                .address01(user.getAddress01())
                .address02(user.getAddress02())
                .address03(user.getAddress03())
                .email01(user.getEmail01())
                .email02(user.getEmail02())
                .createDate(user.getCreateDate())
                .lastLoginDate(user.getLastLoginDate())
                .useYn(user.getUseYn())
                .role(user.getRole())

                .build();
        return dto;
    }

}
