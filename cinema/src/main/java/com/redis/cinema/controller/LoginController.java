package com.redis.cinema.controller;
import com.redis.cinema.dto.UserDto;
import com.redis.cinema.service.UserService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor //MemberService에 대한 멤버를 사용 가능
public class LoginController {

    // 생성자 주입
    private final UserService userService;

    // 회원가입 페이지 출력 요청
    @GetMapping("/user/join")
    public String saveForm() {
        return "save";
    }

    // 로그인 페이지
    @PostMapping("/user/login")
    public String save(@ModelAttribute UserDto userDto) {
        userService.save(userDto);
        return "login/login";
    }

}
