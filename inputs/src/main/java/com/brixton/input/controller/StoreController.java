package com.brixton.input.controller;


import com.brixton.input.dto.request.StoreGenericRequestDTO;

import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.dto.response.StoreResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/store")
public class StoreController {

    Map<String, StoreGenericRequestDTO> storeInputs = new HashMap<>();
    Map<String, StoreGenericRequestDTO> storeOutputs = new HashMap<>();

    @PostMapping("/")
    public ResponseEntity<StoreResponseDTO> createStore(@RequestBody StoreGenericRequestDTO input){

        storeInputs.put(String.valueOf(input.getId()), input);
        //Almacena la informacion para ser devuelta -response-
        StoreResponseDTO rg = new StoreResponseDTO();
        rg.setId(input.getId());
        rg.setIdPet(input.getIdPet());
        rg.setQuantity(input.getQuantity());
        rg.setShipDate(input.getShipDate());
        rg.setStatus(input.getStatus());
        rg.setComplete(input.isComplete());


        return ResponseEntity.ok(rg);
    }

    @GetMapping("/")
    public ResponseEntity<List<StoreResponseDTO>> getStore(){
        /**
         * Proceso de Obtener mascotas
         * 1. Convertir el Mapa de petOutputs a una Lista
         * 2. Devolver la lista
         */
        List<StoreResponseDTO> StoreResponses = new ArrayList<>();
        StoreResponses.addAll(storeOutputs.values());

        //return ResponseEntity.ok(new ArrayList<>(storeOutputs.values()));
        return ResponseEntity.ok(StoreResponses);
    }

}
