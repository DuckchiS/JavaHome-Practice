package com.project.c.java.kiosk;

public class Product {
    String name;
    int price;
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void info(){
        System.out.println("메뉴 이름: " + name + " 가격:" + price);
    }
}
