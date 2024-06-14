package com.brixton.demoinput.model.store;

public enum StatusStore {
    //placed, approved, delivered
    PLACED("PLACED"),
    APPROVED("APPROVED"),
    DELIVERED("DELIVERED");


    private String status;

   StatusStore(String status) {
        this.status = status;
    }

    String getStatus() {
        return this.status;
    }
}
