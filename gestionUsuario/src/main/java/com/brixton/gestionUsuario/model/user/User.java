package com.brixton.gestionUsuario.model.user;

import com.brixton.gestionUsuario.model.ObjectAudit;
import com.brixton.gestionUsuario.model.permission.Permission;
import com.brixton.gestionUsuario.model.role.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class User extends ObjectAudit {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Role> roles;
    private List<Permission> permissions;

}
