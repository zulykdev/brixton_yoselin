package com.brixton.demoinput.dto.request;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class StoreGenericRequestDTO {

    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;
}
