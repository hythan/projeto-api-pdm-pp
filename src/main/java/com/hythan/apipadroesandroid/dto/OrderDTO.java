package com.hythan.apipadroesandroid.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hythan.apipadroesandroid.entities.ItemOrder;
import com.hythan.apipadroesandroid.entities.Product;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO implements Serializable {

    private Integer id;

    private String clientName;

    private String clientAddress;

    private String clientPhone;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private String dateOfOrder;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private String dateOfDelivery;

    private ArrayList<ItemOrder> orderItems;

    public OrderDTO(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull(message = "Nome do cliente não pode ser nulo.")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @NotNull(message = "Endereço do cliente não pode ser nulo.")
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

    public ArrayList<ItemOrder> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<ItemOrder> orderItems) {
        this.orderItems = orderItems;
    }
}
