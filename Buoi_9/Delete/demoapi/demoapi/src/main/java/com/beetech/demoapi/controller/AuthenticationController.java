package com.beetech.demoapi.controller;

import com.beetech.demoapi.jwt.JwtTokenProvider;
import com.beetech.demoapi.model.ApiResponse;
import com.beetech.demoapi.model.JwtTokenModel;
import com.beetech.demoapi.service.IAuthService;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@RequestParam("username") String username, @RequestParam("password") String password) {
        JwtTokenModel jwtTokenProvider = authService.login(username, password);

        // Nếu tìm thấy return 200 OK
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK.value(), true, "", jwtTokenProvider));
    }

    @PostMapping("/test")
    public ResponseEntity<ApiResponse> test() {
        return ResponseEntity.ok(new ApiResponse(true, "Test successfully"));
    }

    @GetMapping("test")
    public ResponseEntity<ApiResponse> testGet() {
        return ResponseEntity.ok(new ApiResponse(true, "Test successfully"));
    }

}
