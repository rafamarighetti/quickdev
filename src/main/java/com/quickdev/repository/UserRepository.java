package com.quickdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quickdev.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public default User findUserByEmail(String email){
        User user = new User(email, "123456");
        user.setName("Name");
        return user;
    }
}
