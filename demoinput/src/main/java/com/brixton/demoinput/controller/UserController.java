package com.brixton.demoinput.controller;

import com.brixton.demoinput.dto.request.UserGenericRequestDTO;
import com.brixton.demoinput.dto.response.UserResponseDTO;
import com.brixton.demoinput.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public ResponseEntity<Object> createUser(@RequestBody UserGenericRequestDTO input){
        return ResponseEntity.ok(userService.createUser(input));
    }

    @PostMapping("/createWithList")
    public ResponseEntity<List<Object>> createWithList(@RequestBody List<UserGenericRequestDTO> users) {
        /*List<UserResponseDTO> responseUsers = new ArrayList<>();
        for (UserGenericRequestDTO user : users) {
            userInputs.put(String.valueOf(user.getUserName()), user);
            UserResponseDTO responseUser = new UserResponseDTO();
            responseUser.setId(user.getId());
            responseUser.setUserName(user.getUserName());
            responseUser.setFirstName(user.getFirstName());
            responseUser.setLastName(user.getLastName());
            responseUser.setEmail(user.getEmail());
            responseUser.setPassword(user.getPassword());
            responseUser.setPhone(user.getPhone());
            responseUser.setUserStatus(user.getUserStatus());
            userOutputs.put(String.valueOf(user.getUserName()), responseUser);
            responseUsers.add(responseUser);
        }

        //return ResponseEntity.status(HttpStatus.CREATED).body((List)userOutputs.values());
        //return ResponseEntity.status(HttpStatus.CREATED).body();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseUsers);*/
        return null;
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
    public ResponseEntity<UserResponseDTO> login(@RequestParam (name="username") String username, @RequestParam (name="password") String password){

       /* UserResponseDTO userTemporal = userOutputs.get(username);
        if(userTemporal!= null && userTemporal.getPassword().equals(password)){
            String logged = userLoggeds.get(username);
            if(logged == null){
                userLoggeds.put(userTemporal.getUserName(),userTemporal.getUserName());
                return new ResponseEntity<>(HttpStatusCode.valueOf(200));
            }else{
                return new ResponseEntity<>(HttpStatusCode.valueOf(500));
            }
        }else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }*/
        return null;

    }


    @GetMapping("/logout")
    public ResponseEntity<UserResponseDTO> login(@RequestParam String username){

        /*String logged = userLoggeds.get(username);

        if(logged != null){
            userLoggeds.remove(logged);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }*/
        return null;

    }
}
