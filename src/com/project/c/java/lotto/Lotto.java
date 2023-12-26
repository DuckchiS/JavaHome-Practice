package com.project.c.java.lotto;

public class Lotto {
    public void random() {
        int userLotto[] = new int[6];
        int comLotto[] = new int[6];
        String str = "";
        int win = 0;
        int bonus = 0;


        for(int i = 0; i < userLotto.length; i++){
            userLotto[i] = (int)(Math.random() * 45 + 1);
            for(int j = 0; j < i; j++) {
                if (userLotto[i] == userLotto[j]) {
                    i--;
                    break;
                }
            }
        }
        for(int k = 0; k < userLotto.length; k++){
            System.out.println("유저: " + userLotto[k]);
        }

        for(int a = 0; a < comLotto.length; a++){
            comLotto[a] = (int)(Math.random() * 45 + 1);
            for(int b = 0; b < a; b++){
                if(comLotto[a] == comLotto[b]){
                    a--;
                    break;
                }
            }
        }
        for(int c = 0; c < comLotto.length; c++){
            System.out.println("컴퓨터: " + comLotto[c]);
        }

        if(bonus != comLotto[0] && bonus != comLotto[1] && bonus != comLotto[2]
        && bonus != comLotto[3] && bonus != comLotto[4] && bonus != comLotto[5]){
            bonus = (int)(Math.random() * 45 + 1);
            System.out.println("보너스 번호: " + bonus);
        }

        for(int q = 0; q < 6; q++){
            for(int w = 0; w < 6; w++){
                if(userLotto[q] == comLotto[w]){
                    win = win + 1;
                }
            }
        }
        System.out.println("맞춘 갯수: " + win + "개");

        switch (win){
            case 0:
            case 1:
            case 2:
                str = "꽝 다음 기회에";
                break;
            case 3:
                str = "5등 입니다.";
                break;
            case 4:
                str = "4등 입니다.";
                break;
            case 5:
                str = "3등 입니다.";
                if(bonus == userLotto[0] && bonus == userLotto[1] && bonus == userLotto[2] &&
                        bonus == userLotto[3] && bonus == userLotto[4] && bonus == userLotto[5]){
                    str = "2등 입니다.";
                }
                break;
            case 6:
                str = "1등 입니다. 축하합니다.";
                break;
        }
        System.out.println(str);

    }
}
