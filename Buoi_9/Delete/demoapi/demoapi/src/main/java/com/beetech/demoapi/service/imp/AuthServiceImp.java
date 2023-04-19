package com.beetech.demoapi.service.imp;

import com.beetech.demoapi.jwt.JwtTokenProvider;
import com.beetech.demoapi.model.JwtTokenModel;
import com.beetech.demoapi.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements IAuthService {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public JwtTokenModel login(String username, String password) {
        authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        return new JwtTokenModel(jwtTokenProvider.generateToken(username), jwtTokenProvider.getExpiredTime());
    }
}

