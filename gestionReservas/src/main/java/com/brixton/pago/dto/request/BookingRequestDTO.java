package com.brixton.pago.dto.request;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BookingRequestDTO {
    private int id;
    private String resource;
    private String startDate;
    private String endDate;
    private double amount;
    private boolean available;
}
