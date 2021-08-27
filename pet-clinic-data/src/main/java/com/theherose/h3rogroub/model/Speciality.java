package com.theherose.h3rogroub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialitis")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description ;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}