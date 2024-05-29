package com.brixton.input.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class StoreResponseDTO {

    int id;
    PetResponseDTO idPet;
    int quantity;
    String shipDate;
    String status;
    boolean isComplete;
}
