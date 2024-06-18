package com.brixton.demoinput.controller;

import com.brixton.demoinput.dto.response.request.StoreGenericRequestDTO;
import com.brixton.demoinput.dto.response.StoreResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/v1/store")
public class StoreController {

    @PostMapping("/order")
    public ResponseEntity<StoreResponseDTO> createStore(@RequestBody StoreGenericRequestDTO input) {

       /* storeInputs.put(String.valueOf(input.getId()), input);
        //Almacena la informacion para ser devuelta -response-
        StoreResponseDTO registro1 = new StoreResponseDTO();
        registro1.setId(input.getId());
        registro1.setPetId(input.getPetId());
        registro1.setQuantity(input.getQuantity());
        registro1.setShipDate(input.getShipDate());
        registro1.setStatus(input.getStatus());
        registro1.setComplete(input.isComplete());

        storeOutputs.put(String.valueOf(input.getId()), registro1);
        return ResponseEntity.ok(registro1);*/
        return null;
    }


    @GetMapping("/inventory/{status}")
    public ResponseEntity<List<StoreResponseDTO>> getInventories(@PathVariable String status) {

        /*List<StoreResponseDTO> valoresEncontrados = new ArrayList<>();

        for(StoreResponseDTO x :storeOutputs.values()){
            if(status.equals(x.getStatus())){
                valoresEncontrados.add(x);
            }
        }
        return ResponseEntity.ok(valoresEncontrados);*/
        return null;
    }

    @GetMapping("/inventory/count/{status}")
    public ResponseEntity<Integer> getCount(@PathVariable String status) {

        /*Integer contador = 0;

        //valores de status("placed", "approved", "delivered")
        for(StoreResponseDTO x :storeOutputs.values()){
            if(status.equals(x.getStatus())){
                contador++;
            }
        }
        return ResponseEntity.ok(contador);*/
        return null;
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<StoreResponseDTO> getStore(@PathVariable String orderId) {
       /* try {
            int idStore = Integer.parseInt(orderId); //convertir en integer
            StoreResponseDTO storeTem = storeOutputs.get(String.valueOf(idStore)); // traer los los pets
            if (storeTem != null) {
                return ResponseEntity.ok(storeTem);
            } else {
                return ResponseEntity.notFound().build(); // retorna 404
            }
        } catch (NumberFormatException e) {
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }*/
        return null;
    }


    @DeleteMapping("/{idStore}")
    public ResponseEntity deleteStore(@PathVariable int idStore){

        /*StoreResponseDTO temporal = storeOutputs.get(String.valueOf(idStore)); //Paso 1.
        if (temporal != null) {
            storeOutputs.remove(String.valueOf(idStore));
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }*/
        return null;
    }
}

