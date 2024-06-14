package com.brixton.gestionUsuario.service;

import com.brixton.gestionUsuario.dto.request.UserGenericRequestDTO;
import com.brixton.gestionUsuario.model.permission.Permission;
import com.brixton.gestionUsuario.model.role.Role;

import java.util.List;

public interface UserService {
    Object createUser(UserGenericRequestDTO inputUser);
    Object getUserById(int idUser);
    Object updateUser(int idUser,UserGenericRequestDTO user);
    List<String> getListRoles(int idUser);
    List<String> getListPermission(int idUser);

}
