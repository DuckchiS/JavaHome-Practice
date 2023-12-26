package com.project.c.java.kioskV2;

import com.project.c.java.kioskV2.product.Character;
import com.project.c.java.kioskV2.product.Dessert;
import com.project.c.java.kioskV2.product.Drink;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskObj {
    public static ArrayList<Order> basket = new ArrayList<>();
    public static ArrayList<Product> product = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static String cmd;
    public static void productLoad(){
        product.add(new Drink("아메리카노", 1500, 0));
        product.add(new Drink("초코라떼", 3000, 0));
        product.add(new Drink("바닐라라떼", 3500, 0));
        product.add(new Drink("녹차라떼", 4500, 0));
        product.add(new Drink("주스", 4500, 0));

        product.add(new Dessert("마카롱", 3000, 1));
        product.add(new Dessert("쿠키", 1200, 1));
        product.add(new Dessert("케잌", 4500, 1));

        product.add(new Character("텀블러", 18000, 2));
        product.add(new Character("피규어", 25000, 2));
    }
}
