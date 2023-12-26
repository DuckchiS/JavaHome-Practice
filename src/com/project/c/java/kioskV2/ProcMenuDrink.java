package com.project.c.java.kioskV2;

import com.project.c.java.kioskV2.product.Drink;

public class ProcMenuDrink {
    public static void run(){
        System.out.println("==================================");
        System.out.println("============= 음료 리스트    =======");
        System.out.println("==================================");
        loop_b:
        while(true){
            for(Product p : KioskObj.product){
                if(p instanceof Drink){
                    System.out.println(p.name + " " + p.price + "원");
                }
            }

            System.out.println("[1.아메리카노/ 2.초코라떼/ 3.바닐라라떼/ 4.녹차라떼/ 5.주스/ x.이전 화면 이동]");
            KioskObj.cmd = KioskObj.sc.next();
            switch(KioskObj.cmd){
                case "1":
                    ProcOptionHotCold.run(0);
                    break;

                case "2":
                    ProcOptionHotCold.run(1);
                    break;

                case "3":
                    ProcOptionHotCold.run(2);
                    break;

                case "4":
                    ProcOptionHotCold.run(3);
                    break;

                case "5":
                    System.out.println(KioskObj.product.get(4).name + "를 선택했습니다.");
                    KioskObj.basket.add(new Order(KioskObj.product.get(4)));
                    break;

                case "x":
                    System.out.println("이전 화면으로 이동합니다.");
                    break loop_b;

                default:
                    System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
