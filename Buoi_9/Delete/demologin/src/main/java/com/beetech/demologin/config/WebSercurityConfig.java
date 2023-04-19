package com.beetech.demologin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSercurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
//                .csrf().disable()
                .authorizeHttpRequests(request -> request
//                        .requestMatchers("/api/auth/**").permitAll() // api
                                .requestMatchers("/auth/**").permitAll()
                                .anyRequest().authenticated()
                );
        http
                .formLogin(form -> form.usernameParameter("username").passwordParameter("password")
                        .loginPage("/login")                                  //trang đăng nhập tùy chỉnh
                        .loginProcessingUrl("/auth/login")                    //URL để submit username và password
                        .failureUrl("/login?error=true")    //trang đích sau khi đăng nhập không thành công
                        .defaultSuccessUrl("/", true).permitAll());  //trang đích sau khi đăng nhập thành công
//        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class); // api

        return http.build();
    }
}
