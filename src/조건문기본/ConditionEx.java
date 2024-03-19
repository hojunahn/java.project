package 조건문기본;

import java.util.Scanner;

//조건문이란? 제어문이다, 주어진 조건에 따라 명령을 수행
//3항연산자(참/거짓), if문(if문,if~else문,if else if-else,switch문)
public class ConditionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요: ");
        int num = sc.nextInt();//정수를 입력 받아 num 변수에 대입
        if(num > 100){
            System.out.println(num + "은 100보다 큽니다.");
        }else if (num < 100) {
            System.out.println(num + "은 100보다 작습니다.");
        }else{
            System.out.println(num + "은 100과 같습니다.");
        }
    }
}
