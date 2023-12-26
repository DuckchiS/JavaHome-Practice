package com.project.c.java.kioskV2;

public class ProcOptionDessert {
    public static void run(int i){
        loop:
        while(true){
            System.out.println("[1.plain/ 2.choco/ 3.cheese/ x.이전메뉴로]");
            KioskObj.cmd = KioskObj.sc.next();

            switch(KioskObj.cmd){
                case "1":
                    System.out.println(KioskObj.product.get(i).name + "선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(KioskObj.product.get(i), 1));
                    break loop;

                case "2":
                    System.out.println(KioskObj.product.get(i).name + "선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(KioskObj.product.get(i), 2));
                    break loop;

                case "3":
                    System.out.println(KioskObj.product.get(i).name + "선택됨. 이전 메뉴 이동");
                    KioskObj.basket.add(new Order(KioskObj.product.get(i), 3));
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
