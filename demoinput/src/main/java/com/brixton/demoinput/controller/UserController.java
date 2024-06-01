package com.brixton.demoinput.controller;

import com.brixton.demoinput.dto.request.UserGenericRequestDTO;
import com.brixton.demoinput.dto.response.PetResponseDTO;
import com.brixton.demoinput.dto.response.UserResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    Map<String, UserGenericRequestDTO> userInputs = new HashMap<>();
    Map<String, UserResponseDTO> userOutputs = new HashMap<>();

    Map<String, String> loginOutputs = new HashMap<>();

    @PostMapping("/")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserGenericRequestDTO input){

        userInputs.put(String.valueOf(input.getUserName()), input);

        UserResponseDTO user = new UserResponseDTO();
        user.setId(input.getId());
        user.setUserName(input.getUserName());
        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        user.setEmail(input.getEmail());
        user.setPassword(input.getPassword());
        user.setPhone(input.getPhone());
        user.setUserStatus(input.getUserStatus());

        userOutputs.put(String.valueOf(input.getUserName()), user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/createWithList")
    public ResponseEntity<List<UserResponseDTO>> createWithList(@RequestBody List<UserGenericRequestDTO> users) {
        for (UserGenericRequestDTO user : users) {
            userInputs.put(String.valueOf(user.getUserName()), user);
            UserResponseDTO responseUser = new UserResponseDTO();
            userOutputs.put(String.valueOf(user.getUserName()), responseUser);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body((List)userOutputs.values());
    }

    @GetMapping("/{username}")
    public ResponseEntity<UserResponseDTO> getUserName(@PathVariable String username) {

        UserResponseDTO usernameTemporal = userOutputs.get(username);

        if (usernameTemporal != null) {
            return ResponseEntity.ok(usernameTemporal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{username}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable String username, @RequestBody UserGenericRequestDTO userActualizar) {

        UserResponseDTO usernameTemp = userOutputs.get(username);
        if(usernameTemp != null) {
            usernameTemp.setFirstName(userActualizar.getFirstName());
            usernameTemp.setLastName(userActualizar.getLastName());
            usernameTemp.setEmail(userActualizar.getEmail());
            usernameTemp.setPassword(userActualizar.getPassword());
            usernameTemp.setPhone(userActualizar.getPhone());
            usernameTemp.setUserStatus(userActualizar.getUserStatus());
            return ResponseEntity.ok(usernameTemp);
        }else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }

    @DeleteMapping("/{username}")
    public ResponseEntity deleteUser(@PathVariable String username){

        UserResponseDTO usernameTemp = userOutputs.get(username);;

        if (usernameTemp != null) {
            userOutputs.remove(username);
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }

    }

    @GetMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@RequestParam String username, @RequestParam String password){

        String loginTemporal = loginOutputs.get(String.valueOf(username));
        return null;
    }


    @GetMapping("/logout")
    public ResponseEntity<UserResponseDTO> logout(){
        return null;
    }
}
