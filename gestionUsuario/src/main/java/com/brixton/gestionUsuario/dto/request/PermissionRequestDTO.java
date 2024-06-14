package com.brixton.gestionUsuario.dto.request;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class PermissionRequestDTO {
    private int id;
    private String namePermission;
    //private String description;
}
