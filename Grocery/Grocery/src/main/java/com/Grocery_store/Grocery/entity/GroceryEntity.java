package com.Grocery_store.Grocery.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Grocery_table")
public class GroceryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private LocalDate ArriveDate;
    @Column(nullable = false)
    private Integer productCost;
    @Column(nullable = false)
    private String paymentMode;
    @Column(nullable = false)
    private String status;


}
