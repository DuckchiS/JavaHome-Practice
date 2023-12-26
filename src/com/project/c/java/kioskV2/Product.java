package com.project.c.java.kioskV2;

public class Product {
    String name;
    int price;
    int type;

    public Product(String name, int price, int type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void info(){
        System.out.println("상품 이름:" + name + " 가격:" + price);
    }
}
