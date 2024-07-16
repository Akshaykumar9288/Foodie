package com.Foodie.controller;


import com.Foodie.model.ItemEntity;
import com.Foodie.model.RestaurantEntity;
import com.Foodie.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService service;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody RestaurantEntity restaurant){
        service.save(restaurant);
        return ResponseEntity.ok("Restaurant added");
    }

    @GetMapping("/GetAllRestaurant")
    public List<RestaurantEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("/{restaurantName}")
    public List<RestaurantEntity> getByName(@PathVariable("restaurantName") String restaurantName){
        return service.getByName(restaurantName);
    }
}
