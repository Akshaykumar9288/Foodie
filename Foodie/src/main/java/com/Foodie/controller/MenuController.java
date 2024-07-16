package com.Foodie.controller;


import com.Foodie.model.MenuEntity;
import com.Foodie.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody MenuEntity menu){
         service.createMenu(menu);
         return ResponseEntity.ok("Menu Created");
    }

    @GetMapping
    public List<MenuEntity> getAllMenus() {
        return service.getAllMenus();
    }

}
