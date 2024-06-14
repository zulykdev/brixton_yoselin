package com.brixton.gestionUsuario.dto.request;

import com.brixton.gestionUsuario.model.role.TypeRole;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class RoleRequestDTO {
    private int id;
    private String nameRole;
}
