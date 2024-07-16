package com.Foodie.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String Name;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurantId;
    @Column(nullable = false)
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RestaurantEntity getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(RestaurantEntity restaurantId) {
        this.restaurantId = restaurantId;
    }

    public MenuEntity(){}

    public MenuEntity(Long id, String name, RestaurantEntity restaurantId, double price) {
        this.id = id;
        Name = name;
        this.restaurantId = restaurantId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", restaurantId=" + restaurantId +
                ", price=" + price +
                '}';
    }
}
