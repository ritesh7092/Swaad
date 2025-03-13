package com.swaad.admin.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "menu_items")  // Specifies the table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantMenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment for item_id
    @Column(name = "item_id")
    private int itemId;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int stock;

    @Column(length = 1000)
    private String description;

    @Column(length = 1000)
    private String images;

    @Column(name = "restaurant_id", nullable = false)
    private int restaurantId;
}
