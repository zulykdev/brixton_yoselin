package com.brixton.gestionUsuario.service;

import com.brixton.gestionUsuario.dto.request.UserGenericRequestDTO;
import com.brixton.gestionUsuario.dto.response.UserResponseDTO;
import com.brixton.gestionUsuario.model.mappers.CustomDateDeserializer;
import com.brixton.gestionUsuario.model.permission.Permission;
import com.brixton.gestionUsuario.model.role.Role;
import com.brixton.gestionUsuario.model.role.TypeRole;
import com.brixton.gestionUsuario.model.user.User;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleList;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    private static final String USER_APP = "YOSELIN";
    private final Map<Integer, User> users = new HashMap<>();


    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();
    public UserServiceImpl() {
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });

        //module.addSerializer(LocalDateTimeSerializer);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }
    @Override
    public Object createUser(UserGenericRequestDTO inputUser) {
        try {
            String jsonInput = objectMapper.writeValueAsString(inputUser);
            User user = objectMapper.readValue(jsonInput, User.class);

            user.setCreatedAt(LocalDateTime.now());
            user.setCreatedBy(USER_APP);
            users.put(user.getId(), user);

            String jsonOutput = objectMapper.writeValueAsString(user);
            UserResponseDTO output =  objectMapper.readValue(jsonOutput, UserResponseDTO.class);

            return output;

        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }

    @Override
    public Object getUserById(int idUser) {

        User userFound = users.get(idUser);
        try {
            String jsonOutput = objectMapper.writeValueAsString(userFound);
            UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
            return output;

        } catch (Exception e) {
                e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object updateUser(int idUser, UserGenericRequestDTO user) {
        try {
            String jsonInput = objectMapper.writeValueAsString(user);
            User userTemporal = objectMapper.readValue(jsonInput, User.class);

            User original = users.get(idUser);
            if(original != null){
                original.setFirstName(userTemporal.getFirstName());
                original.setLastName(userTemporal.getLastName());
                original.setEmail(userTemporal.getEmail());
                original.setUserName(userTemporal.getUserName());
                original.setPassword(userTemporal.getPassword());
                original.setRoles(userTemporal.getRoles());
                original.setPermissions(userTemporal.getPermissions());
                original.setUpdatedAt(LocalDateTime.now());
                original.setUpdatedBy(USER_APP);

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
    public List<String> getListRoles(int idUser) {
        List<String> roles = new ArrayList<>();
        for(User userTemporal: users.values()){
            try {
                if(userTemporal.getId() == idUser ){
                    String jsonOutput = objectMapper.writeValueAsString(userTemporal);
                    //UserResponseDTO output = objectMapper.readValue(jsonOutput, UserResponseDTO.class);
                    for(Role rol : userTemporal.getRoles()){
                        roles.add(rol.getNameRole().toString());
                    }

                }

            }catch (Exception e) {
                e.printStackTrace();
            }

        }

        return roles;
    }

    @Override
    public List<String> getListPermission(int idUser) {

        return null;
    }
}
