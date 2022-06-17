package org.soujava.example.model;

import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Entity;

@Entity("table")
public class Person4 {

    @Column("native")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
