package com.hythan.apipadroesandroid.services;

import com.hythan.apipadroesandroid.dto.OrderDTO;
import com.hythan.apipadroesandroid.entities.ItemOrder;
import com.hythan.apipadroesandroid.entities.Order;
import com.hythan.apipadroesandroid.entities.dao.OrdersDAO;
import com.hythan.apipadroesandroid.repositories.ItemOrderRepository;
import com.hythan.apipadroesandroid.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;


@Service
public class OrderService implements OrdersDAO {

    @Autowired
    protected OrderRepository repository;

    @Autowired
    protected ItemOrderRepository itemOrderRepository;

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
//        ArrayList<ItemOrder> arrayList = new ArrayList<>();
//
//        orderDTO.getOrderItems().forEach( item -> {
//            ItemOrder itemOrder = new ItemOrder();
//            itemOrder.setProduct(item.getProduct());
//            itemOrder.setAmount(item.getAmount());
//            try {
//                ItemOrder salvado = itemOrderRepository.save(itemOrder);
//
//                arrayList.add(salvado);
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        });


        Order newOrder = new Order();

        newOrder.setClientName(orderDTO.getClientName());
        newOrder.setClientAddress(orderDTO.getClientAddress());
        newOrder.setClientPhone(orderDTO.getClientPhone());
        newOrder.setDateOfOrder(String.valueOf(new Date().getTime()));
        newOrder.setDateOfDelivery(orderDTO.getDateOfDelivery());
        newOrder.setOrderItems(orderDTO.getOrderItems());


        return repository.save(newOrder);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
