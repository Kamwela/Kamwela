package com.Grocery_store.Grocery.service;

import com.Grocery_store.Grocery.entity.GroceryEntity;

import java.util.List;

public interface GroceryService {

    GroceryEntity createGrocery(GroceryEntity groceryEntity);

    GroceryEntity getGroceryById(Long groceryId);

    List<GroceryEntity> getAllGrocery();

    GroceryEntity updateGrocery(GroceryEntity groceryEntity);

    void deleteGrocery(Long groceryId);
}
