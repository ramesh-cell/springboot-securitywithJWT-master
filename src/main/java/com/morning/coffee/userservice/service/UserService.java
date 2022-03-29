package com.morning.coffee.userservice.service;

import java.util.List;

import com.morning.coffee.userservice.domain.Role;
import com.morning.coffee.userservice.domain.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
