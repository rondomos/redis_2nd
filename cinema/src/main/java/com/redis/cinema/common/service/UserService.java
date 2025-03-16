package com.redis.cinema.common.service;


import com.redis.cinema.common.dto.UserDto;
import com.redis.cinema.common.entity.User;
import com.redis.cinema.common.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository; //의존성 추가

    //회원가입
    public void join(UserDto userDto) {
        User entity = userDto.toEntity(userDto);
        userRepository.save(entity);
    }

    //아이디중복 벨리데이션
    public int validateUserId(String id) {
        List<User> findId = userRepository.findById(id);

        if(findId !=null && !findId.isEmpty()){
            return 1;  //아이디 중복시 1;
        }
        return 0;      //아이디 중복x 0;
    }
    
    //비밀번호 벨리데이션
    public int pwdMatch(String password1, String password2) {
        if(password1.equals(password2)){
            return 0; // 비밀번호가 같다면 0
        }
        return 1;     // 일치하지 않으면 1
    }


}
