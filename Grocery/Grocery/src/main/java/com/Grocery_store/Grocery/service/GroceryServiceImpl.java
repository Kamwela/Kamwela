package com.Grocery_store.Grocery.service;

import com.Grocery_store.Grocery.entity.GroceryEntity;
import com.Grocery_store.Grocery.repository.GroceryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GroceryServiceImpl implements GroceryService {
    private GroceryRepository groceryRepository;

    @Override
    public GroceryEntity createGrocery(GroceryEntity groceryEntity) {
        return groceryRepository.save(groceryEntity);
    }

    @Override
    public GroceryEntity getGroceryById(Long groceryId) {
        Optional<GroceryEntity> optionalGroceryEntity = groceryRepository.findById(groceryId);
        return optionalGroceryEntity.get();
    }

    @Override
    public List<GroceryEntity> getAllGrocery() {
        return groceryRepository.findAll();
    }

    @Override
    public GroceryEntity updateGrocery(GroceryEntity groceryEntity) {
        GroceryEntity existingGrocery = groceryRepository.findById(groceryEntity.getId()).get();
        existingGrocery.setProductName(groceryEntity.getProductName());
        existingGrocery.setArriveDate(groceryEntity.getArriveDate());
        existingGrocery.setProductCost(groceryEntity.getProductCost());
        existingGrocery.setStatus(groceryEntity.getStatus());
        existingGrocery.setPaymentMode(groceryEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteGrocery(Long groceryId) {
        groceryRepository.deleteById(groceryId);

    }
}
