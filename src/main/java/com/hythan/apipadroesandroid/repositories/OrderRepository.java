package com.hythan.apipadroesandroid.repositories;

import com.hythan.apipadroesandroid.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
