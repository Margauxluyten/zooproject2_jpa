package com.realdolmen.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Tiger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 100)
    private String name; //moet private staan, encapsulation
   // private Country country; //ManyToOne relationShip
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    private Behavior behavior;

    @Transient
    private int age;

    @ManyToOne
    private Country country;

    public void setId(Long id) {
        this.id = id;
    }



    //TODO: Add a List of Foods field + setters & getter.
    //The relationship here is a OneToMany relationship (One animal can eat Many kinds of foods)
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "food_fk")
  private List<Food> foods = new ArrayList<>(); //better to initiate it already (create an object), so we don't get any NullPointerException if we try to call it.






    public String getName() { //getter
        return name;
    }


  public List<Food> getFoods() {
    return foods;
   }

  public Country getCountry() {
     return country;
 }

 public void setCountry(Country country) {
   this.country = country;
}

  public void setFoods(List<Food> foods) {
     this.foods = foods;
 }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tiger{id=" + id + ", name=" + name + '}';
    }
}
