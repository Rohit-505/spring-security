package com.iam.springsecurity.services.impl;

import com.iam.springsecurity.requests.UserCredentials;
import com.iam.springsecurity.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public Object validateUser(UserCredentials credentials) {
        return null;
    }
}
