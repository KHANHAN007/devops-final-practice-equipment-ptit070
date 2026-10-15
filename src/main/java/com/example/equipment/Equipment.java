package com.example.equipment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    private Long id;
    private String name;
    private String room;
    private Integer quantity;

    protected Equipment() {}

    public Equipment(Long id, String name, String room, Integer quantity) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.quantity = quantity;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getRoom() { return room; }
    public Integer getQuantity() { return quantity; }
}
