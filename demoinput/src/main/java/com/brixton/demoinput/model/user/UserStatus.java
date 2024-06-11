package com.brixton.demoinput.model.user;

public enum UserStatus {
    INACTIVE(0),
    ACTIVE(1);


    private Integer status;

    UserStatus(Integer status) {
        this.status = status;
    }

    Integer getStatus() {
        return this.status;
    }
}
