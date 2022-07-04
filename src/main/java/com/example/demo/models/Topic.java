package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Topic {
    @Id
    private Integer Id;
    private String Name;
    private String Description;

    public Topic() {
    }

    public Topic(Integer id, String name, String description) {
        Id = id;
        Name = name;
        Description = description;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
