package com.brixton.gestionUsuario.dto.request;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class UserGenericRequestDTO {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<RoleRequestDTO> roles;
    private List<PermissionRequestDTO> permissions;

}
