package test;

import java.util.Scanner; // 해당하는 클래스를 import 해서 사용

// 영식 요금제 : 30초에 10원
// 민식 요금제 : 60초에 15원
// 총 통화 개수 20회
public class MobilePay {
    public static void main(String[] args) {
        int[] call = new int[20]; // 총 통화 횟수에 대한 시간 저장
        int yPay = 0,mPay = 0; // 각각의 요금제에 총 요금 누적하는 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 입력: ");
        int cnt = sc.nextInt();
        System.out.println("통화 시간 입력: ");

        for(int i =0; i<cnt;i++){ // 총 통화 횟수 만큼 반복하면서 통화 시간을 call 배열에 대입
            call[i] = sc.nextInt();
        }
        for(int i = 0; i<cnt; i++){
            yPay +=(call[i] / 30) * 10 + 10;// 각 배열의 통화 시간을 요금으로 환산하고 누적 함
            mPay +=(call[i] / 60) * 15 + 15;
        }
        if (yPay > mPay){
            System.out.println("M"+ mPay);
        } else if (yPay < mPay) {
            System.out.println("Y"+yPay);
        }else {
            System.out.println("Y M" + yPay);
        }

    }
}
