package com.hythan.apipadroesandroid.controllers;

import com.hythan.apipadroesandroid.dto.ProductDTO;
import com.hythan.apipadroesandroid.entities.Product;
import com.hythan.apipadroesandroid.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    protected ProductService service;

    @GetMapping
    public ResponseEntity<Iterable<Product>> all(){
        Iterable<Product> products = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }


    @PostMapping("/novo")
    public Product newProduct(@RequestBody ProductDTO productDTO, BindingResult result){
        return service.save(productDTO);
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Integer id){
        return service.findById(id);
    }

    @DeleteMapping
    public void delete(Product product){
        service.deleteById(product.getId());
    }
}
