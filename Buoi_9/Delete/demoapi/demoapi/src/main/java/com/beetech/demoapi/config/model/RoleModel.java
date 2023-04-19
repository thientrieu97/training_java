package com.beetech.demoapi.config.model;

import com.beetech.demoapi.entity.enums.Role;
import org.springframework.security.core.GrantedAuthority;

public class RoleModel implements GrantedAuthority {
    private Role roleId;
    private String roleName;

    public RoleModel(Role roleId) {
        this.roleId = roleId;
        this.roleName = roleId.name().toUpperCase();
    }

    @Override
    public String getAuthority() {
        return roleName;
    }

    public Role getRole() {
        return roleId;
    }

    public void setRole(Role role) {
        this.roleId = role;
    }
}
