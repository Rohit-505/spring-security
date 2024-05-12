package com.iam.springsecurity.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;


@Getter
@Setter
@Builder
public class Users implements UserDetails {


    private String username;
    private String password;
    private Set<GrantedAuthority> authorities;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;

    //This is default user class for which we can use as entity and save it to database.
}
