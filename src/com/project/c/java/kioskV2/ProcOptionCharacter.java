package com.project.c.java.kioskV2;

public class ProcOptionCharacter {
    public static void run(int i){
        loop:
        while(true){
            System.out.println("[1.Ahri/ 2.Zed/ 3.Timo/ x.이전메뉴로]");
            KioskObj.cmd = KioskObj.sc.next();

            switch(KioskObj.cmd){
                case "1":
                    System.out.println("Ahri" + KioskObj.product.get(i).name + " 선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(1, KioskObj.product.get(i)));
                    break loop;

                case "2":
                    System.out.println("Zed" + KioskObj.product.get(i).name + " 선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(2, KioskObj.product.get(i)));
                    break loop;

                case "3":
                    System.out.println("Zed" + KioskObj.product.get(i).name + " 선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(3, KioskObj.product.get(i)));
                    break loop;

                case "x":
                    System.out.println("이전 화면 이동");
                    break loop;

                default:
                    System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
