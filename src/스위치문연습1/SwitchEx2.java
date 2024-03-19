package 스위치문연습1;

import java.util.Scanner;

//스위치문에서 조건을 비교하는 변수로 사용될수 있는 것은 정수,문자,문자열 가능(실수는 안됨)
public class SwitchEx2 {
    public static void main(String[] args) {
        int x,y; //좌번값과 우변값
        char op; //연산자
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 입력: ");
        x = sc.nextInt();
        op = sc.next().charAt(0);
        y = sc.nextInt();

        switch (op){
            case '+':
                System.out.println("덧셈 결과: " + (x+y) );
                break;
            case '-':
                System.out.println("뺄셈 결과: " + (x-y));
                break;
            case '*':
                System.out.println("곱셈 결과: " + (x*y));
                break;
            case '/':
                System.out.println("나눗셈 결과: " + ((double)x/y));
                break;
            default:
                System.out.println("계산식을 잘못 입력하셨습니다.");
        }
    }
}
