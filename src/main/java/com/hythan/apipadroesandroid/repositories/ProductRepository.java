package com.hythan.apipadroesandroid.repositories;

import com.hythan.apipadroesandroid.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
