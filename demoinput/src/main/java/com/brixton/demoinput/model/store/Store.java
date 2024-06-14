package com.brixton.demoinput.model.store;

import com.brixton.demoinput.model.ObjectAudit;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Store extends ObjectAudit {
    private int id;
    private int petId;
    private int quantity;
    private LocalDateTime shipDate;
    private StatusStore status;
    private boolean complete;
}
