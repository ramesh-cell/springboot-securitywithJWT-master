package com.morning.coffee.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morning.coffee.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
