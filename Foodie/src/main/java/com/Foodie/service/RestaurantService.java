package com.Foodie.service;


import com.Foodie.Repository.RestaurantRepo;
import com.Foodie.model.RestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepo repo;

    public RestaurantEntity save(RestaurantEntity restaurant){
       return repo.save(restaurant);
    }

    public List<RestaurantEntity> getAll(){
        return repo.findAll();
    }

    public List<RestaurantEntity> getByName(String restaurantName){
        return repo.getByName(restaurantName);
    }


}
