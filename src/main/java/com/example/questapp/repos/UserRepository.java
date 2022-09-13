package com.example.questapp.repos;

import com.example.questapp.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUserName(String userName);
}
