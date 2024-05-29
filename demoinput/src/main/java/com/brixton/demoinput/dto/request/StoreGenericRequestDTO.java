package com.brixton.input.dto.request;

import com.brixton.input.dto.response.PetResponseDTO;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class StoreGenericRequestDTO {

    int id;
    PetResponseDTO idPet;
    int quantity;
    String shipDate;
    String status;
    boolean isComplete;
}
