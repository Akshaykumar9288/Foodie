package com.Foodie.Repository;

import com.Foodie.model.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface RestaurantRepo extends JpaRepository<RestaurantEntity,Long> {

    @Query("SELECT u FROM RestaurantEntity u WHERE u.restaurantName = :restaurantName")
    List<RestaurantEntity> getByName(@PathVariable("restaurantName") String restaurantName);
}
