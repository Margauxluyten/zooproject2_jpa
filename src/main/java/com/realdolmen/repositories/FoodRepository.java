package com.realdolmen.repositories;

import com.realdolmen.domain.Food;
import com.realdolmen.domain.Tiger;
import com.realdolmen.repositories.util.PropertiesLoader;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Repository
public class FoodRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Food> getAllFoodFromDb() {
return null;
    }


    public List<Food> findAllFoodByAnimalId(int animalId) {
        return null;
    }


    public void deleteFoodById(int id){

    }

    //TODO: Extra add a method updateFoodName(int id, String foodName) <- id is the primary key of Food
    // Update SQL hint:
    // UPDATE Food SET foodName = ? WHERE id = ?
    public void updateFoodName(int id, String foodName){

    }

    public Food findById(Integer id) {
       return null;
    }

    public void saveFoodForAnimalId(Food food, int id) {

    }
}
