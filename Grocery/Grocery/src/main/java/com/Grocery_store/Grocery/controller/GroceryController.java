package com.Grocery_store.Grocery.controller;

import com.Grocery_store.Grocery.entity.GroceryEntity;
import com.Grocery_store.Grocery.service.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/grocery")
public class GroceryController {
    private GroceryService groceryService;

    @PostMapping
    public ResponseEntity<GroceryEntity> createGrocery(@RequestBody GroceryEntity groceryEntity){
        GroceryEntity savedGrocery = groceryService.createGrocery(groceryEntity);
        return new ResponseEntity<>(savedGrocery, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<GroceryEntity>> getAllGrocery(){
        List<GroceryEntity> groceryEntities = groceryService.getAllGrocery();
        return new ResponseEntity<>(groceryEntities, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<GroceryEntity> getGroceryById(@PathVariable("id") Long groceryId, @RequestBody GroceryEntity groceryEntity){
       GroceryEntity getGroceryById = groceryService.getGroceryById(groceryId);
       return new ResponseEntity<>(getGroceryById, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<GroceryEntity> updateGroceryEntity(@PathVariable("id") Long groceryId,
                                                             @RequestBody GroceryEntity groceryEntity){
      groceryEntity.setId(groceryId);
      GroceryEntity updateGroceryEntity = groceryService.updateGrocery(groceryEntity);
      return new ResponseEntity<>(updateGroceryEntity, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGroceryEntity(@PathVariable("id")Long groceryId){
       groceryService.deleteGrocery(groceryId);
       return new ResponseEntity<>("Grocery detail Successfully deleted!!!", HttpStatus.OK);
    }
}

