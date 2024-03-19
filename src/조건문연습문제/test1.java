package 조건문연습문제;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("성적을 입력: ");
            int n = sc.nextInt();
            if(n<0 || n>100) {
                System.out.println("성적을 잘못 입력하셨습니다, 다시 입력하세요.");
                continue;
            }
            if (n >= 90 && n <= 100 )
                System.out.println("A");
            else if (n >= 80 && n <= 89 )
                System.out.println("B");
            else if (n >= 70 && n <= 79)
                System.out.println("C");
            else if (n >= 60 && n <= 69)
                System.out.println("D");
            else
                System.out.println("F");
                break;

        }
    }
}
