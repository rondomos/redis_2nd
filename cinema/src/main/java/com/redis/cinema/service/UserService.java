package com.redis.cinema.service;


import com.redis.cinema.dto.UserDto;
import com.redis.cinema.entity.User;
import com.redis.cinema.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository; //의존성 추가

    public void save(UserDto userDto) {
        User userEntity = User.toUserEntity(userDto);
        userRepository.save(userEntity);

    }

}
