package com.brixton.gestionUsuario.model.role;

import com.brixton.gestionUsuario.model.permission.Permission;
import com.brixton.gestionUsuario.model.user.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class Role {
    private int id;
    private TypeRole nameRole;
    //private List<Permission>permissions;

}

