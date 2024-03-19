package 조건문연습문제;

import java.util.Scanner;

public class test1_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//입력을 받기 위해 한번만 생성
        int score;
        while(true){//성적이 잘못 입력된 경우 입력 처리를 하기 위해서
            System.out.print("성적을 입력 하세요: ");
             score = sc.nextInt();
             if(score < 0 || score > 100) continue; //continue = 아래 코드를 수행하지 않고 반복문의 조건으로 돌아감
             if(score >= 90) System.out.println("A");
             else if (score >= 80) System.out.println("B");
             else if (score >= 70) System.out.println("C");
             else if (score >= 60) System.out.println("D");
             else System.out.println("F");
             break; //반복문과 switch-case의 탈출조건으로 사용됨
        }
    }
}
