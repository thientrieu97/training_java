package com.beetech.demologin.entity;

import com.beetech.demologin.entity.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Entity
@Table(name = "account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 100)
    private String username;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "verify", nullable = false)
    private boolean verify;

    @Column(name = "blocked", nullable = false)
    private boolean blocked;

    @Column(name = "role", nullable = false, length = 5)
    @Enumerated(EnumType.STRING)
    private Role role;
}
