package com.redis.cinema.common.repository;

import com.redis.cinema.common.entity.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;
    public void save(User user) {
        em.persist(user);
        em.flush();
    }

    //계정ID 중복 여부
    public List<User> findById(String loginId){
        String jpql = "select m from User m where m.loginId=:loginId";
        List<User> findId = em.createQuery(jpql, User.class).setParameter("loginId", loginId).getResultList();
        return findId;
    }





}
