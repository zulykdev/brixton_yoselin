package com.brixton.demoinput.model.user;

import com.brixton.demoinput.model.ObjectAudit;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    private String phone;
    private UserStatus userStatus;
}
