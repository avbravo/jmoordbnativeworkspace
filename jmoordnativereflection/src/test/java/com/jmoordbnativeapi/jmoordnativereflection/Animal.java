package com.jmoordbnativeapi.jmoordnativereflection;


import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Entity;
import com.jmoordbnativeapi.metadata.Id;

@Entity("animal")
public class Animal {

    @Id
    private String id;

    @Column("native_name")
    private String name;

    public Animal() {
    }

    public Animal(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
