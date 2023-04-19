package com.beetech.demoapi.service;

import com.beetech.demoapi.model.JwtTokenModel;

public interface IAuthService {
    JwtTokenModel login(String username, String password);
}