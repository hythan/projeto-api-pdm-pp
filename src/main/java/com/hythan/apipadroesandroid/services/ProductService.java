package com.hythan.apipadroesandroid.services;

import com.hythan.apipadroesandroid.dto.ProductDTO;
import com.hythan.apipadroesandroid.entities.Product;
import com.hythan.apipadroesandroid.entities.dao.ProductDAO;
import com.hythan.apipadroesandroid.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService implements ProductDAO{

    @Autowired
    protected ProductRepository repository;


    @Override
    public Optional<Product> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Product> findAll() {

        return repository.findAll();
    }

    @Override
    public Product save(ProductDTO productDTO) {
        Product newProduct = new Product();

        newProduct.setName(productDTO.getName());
        newProduct.setDescription(productDTO.getDescription());
        newProduct.setPrice(productDTO.getPrice());

        return repository.save(newProduct);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
