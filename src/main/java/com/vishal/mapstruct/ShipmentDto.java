package com.vishal.mapstruct;


/**
 * Created by k.vishal on 07/04/16.
 */

public class ShipmentDto {
    private String id;
    private double size;
    private double itemQuantity;
    private double price;
    private String owner;
    private String itemId;
    private String itemPrice;
    private String itemName;

    public ShipmentDto(){}

    public ShipmentDto(String id, double size, double itemQuantity, double price, String owner) {
        this.id = id;
        this.size = size;
        this.itemQuantity = itemQuantity;
        this.price = price;
        this.owner = owner;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
