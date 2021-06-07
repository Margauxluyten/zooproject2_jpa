package com.realdolmen.repositories;

import com.realdolmen.domain.Country;
import com.realdolmen.repositories.util.PropertiesLoader;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;
import java.sql.*;

@Repository
public class CountryRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Country> findAll() {
       return null;
    }
}
