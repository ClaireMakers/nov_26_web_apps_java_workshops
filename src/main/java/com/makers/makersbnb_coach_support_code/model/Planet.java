package com.makers.makersbnb_coach_support_code.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLANETS")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private int circumference;

    public Planet(String description, int circumference) {
        this.description = description;
        this.circumference = circumference;
    }

    public String getDescription() {return this.description;}
    public void setDescription(String description) {this.description = description;}

    public int getCircumference() {return this.circumference;}
    public void setCircumference(int circumference ) {this.circumference = circumference;}
}
