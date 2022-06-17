package org.soujava.example.model;


import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Entity;

@Entity("table")
public class Person7 {

    @Column
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
