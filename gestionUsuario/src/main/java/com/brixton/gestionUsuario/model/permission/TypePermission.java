package com.brixton.gestionUsuario.model.permission;

public enum TypePermission {
    CREATE("CREATE"),
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    LIST("LIST"),
    READ("READ"),
    WRITE("WRITE");


    private String status;
    TypePermission(String status){
        this.status= status;
    }
    String getStatus(){
        return  this.status;
    }
}
