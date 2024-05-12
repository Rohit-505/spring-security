package com.iam.springsecurity.services;

import com.iam.springsecurity.requests.UserCredentials;

public interface AuthService {

    Object validateUser(UserCredentials credentials);

}
