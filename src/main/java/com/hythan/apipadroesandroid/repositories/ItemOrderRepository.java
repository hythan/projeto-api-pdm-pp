package com.hythan.apipadroesandroid.repositories;

import com.hythan.apipadroesandroid.entities.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemOrderRepository extends JpaRepository<ItemOrder, Integer>{
}
