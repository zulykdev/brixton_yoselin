package com.brixton.demoinput.dto.response.request;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class UserGenericRequestDTO {

    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;

}
