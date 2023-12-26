package com.project.c.java.kioskV2;

import static com.project.c.java.kioskV2.KioskObj.product;

public class Kiosk {
    public void run() {
        Display.title();
        KioskObj.productLoad();
        loop_a:
        while (true){
            System.out.println("어떤 메뉴를 주문하시겠습니까?");
            System.out.println("1번 음료/ 2번 디저트/ 3번 캐릭터 상품/ x는 키오스크 종료입니다.");
            KioskObj.cmd = KioskObj.sc.next();
            switch (KioskObj.cmd){
                case "1":
                    ProcMenuDrink.run();
                    break;

                case "2":
                    ProcMenuDessert.run();
                    break;

                case "3":
                    ProcMenuCharacter.run();
                    break;

                case "x":
                    int count = KioskObj.basket.size();
                    System.out.println("주문한 상품 갯수: " + count);
                    int sum = 0;
                    for(Order o : KioskObj.basket){
                        sum = sum + o.selectProduct.price;
                    }
                    for(Order o : KioskObj.basket){
                        if(o.selectProduct.type == 0){
                            String str = "";
                            String str1 = "";
                            if(o.optionHotCold == 1){
                                str = "hot";
                            }

                            if(o.optionHotCold == 2){
                                str = "ice";
                            }

                            if(o.optionSize == 1){
                                str1 = "regular";
                            }

                            if(o.optionSize == 2){
                                str1 = "large";
                            }

                            if(o.optionSize == 3){
                                str1 = "venti";
                            }

                            System.out.println(str + o.selectProduct.name + " 사이즈:" + str1);
                        }

                        if(o.selectProduct.type == 1){
                            String str = "";
                            if(o.optionDessert == 1){
                                str = "plain";
                            }

                            if(o.optionDessert == 2){
                                str = "choco";
                            }

                            if(o.optionDessert == 3){
                                str = "cheese";
                            }
                            System.out.println(str + o.selectProduct.name);
                        }

                        if(o.selectProduct.type == 2){
                            String str = "";
                            if(o.optionCharacter == 1){
                                str = "Ahri";
                            }

                            if(o.optionCharacter == 2){
                                str = "Zed";
                            }

                            if(o.optionCharacter == 3){
                                str = "Timo";
                            }
                            System.out.println(str + o.selectProduct.name);
                        }
                    }
                    System.out.println("===========================");
                    System.out.println("키오스크 종료합니다.");
                    break loop_a;
            }
        }
    }
}
