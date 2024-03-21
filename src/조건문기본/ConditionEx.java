package 조건문기본;
// 조건문이란? 제어문이다, 주어진 조건에 따라 명령을 수행
// 3항연산자(참/거짓), if문(if문, if ~ else, if ~ else if ~ else, switch문)
import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int num = sc.nextInt(); // 정수를 입력 받아 num 변수에 대입
        if (num > 100) {
            System.out.println(num + "은 100보다 커요.");
        } else if (num < 100) {
            System.out.println(num + "은 100보다 작아요.");
        } else {
            System.out.println(num + "은 100과 같아요");
        }
    }
}
