package 예외상황4번;

import java.util.Scanner;
// ArithmeticException
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int c = sc.nextInt();
            try {
                rst = a / c;
            }catch (ArithmeticException e){
//                System.out.println("0으로 나눌 수 없습니다. 다시 입력 하세요.");
//                continue;
                rst = -1;
            }finally {
                System.out.println("프로그램을 정상 종료 합니다.");
                System.out.println("결과 : " + rst);
                break;
            }
        }
    }
}
