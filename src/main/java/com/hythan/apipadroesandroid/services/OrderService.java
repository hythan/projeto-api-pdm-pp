package com.hythan.apipadroesandroid.services;

import com.hythan.apipadroesandroid.dto.OrderDTO;
import com.hythan.apipadroesandroid.entities.Order;
import com.hythan.apipadroesandroid.entities.dao.OrdersDAO;
import com.hythan.apipadroesandroid.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;


@Service
public class OrderService implements OrdersDAO {

    @Autowired
    private OrderRepository repository;

    @Override
    public Optional<Order> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Order save(OrderDTO orderDTO) {

        Order newOrder = new Order();

        newOrder.setClientName(orderDTO.getClientName());
        newOrder.setClientAddress(orderDTO.getClientAddress());
        newOrder.setClientPhone(orderDTO.getClientPhone());
        newOrder.setDateOfOrder(new Date());
        newOrder.setDateOfDelivery(orderDTO.getDateOfDelivery());

        newOrder.setOrderItems(orderDTO.getOrderItems());

        return repository.save(newOrder);
    }

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public Order update(OrderDTO orderDTO, Integer id) {
        Order orderUpdate = repository.getOne(id);

        orderUpdate.setClientName(orderDTO.getClientName());
        orderUpdate.setClientAddress(orderDTO.getClientAddress());
        orderUpdate.setClientPhone(orderDTO.getClientPhone());
        orderUpdate.setDateOfDelivery(orderDTO.getDateOfDelivery());
        orderUpdate.setOrderItems(orderDTO.getOrderItems());

        return repository.save(orderUpdate);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

}
