package com.example.shop.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name", length = 100)
    private String name;

    @Column(name = "product_price")
    private int price;

    @Column(name = "product_stock")
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void updateInfo(String name, int price, int stock) {
        if (name != null) {
            this.name = name;
        }
        if (price >= 0) {
            this.price = price;
        }
        if (stock >= 0) {
            this.stock = stock;
        }
    }
}