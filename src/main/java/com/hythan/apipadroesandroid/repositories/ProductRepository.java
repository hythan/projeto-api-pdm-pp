package com.hythan.apipadroesandroid.repositories;

import com.hythan.apipadroesandroid.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
