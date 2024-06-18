package com.brixton.pago.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDTO {
    private int id;
    private String resource;
    private String startDate;
    private String endDate;
    private double amount;
    private boolean available;
    private String dateOrder;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
}
