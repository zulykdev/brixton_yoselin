package com.brixton.demoinput.service;

import com.brixton.demoinput.dto.request.UserGenericRequestDTO;

import java.util.List;

public interface UserService {

    Object createUser(UserGenericRequestDTO inputUser);
    List<Object> createWithList(List<UserGenericRequestDTO> users);
    Object updateUser(String username, UserGenericRequestDTO userActualizar);
    Object getUsername(String username);
    Object deleteUser(String username);
    Object login(String username, String password);
    Boolean logout(String username);
}
