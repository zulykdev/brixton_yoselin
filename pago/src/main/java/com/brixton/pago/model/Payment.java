package com.brixton.pago.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Payment {
    private int id;
    private Booking bookingId;
    private double amount;
    private Status status;

    public String transaction(double amount){

        if(amount >= 0){
            return Status.COMPLETED.getStatus();
        }else{
            return Status.AVAILABLE.getStatus();
        }
    }
}
