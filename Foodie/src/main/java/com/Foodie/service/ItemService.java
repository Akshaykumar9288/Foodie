package com.Foodie.service;


import com.Foodie.Repository.ItemRepo;
import com.Foodie.Repository.MenuRepo;
import com.Foodie.model.ItemEntity;
import com.Foodie.model.MenuEntity;
import com.Foodie.model.RestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepo repo;
    @Autowired
    private MenuRepo menuRepo;

    public ItemEntity save(ItemEntity itemEntity){
       return repo.save(itemEntity);
    }

    public List<ItemEntity> getAll(){
        return repo.findAll();
    }

    public List<ItemEntity> getItemsByRestaurantId(Long restaurant){
        return repo.findAllByRestaurantId(restaurant);
    }

    public MenuEntity addMenuItem(MenuEntity menuItem) {
        return menuRepo.save(menuItem);
    }

    public List<MenuEntity> getMenuItemsByRestaurantId(RestaurantEntity restaurantId) {
        return menuRepo.findMenuByRestaurantId(restaurantId);
    }

    public MenuEntity getMenuItemById(Long id) {
        return menuRepo.findById(id).orElse(null);
    }

}
