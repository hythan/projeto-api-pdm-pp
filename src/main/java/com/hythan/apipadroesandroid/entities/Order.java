package com.hythan.apipadroesandroid.entities;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clientName;

    private String clientAddress;

    private String clientPhone;

    private String dateOfOrder;

    private String dateOfDelivery;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemOrder> orderItems;

    public Order(){}

    public Order(String clientName,
                 String clientAddress,
                 String clientPhone,
                 String dateOfDelivery,
                 ArrayList<ItemOrder> orderItems) {
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.dateOfDelivery = dateOfDelivery;
        this.orderItems = orderItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public List<ItemOrder> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<ItemOrder> orderItems) {
        this.orderItems = orderItems;
    }
}
