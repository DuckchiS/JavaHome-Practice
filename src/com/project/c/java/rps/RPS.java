package com.project.c.java.rps;

import java.util.Scanner;

public class RPS {
    public void Rps(){
        String user;
        String result = "";
        Scanner sc = new Scanner(System.in);
        int com = (int)(Math.random() * 3 + 1);

        xx:
        while (true){
            System.out.println("가위 바위 보!!!!!");
            user = sc.next();

            switch (user){
                case "가위":
                    System.out.println("당신은 가위를 냈습니다.");
                    switch (com){
                        case 1:
                            result = "비겼습니다.";
                            break;
                        case 2:
                            result = "졌습니다.";
                            break;
                        case 3:
                            result = "이겼습니다.";
                            break;
                    }
                    break;

                case "바위":
                    System.out.println("당신은 바위를 냈습니다.");
                    switch (com){
                        case 1:
                            result = "이겼습니다.";
                            break;
                        case 2:
                            result = "비겼습니다.";
                            break;
                        case 3:
                            result = "졌습니다.";
                            break;
                    }
                    break;

                case "보":
                    System.out.println("당신은 보를 냈습니다.");
                    switch (com){
                        case 1:
                            result = "졌습니다.";
                            break;
                        case 2:
                            result = "이겼습니다.";
                            break;
                        case 3:
                            result = "비겼습니다.";
                            break;
                    }
                    break;

                case "x":
                    System.out.println("게임을 종료합니다.");
                    break xx;

                default:
                    result = "error";
                    System.out.println("다른 것을 냈습니다. 다시 내세요.");
                    break;
            }
            System.out.println("결과는 " + result);
        }
    }
}
