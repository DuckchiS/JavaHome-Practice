package com.project.c.java.kioskV2;

import com.project.c.java.kioskV2.product.Dessert;

public class ProcMenuDessert {
    public static void run(){
        System.out.println("==================================");
        System.out.println("============= 디저트 리스트  =======");
        System.out.println("==================================");
        loop_c:
        while(true){
            for(Product p : KioskObj.product){
                if(p instanceof Dessert){
                    System.out.println(p.name + " " + p.price + "원");
                }
            }

            System.out.println("[1.마카롱/ 2.쿠키/ 3.케잌/ x.이전 화면 이동]");
            KioskObj.cmd = KioskObj.sc.next();
            switch(KioskObj.cmd){
                case "1":
                    System.out.println(KioskObj.product.get(5).name + "을 선택했습니다.");
                    KioskObj.basket.add(new Order(KioskObj.product.get(5)));
                    break;

                case "2":
                    ProcOptionDessert.run(6);
                    break;

                case "3":
                    ProcOptionDessert.run(7);
                    break;

                case "x":
                    System.out.println("이전 화면으로 이동합니다.");
                    break loop_c;

                default:
                    System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
