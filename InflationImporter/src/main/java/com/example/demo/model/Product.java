package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String code;
    private String region;
    private String mounth;
    private String name;
    private String type;
    private String year;
    private String value;
    private String currency;
    private String attribute;

    public Product() {
    }

    public Product(int id, String code, String region, String mounth, String name, String type, String year, String value, String currency, String attribute) {
        this.idProduct = id;
        this.code = code;
        this.region = region;
        this.mounth = mounth;
        this.name = name;
        this.type = type;
        this.year = year;
        this.value = value;
        this.currency = currency;
        this.attribute = attribute;
    }
}
