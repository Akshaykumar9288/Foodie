package com.Foodie.Repository;

import com.Foodie.model.MenuEntity;
import com.Foodie.model.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepo extends JpaRepository<MenuEntity,Long> {

    List<MenuEntity> findMenuByRestaurantId(RestaurantEntity restaurant);
}
