package com.Grocery_store.Grocery.repository;

import com.Grocery_store.Grocery.entity.GroceryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryRepository extends JpaRepository<GroceryEntity, Long> {

}
