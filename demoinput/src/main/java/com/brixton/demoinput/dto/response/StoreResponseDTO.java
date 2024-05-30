package com.brixton.demoinput.dto.response;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class StoreResponseDTO {

    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;
}
