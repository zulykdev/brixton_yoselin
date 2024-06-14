package com.brixton.gestionUsuario.dto.response;

import com.brixton.gestionUsuario.dto.request.PermissionRequestDTO;
import com.brixton.gestionUsuario.dto.request.RoleRequestDTO;
import com.brixton.gestionUsuario.model.permission.Permission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<RoleRequestDTO> roles;
    private List<PermissionRequestDTO> permissions;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
}
