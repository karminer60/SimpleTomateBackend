package com.simpletomate.simpletomatebackend.models;
import jakarta.persistence.*;

import java.util.*;
//import javax.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    Long recipeid;
    String name;
    String namepural;
    double value;
    int quantity;

    public Recipe(String name, String namepural, double value, int quantity) {
        this.name = name;
        this.namepural = namepural;
        this.value = value;
        this.quantity = quantity;
    }

    public Recipe() {
        //default constructor
    }

    public long getRecipeid() {
        return recipeid;
    }

    public void setRecipeid(long coinid) {
        this.recipeid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamepural() {
        return namepural;
    }

    public void setNamepural(String namepural) {
        this.namepural = namepural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeid=" + recipeid +
                ", name=" + name +
                ", namepural=" + namepural +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}

