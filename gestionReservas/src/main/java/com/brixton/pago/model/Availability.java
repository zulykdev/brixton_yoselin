package com.brixton.pago.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Availability {
    private int id;
    private Booking booking;
    private boolean available;

}
