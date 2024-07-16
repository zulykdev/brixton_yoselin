package com.brixton.pago.model;

public enum Status {
    COMPLETED("COMPLETED"),
    AVAILABLE("AVAILABLE");

    private String status;
    Status(String status){
        this.status = status;
    }
    String getStatus(){
        return this.status;
    }
}
