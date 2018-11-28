package com.hythan.apipadroesandroid.entities.dao;

import com.hythan.apipadroesandroid.dto.OrderDTO;
import com.hythan.apipadroesandroid.entities.Order;

import java.util.Optional;

public interface OrdersDAO {

    Optional<Order> findById(Integer id);
    Iterable<Order> findAll();
    Order save(OrderDTO orderDTO);
    void deleteById(Integer id);
}
