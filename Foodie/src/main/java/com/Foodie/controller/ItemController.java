package com.Foodie.controller;


import com.Foodie.model.ItemEntity;
import com.Foodie.model.MenuEntity;
import com.Foodie.model.RestaurantEntity;
import com.Foodie.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Item")
public class ItemController {

    @Autowired
    private ItemService service;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody ItemEntity itemEntity){
       service.save(itemEntity);
       return ResponseEntity.ok("Item save");
    }

    @GetMapping("/getAllItem")
    public List<ItemEntity> getAll(){
        return service.getAll();
    }

    @GetMapping("{restaurantId}")
    public ResponseEntity<List<ItemEntity>> getItemsByRestaurantId(@PathVariable Long restaurantId){
        List<ItemEntity> items = service.getItemsByRestaurantId(restaurantId);
        if (!items.isEmpty()){
            return ResponseEntity.ok(items);
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<MenuEntity> addMenu(@RequestBody MenuEntity menuEntity){
        MenuEntity menuEntity1 = service.addMenuItem(menuEntity);
        return new ResponseEntity<>(menuEntity1, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<MenuEntity>> getMenuItemsByRestaurantId(@PathVariable RestaurantEntity restaurantId) {
        List<MenuEntity> menuItems = service.getMenuItemsByRestaurantId(restaurantId);
        return new ResponseEntity<>(menuItems, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuEntity> getMenuItemById(@PathVariable Long id) {
        MenuEntity menuItem = service.getMenuItemById(id);
        return new ResponseEntity<>(menuItem, HttpStatus.OK);
    }

}
