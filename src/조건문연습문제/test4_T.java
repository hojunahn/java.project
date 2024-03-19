package 조건문연습문제;

import java.util.Scanner;
// 상근이 알림 작업 완료

public class test4_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력(시/분): ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int calc = (hour * 60) + min; //calc는 계산의 편의를 위해서 시간과 분을 모두 분으로 환산
        if(calc < 45){
            calc = (24 * 60) + min;
        }
        calc -= 45;
        System.out.println((calc / 60)+":"+(calc % 60));
    }
}
