package com.brixton.demoinput.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;
}
