package com.brixton.gestionUsuario.model.permission;

import com.brixton.gestionUsuario.model.role.Role;
import com.brixton.gestionUsuario.model.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class Permission {
    private int id;
    private TypePermission namePermission;
   // private String description;
    //private List<Role> roles;
}
