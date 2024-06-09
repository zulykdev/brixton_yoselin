package com.brixton.demoinput.service;

import com.brixton.demoinput.dto.request.UserGenericRequestDTO;
import com.brixton.demoinput.dto.response.PetResponseDTO;
import com.brixton.demoinput.dto.response.UserResponseDTO;
import com.brixton.demoinput.model.user.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    Map<String, UserGenericRequestDTO> userInputs = new HashMap<>();
    Map<String, UserResponseDTO> userOutputs = new HashMap<>();
    Map<String, User> users = new HashMap<>();
    Map<String, String> userLoggeds= new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();

    public Object createUser(UserGenericRequestDTO inputUser){

        try {
            String jsonInput = objectMapper.writeValueAsString(inputUser);

            User user = objectMapper.readValue(jsonInput, User.class);
            users.put(user.getUserName(), user);

            String jsonOutput = objectMapper.writeValueAsString(user);
            UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object createWithList(List<UserGenericRequestDTO> users) {
       /* List<Object>responseUsers = new ArrayList<>();
        try {
            String jsonInput = objectMapper.writeValueAsString(responseUsers);
            //User user = objectMapper.readValue(())
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }*/

        return null;
    }

    @Override
    public Object updateUser(String username, UserGenericRequestDTO userActualizar) {
        try {
            String jsonInput = objectMapper.writeValueAsString(userActualizar);
            User userTemporal = objectMapper.readValue(jsonInput, User.class);

            User original = users.get(username);
            if(original != null){
                original.setFirstName(userTemporal.getFirstName());
                original.setLastName(userTemporal.getLastName());
                original.setEmail(userTemporal.getEmail());
                original.setPassword(userTemporal.getPassword());
                original.setPhone(userTemporal.getPhone());
                original.setUserStatus(userTemporal.getUserStatus());

                String jsonOutput = objectMapper.writeValueAsString(original);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                return output;
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object getUsername(String username) {

        for(User user: users.values()){
            try {
                String jsonOutput = objectMapper.writeValueAsString(user);
                UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return users.get(username);
    }

    @Override
    public Object deleteUser(String username) {
        User userToRemove = users.remove(username);
        return (userToRemove == null? false : true);
    }

    @Override
    public Object login(String username, String password) {
        return null;
    }

    @Override
    public Object logout(String username) {
        return null;
    }
}
