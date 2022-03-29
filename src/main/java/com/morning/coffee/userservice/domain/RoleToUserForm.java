package com.morning.coffee.userservice.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class RoleToUserForm {
	 
    private String username;
    private String roleName;
}
