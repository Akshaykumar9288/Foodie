package com.Foodie.service;

import com.Foodie.Repository.MenuRepo;
import com.Foodie.model.MenuEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepo repo;

    public MenuEntity createMenu(MenuEntity menu){
        return repo.save(menu);
    }

    public List<MenuEntity> getAllMenus(){
        return repo.findAll();
    }




}
