package com.project.c.java.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("================= 고양이카페       ===========");
        System.out.println("============================================");

        Product p1 = new Product("아아", 1500);
        Product p2 = new Product("뜨아", 1500);
        Product p3 = new Product("바닐라 라떼", 3500);
        Product p4 = new Product("초코 라떼", 3000);
        Product p5 = new Product("마카롱", 2000);
        Product p6 = new Product("쿠키", 1200);
        Product p7 = new Product("케잌", 4500);

        Scanner sc = new Scanner(System.in);
        String cmd;

        loop_a:
        while (true){
            System.out.print("명령:[1.음료/2.디저트/x.종료]");
            cmd = sc.next();
            switch (cmd){
                case "1":
                    System.out.println("==================================");
                    System.out.println("============= 음료 리스트    =======");
                    System.out.println("==================================");
                    p1.info();
                    p2.info();
                    p3.info();
                    p4.info();
                    loop_b:
                    while(true){
                        System.out.println("명령:[1.아아/2.뜨아/3.바닐라 라떼/4.초코 라떼/x.종료]");
                        cmd = sc.next();
                        switch (cmd){
                            case "1":
                                System.out.println("아아를 주문했습니다. 가격은 1500원입니다.");
                                break;
                            case "2":
                                System.out.println("뜨아를 주문했습니다. 가격은 1500원입니다.");
                                break;
                            case "3":
                                System.out.println("바닐라 라떼를 주문했습니다. 가격은 3500원입니다.");
                                break;
                            case "4":
                                System.out.println("초코 라떼를 주문했습니다. 가격은 3000원입니다.");
                                break;
                            case "x":
                                System.out.println("초기화면으로 이동합니다.");
                                break loop_b;
                            default:
                                System.out.println("옵션에 없습니다. 다시 입력하세요.");
                                break;
                        }
                    }
                    break;

                case "2":
                    System.out.println("==================================");
                    System.out.println("============= 디저트 리스트    =======");
                    System.out.println("==================================");
                    p5.info();
                    p6.info();
                    p7.info();
                    loop_c:
                    while(true){
                        System.out.println("명령:[1.마카롱/2.쿠키/3.케잌/x.종료]");
                        cmd = sc.next();
                        switch (cmd){
                            case "1":
                                System.out.println("마카롱를 주문했습니다. 가격은 2000원입니다.");
                                break;
                            case "2":
                                System.out.println("쿠키를 주문했습니다. 가격은 1200원입니다.");
                                break;
                            case "3":
                                System.out.println("케잌를 주문했습니다. 가격은 4500원입니다.");
                                break;
                            case "x":
                                System.out.println("초기화면으로 이동합니다.");
                                break loop_c;
                            default:
                                System.out.println("옵션에 없습니다. 다시입력하세요.");
                                break;
                        }
                    }
                    break;

                case "x":
                    System.out.println("프로그램을 종료합니다.");
                    break loop_a;

                default:
                    System.out.println("옵션에 없습니다. 다시입력하세요");
                    break;
            }
        }


    }
}
