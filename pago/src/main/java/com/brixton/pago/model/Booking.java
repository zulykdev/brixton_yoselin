package com.brixton.pago.model;

import com.brixton.pago.model.mapper.ObjectAudit;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Booking extends ObjectAudit {
    private int id;
    private String resource;
    private LocalDate startDate;
    private LocalDate endDate;
    private Payment payment;
    private Availability availability;
}
