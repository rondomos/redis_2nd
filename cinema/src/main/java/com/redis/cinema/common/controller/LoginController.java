package com.redis.cinema.common.controller;
import com.redis.cinema.common.dto.UserDto;
import com.redis.cinema.common.service.UserService;
import jakarta.validation.Valid;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
public class LoginController {

    // 생성자 주입
    private final UserService userService;

    // 홈 메핑
    @GetMapping("/")
    public String defaultHome() {
        return "home";
    }

    // 로그인 화면
    @GetMapping("/join")
    public String defaultJoin() {
        return "user/join";
    }

    //신규가입 신청
    @RequestMapping("/signUp")
    public String join(@Valid UserDto userDto, BindingResult bindingResult){

        if(bindingResult.hasErrors()){ //문제생기면 다시 로그인화면으로
            return "user/join";

        } else { //회원가입
            userService.join(userDto);
        }

        return  "user/complete";
    }


    //아이디 중복체크
    @RequestMapping("/checkDuplicateId")
    public int checkDuplicateId(@RequestParam("loginId") String loginId,BindingResult bindingResult){
        int id = 0;

        try {
            id = userService.validateUserId(loginId);
            if(id == 0){
                bindingResult.rejectValue("loginId","duplicate.loginId","아이디가 중복되었습니다.");
            }
        }catch (Exception e){
            e.getStackTrace();

        }

        return id;
    }

    //비밀번호 일치체크
    @RequestMapping("/checkMatchPwd")
    public int checkMatchPassword(
            @RequestParam("pwd01") String password1,
            @RequestParam("pwd02")String password2,
            BindingResult bindingResult){
        int password = 0;
        try {
            password = userService.pwdMatch(password1, password2);
            if(password == 0){
                bindingResult.rejectValue("pwd2","duplicate.password","비밀번호가 일치하지 않습니다.");
            }
        }catch (Exception e){
            e.getStackTrace();

        }


        return password;
    }


}
