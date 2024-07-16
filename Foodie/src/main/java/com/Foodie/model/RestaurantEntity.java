package com.Foodie.model;


import jakarta.persistence.*;

@Entity
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String restaurantName;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String imageUrl;
    @Column(nullable = false)
    private String opensAt;
    @Column(nullable = false)
    private String closeAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOpensAt() {
        return opensAt;
    }

    public void setOpensAt(String opensAt) {
        this.opensAt = opensAt;
    }

    public String getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(String closeAt) {
        this.closeAt = closeAt;
    }

    public RestaurantEntity(){}

    public RestaurantEntity(Long id, String restaurantName, String city, String imageUrl, String opensAt, String closeAt) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.city = city;
        this.imageUrl = imageUrl;
        this.opensAt = opensAt;
        this.closeAt = closeAt;
    }

    @Override
    public String toString() {
        return "RestaurantEntity{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", city='" + city + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", opensAt='" + opensAt + '\'' +
                ", closeAt='" + closeAt + '\'' +
                '}';
    }
}
