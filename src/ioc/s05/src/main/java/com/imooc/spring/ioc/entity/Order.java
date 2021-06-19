package com.imooc.spring.ioc.entity;

public class Order {
    private Float price;
    private Integer quantity;
    private Float total;

    public Order() {
        System.out.println("create Order:" + this);
    }

    public void init() {
        System.out.println("init");
        total = price * quantity;
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public void pay() {
        System.out.println("total price:" + total);
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        System.out.println("set price:"+price);
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        System.out.println("set quantity:"+quantity);
        this.quantity = quantity;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}
