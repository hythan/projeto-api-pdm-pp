package com.hythan.apipadroesandroid.services;

import com.hythan.apipadroesandroid.entities.Order;
import com.hythan.apipadroesandroid.entities.dao.OrdersDAO;
import com.hythan.apipadroesandroid.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrderService implements OrdersDAO {

    @Autowired
    protected OrderRepository repository;

    @Override
    public Optional<Order> findById(Integer id) {
        Optional<Order> order = repository.findById(id);
        return order;
    }

    @Override
    public Iterable<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Order save(Order order) {

        Order newOrder = new Order(order.getClientName(),
                order.getClientAddress(),
                order.getClientPhone(),
                order.getDateOfDelivery(),
                order.getProducts());

        return repository.save(newOrder);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
