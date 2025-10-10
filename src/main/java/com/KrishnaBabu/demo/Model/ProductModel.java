package com.KrishnaBabu.demo.Model;
public class ProductModel {

    private int productId;
    private String productName;
    private int quantity;
    private double totalPrice;


    public ProductModel(int productId, String productName, int quantity, double totalPrice) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return productId;
    }
    public void setOrderId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
}




