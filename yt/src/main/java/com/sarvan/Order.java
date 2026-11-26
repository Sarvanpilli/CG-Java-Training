package com.sarvan;

import java.util.Date;

public class Order {
    private String productId;
    private String productName;
    private Date orderDate;
    private Customer customer;

    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public Date getOrderDate(){
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
