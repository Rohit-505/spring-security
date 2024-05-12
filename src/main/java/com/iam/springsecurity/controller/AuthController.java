package com.iam.springsecurity.controller;


import com.iam.springsecurity.requests.UserCredentials;
import com.iam.springsecurity.services.AuthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/security")
public class AuthController {

    //Direct Grant access on user credentials

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/token")
    public Object token(UserCredentials credentials){
        return authService.validateUser(credentials);
    }
}
