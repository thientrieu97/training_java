package com.example.demologin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource){
//        UserDetails user = User.builder()
//                .username("trieuuser")
//                .password("$2a$10$GfDv5Kb4T8tAdBy.TaYaOOOIreI6aHOX5NN8.OWMzkdupcr5HlG46") //pass1
//                .roles("USER")
//                .build();
//        UserDetails admin = User.builder()
//                .username("trieuadmin")
//                .password("$2a$10$aNqyoq5jld49uuPbf2eSeOmy2Bz9NGD1TiIqcfhfGU1UAHpitcCKK") //pass2
//                .roles("USER","ADMIN")
//                .build();
//
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.createUser(user);
//        users.createUser(admin);
//        return users;
//    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
        // khi khai bao ham nay se khong can {bcrypt}.... o phia truoc nua
        // password trong DB phai la Encoder
    }
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable()
                .authorizeHttpRequests( request -> request
                        .requestMatchers("/v1/register").permitAll()
                        .requestMatchers("/v1/greeting").authenticated()
                )
                .formLogin();
        return httpSecurity.build();


    }
}
