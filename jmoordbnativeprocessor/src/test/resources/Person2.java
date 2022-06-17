package org.soujava.example.model;


import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Entity;

@Entity
public class Person2 {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person2() {}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
