package 조건문연습문제;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요: ");
        x = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        y = sc.nextInt();
        System.out.print("세번째 정수를 입력하세요: ");
        z = sc.nextInt();

        if(x > y && x > z){
            System.out.println("x 정수가 제일 큽니다." +x);
        } else if (y > x && y > z) {
            System.out.println("y 정수가 제일 큽니다." + y);
        }else {
            System.out.println("z 정수가 제일 큽니다." +z);
        }
    }
}
