package com.project.c.java.kioskV2;

import com.project.c.java.kioskV2.product.Character;

public class ProcMenuCharacter {
    public static void run(){
        System.out.println("========================================");
        System.out.println("============= 캐릭터 상품 리스트   =======");
        System.out.println("========================================");
        loop_d:
        while(true){
            for(Product p : KioskObj.product){
                if(p instanceof Character){
                    System.out.println(p.name + " " + p.price + "원");
                }
            }

            System.out.println("[1.텀블러/ 2.피규어/x.이전 화면 이동]");
            KioskObj.cmd = KioskObj.sc.next();

            switch(KioskObj.cmd){
                case "1":
                    ProcOptionCharacter.run(8);
                    break;

                case "2":
                    ProcOptionCharacter.run(9);
                    break;

                case "x":
                    break loop_d;

                default:
                    System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
