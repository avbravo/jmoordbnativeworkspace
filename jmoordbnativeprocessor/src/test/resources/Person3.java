package org.soujava.example.model;


import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Entity;

@Entity("table")
public class Person3 {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
