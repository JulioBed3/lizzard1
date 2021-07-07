package com.unal.lizzard1.service;

import com.unal.lizzard1.model.User;
import com.unal.lizzard1.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}
