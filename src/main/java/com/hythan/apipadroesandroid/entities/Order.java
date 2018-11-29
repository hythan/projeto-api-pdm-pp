package com.hythan.apipadroesandroid.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order extends Audit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String clientName;

    private String clientAddress;

    private String clientPhone;

    @JsonSerialize(using = DateSerializer.class)
    private Date dateOfOrder;

    @JsonSerialize(using = DateSerializer.class)
    private Date dateOfDelivery;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@OneToMany
    private List<ItemOrder> orderItems;

    public Order(){}

    public Order(String clientName,
                 String clientAddress,
                 String clientPhone,
                 Date dateOfDelivery,
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public List<ItemOrder> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<ItemOrder> orderItems) {
        this.orderItems = orderItems;
    }
}
