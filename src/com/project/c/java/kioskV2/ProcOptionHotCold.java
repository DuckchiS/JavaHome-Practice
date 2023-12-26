package com.project.c.java.kioskV2;

public class ProcOptionHotCold {
    public static void run(int i){
        loop:
        while(true){
            System.out.println("[1.hot/ 2.cold/ x.이전메뉴로]");
            KioskObj.cmd = KioskObj.sc.next();
            switch(KioskObj.cmd){
                case "1":
                    System.out.println(KioskObj.product.get(i).name + " hot 선택됨. 사이즈 선택");
                    System.out.println("[1.regular/ 2.large/ 3.venti/ x.이전메뉴로]");
                    KioskObj.cmd = KioskObj.sc.next();
                    switch(KioskObj.cmd){
                        case "1":
                            System.out.println(KioskObj.product.get(i).name + " hot 사이즈 regular 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 1 ,1));
                            break loop;

                        case "2":
                            System.out.println(KioskObj.product.get(i).name + " hot 사이즈 large 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 1 ,2));
                            break loop;

                        case "3":
                            System.out.println(KioskObj.product.get(i).name + " hot 사이즈 venti 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 1 ,3));
                            break loop;

                        case "x":
                            System.out.println("이전 메뉴 이동");
                            break loop;

                        default:
                            System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                            break;
                    }
                    break loop;

                case "2":
                    System.out.println(KioskObj.product.get(i).name + " ice 선택됨. 사이즈 선택");
                    System.out.println("[1.regular/ 2.large/ 3.venti/ x.이전메뉴로]");
                    KioskObj.cmd = KioskObj.sc.next();
                    switch(KioskObj.cmd){
                        case "1":
                            System.out.println(KioskObj.product.get(i).name + " ice 사이즈 regular 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 2 ,1));
                            break loop;

                        case "2":
                            System.out.println(KioskObj.product.get(i).name + " ice 사이즈 large 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 2 ,2));
                            break loop;

                        case "3":
                            System.out.println(KioskObj.product.get(i).name + " ice 사이즈 venti 선택");
                            KioskObj.basket.add(new Order(KioskObj.product.get(i), 2 ,3));
                            break loop;

                        case "x":
                            System.out.println("이전 메뉴 이동");
                            break loop;

                        default:
                            System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                            break;
                    }
                    break loop;

                case "x":
                    System.out.println("이전 메뉴 이동");
                    break loop;

                default:
                    System.out.println("옵션에 없습니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
