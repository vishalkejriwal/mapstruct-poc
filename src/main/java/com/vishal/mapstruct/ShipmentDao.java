package com.vishal.mapstruct;


/**
 * Created by k.vishal on 07/04/16.
 */


public class ShipmentDao {
    private String shipmentId;
    private double size;
    private int itemQuantity;
    private double price;
    private ItemDao item;

    public ShipmentDao(String shipmentId, double size, int itemQuantity, double price, ItemDao item) {
        this.shipmentId = shipmentId;
        this.size = size;
        this.itemQuantity = itemQuantity;
        this.price = price;
        this.item = item;
    }

    public ItemDao getItem() {
        return item;
    }

    public void setItem(ItemDao item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

}
