package com.brixton.gestionUsuario.controller;

import com.brixton.gestionUsuario.dto.request.UserGenericRequestDTO;
import com.brixton.gestionUsuario.model.permission.Permission;
import com.brixton.gestionUsuario.model.role.Role;
import com.brixton.gestionUsuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<Object> createUser(@RequestBody UserGenericRequestDTO user){

        return ResponseEntity.ok(userService.createUser(user));

    }
    @GetMapping("/{idUser}")
    public ResponseEntity<Object> getUserById(@PathVariable int idUser){
        Object userFound = userService.getUserById(idUser);
        if(userFound != null){
            return ResponseEntity.ok(userFound);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/{idUser}")
    public ResponseEntity<Object> updateUser(@PathVariable int idUser, @RequestBody UserGenericRequestDTO user){
        Object userUpdate = userService.updateUser(idUser, user);
        if(userUpdate != null){
            return ResponseEntity.ok(userUpdate);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }
    @GetMapping("/{idUser}/role")
    public ResponseEntity<List<String>> getListRoles(@PathVariable int idUser){
        List<String> rols = userService.getListRoles(idUser);
        if(!rols.isEmpty() ){
            return ResponseEntity.ok(rols);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{idUser}/permission")
    public ResponseEntity<List<String>> getListPermission(@PathVariable int idUser){
        return null;
    }
}
