package com.iam.springsecurity.services.impl;

import com.iam.springsecurity.entity.Users;
import com.iam.springsecurity.services.CustomUserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserServiceImpl implements CustomUserService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("admin")){
            return getDemoUser();
        }
        else throw new UsernameNotFoundException("User not found");
    }

    private UserDetails getDemoUser() {

        return Users.builder()
                .username("admin")
                .password(new BCryptPasswordEncoder().encode("admin"))
                .isEnabled(true)
                .isAccountNonExpired(true)
                .isAccountNonLocked(true)
                .isAccountNonExpired(true)
                .build();

    }
}
