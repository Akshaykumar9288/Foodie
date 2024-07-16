package com.Foodie.Repository;

import com.Foodie.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepo extends JpaRepository<ItemEntity,Long> {

    List<ItemEntity> findAllByRestaurantId(Long restaurantId);

}
