package com.hythan.apipadroesandroid.controllers;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hythan.apipadroesandroid.dto.OrderDTO;
import com.hythan.apipadroesandroid.entities.ItemOrder;
import com.hythan.apipadroesandroid.entities.Order;
import com.hythan.apipadroesandroid.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<Iterable<Order>> all(){
        Iterable<Order> orders = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(orders);
    }

    @PostMapping
    public Order newOrder(@RequestBody OrderDTO orderDTO){

        return service.save(orderDTO);
    }


    @GetMapping("/{id}")
    public Optional<Order> getProduct(@PathVariable("id") Integer id){
        return service.findById(id);
    }
}
