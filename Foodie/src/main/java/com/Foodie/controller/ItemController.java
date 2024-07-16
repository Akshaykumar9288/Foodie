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

//    @GetMapping("{restaurantId}")
//    public ResponseEntity<List<ItemEntity>> getItemsByRestaurantId(@PathVariable Long restaurantId){
//        List<ItemEntity> items = service.getItemsByRestaurantId(restaurantId);
//        if (!items.isEmpty()){
//            return ResponseEntity.ok(items);
//        }else {
//            return ResponseEntity.notFound().build();
//        }
//    }


}
