package com.jmoordbnativeapi.jmoordnativereflection;


import com.jmoordbnativeapi.metadata.Column;
import com.jmoordbnativeapi.metadata.Constructor;
import com.jmoordbnativeapi.metadata.Entity;
import com.jmoordbnativeapi.metadata.Id;
import com.jmoordbnativeapi.metadata.Param;

@Entity
public class Person {

    @Id
    private final String id;

    @Column("native")
    private final String name;

    @Column
    private final String country;

    @Constructor
    public Person(@Param("id") String id,
                  @Param("name") String name,
                  @Param("country") String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
