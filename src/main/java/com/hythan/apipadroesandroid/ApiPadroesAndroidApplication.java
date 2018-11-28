package com.hythan.apipadroesandroid;

import com.github.javafaker.Faker;
import com.hythan.apipadroesandroid.dto.ProductDTO;
import com.hythan.apipadroesandroid.entities.ItemOrder;
import com.hythan.apipadroesandroid.entities.Order;
import com.hythan.apipadroesandroid.entities.Product;
import com.hythan.apipadroesandroid.repositories.ProductRepository;
import com.hythan.apipadroesandroid.services.OrderService;
import com.hythan.apipadroesandroid.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Locale;

@SpringBootApplication
public class ApiPadroesAndroidApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPadroesAndroidApplication.class, args);
	}

	@Component
	class onInit {

		@Autowired
		private ProductService service;

		@PostConstruct
		public void postConstruct() {
			Faker faker = new Faker(new Locale("pt-BR"));

			for(int i = 0; i < 1000; i ++){
				service.save(new ProductDTO(faker.name().firstName(),faker.name().fullName(),faker.number().randomDouble(2,1,100)));
			}
		}
	}
}
