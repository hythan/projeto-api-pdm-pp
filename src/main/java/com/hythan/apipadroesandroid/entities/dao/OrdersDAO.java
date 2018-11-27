package com.hythan.apipadroesandroid.entities.dao;

import com.hythan.apipadroesandroid.entities.Order;

import java.util.Optional;

public interface OrdersDAO {

    Optional<Order> findById(Integer id);
    Iterable<Order> findAll();
    Order save(Order order);
    void deleteById(Integer id);
}
