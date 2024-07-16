package com.Foodie.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private RestaurantEntity restaurant;
    @OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
    private List<ItemEntity> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestaurantEntity getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantEntity restaurant) {
        this.restaurant = restaurant;
    }

    public List<ItemEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
    }

    public MenuEntity(Long id, String name, RestaurantEntity restaurant, List<ItemEntity> items) {
        this.id = id;
        this.name = name;
        this.restaurant = restaurant;
        this.items = items;
    }

    public MenuEntity(){}

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", restaurant=" + restaurant +
                ", items=" + items +
                '}';
    }
}
