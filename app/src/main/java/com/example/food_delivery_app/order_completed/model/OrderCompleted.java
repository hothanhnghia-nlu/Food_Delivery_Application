package com.example.food_delivery_app.order_completed.model;

public class OrderCompleted {
    private int id;
    private String image;
    private String name;
    private String size;
    private String quantity;
    private String price;

    public OrderCompleted(int id, String image, String name, String size, String quantity, String price) {
        this.image = image;
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
