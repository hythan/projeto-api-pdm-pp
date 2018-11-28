package com.hythan.apipadroesandroid.repositories;

import com.hythan.apipadroesandroid.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
