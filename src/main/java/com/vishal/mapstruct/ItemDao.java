package com.vishal.mapstruct;

/**
 * Created by k.vishal on 08/04/16.
 */

public class ItemDao {

    private String itemId;
    private String itemName;
    private double itemPrice;

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
