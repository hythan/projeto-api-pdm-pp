package com.hythan.apipadroesandroid.services;

import com.hythan.apipadroesandroid.entities.Product;
import com.hythan.apipadroesandroid.entities.dao.ProductDAO;
import com.hythan.apipadroesandroid.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
public class ProductService implements ProductDAO{

    @Autowired
    protected ProductRepository repository;


    @Override
    public Optional<Product> findById(Integer id) {
        Optional<Product> product = repository.findById(id);
        return product;
    }

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product save(Product product) {
        Product newProduct = new Product(
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );

        return repository.save(newProduct);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
