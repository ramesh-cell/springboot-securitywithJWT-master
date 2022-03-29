package com.morning.coffee.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morning.coffee.userservice.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
