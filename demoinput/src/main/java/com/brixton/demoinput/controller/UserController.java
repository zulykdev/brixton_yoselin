package com.brixton.demoinput.controller;

import com.brixton.demoinput.dto.request.UserGenericRequestDTO;
import com.brixton.demoinput.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public ResponseEntity<Object> createUser(@RequestBody UserGenericRequestDTO input){
        return ResponseEntity.ok(userService.createUser(input));
    }

    @PostMapping("/createWithList")
    public ResponseEntity<List<Object>> createWithList(@RequestBody List<UserGenericRequestDTO> users) {

        //return ResponseEntity.ok(Collections.singletonList(userService.createWithList(users)));
        return ResponseEntity.ok(userService.createWithList(users));
    }

    @GetMapping("/{username}")
    public ResponseEntity<Object> getUserName(@PathVariable String username) {

        Object usernameTemporal = userService.getUsername(username);

        if (usernameTemporal != null) {
            return ResponseEntity.ok(usernameTemporal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{username}")
    public ResponseEntity<Object> updateUser(@PathVariable String username, @RequestBody UserGenericRequestDTO userActualizar) {
        Object userUpdate = userService.updateUser(username, userActualizar);
        if(userUpdate != null){
            return ResponseEntity.ok(userUpdate);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }

    @DeleteMapping("/{username}")
    public ResponseEntity deleteUser(@PathVariable String username){

        boolean successfull = (boolean) userService.deleteUser(username);
        if(successfull){
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }

    @GetMapping("/login")
    public ResponseEntity<Object> login(@RequestParam (name="username") String username, @RequestParam (name="password") String password){

        Object user = userService.login(username, password);
        if(user != null){
            return ResponseEntity.ok(user);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }


    @GetMapping("/logout")
    public ResponseEntity logout(@RequestParam String username){
        //boolean isLoggedOut = userService.logout(username);
        if(userService.logout(username)){
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }

    }
}
