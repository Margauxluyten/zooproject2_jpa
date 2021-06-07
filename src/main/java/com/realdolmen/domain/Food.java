package com.realdolmen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
    //TODO: add id and foodName fields + constructor + getters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String foodName;



    public Food(int id, String foodName) {
        this.id = id;
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Food{ id= " + id + ", foodName= " + foodName + '}';
    }
}
