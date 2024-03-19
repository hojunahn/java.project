package test;

import java.util.Scanner;




// 결과 출력
public class MinWord {
    public static void main(String[] args) {
        int sum = 0; // 각 알파벳의 총 숫자의 합을 구하는 변수
        boolean isPrice = true; // 소수 여부를 판별하는 Bool Type 변수(기본값을 소수)

        // 영어 단어를 입력 받기
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        // 각 영어 단어에서 주어진 수를 누적(a = 1, A = 27)
        for (int i = 0; i<word.length();i++){
            if (word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println(sum); // 각 영어 알파벳을 더해서 총 숫자의 합을 구하기
        // 소수 여부 판별하기

        // 누적된 값이 소수인지 아닌지 판별
        for (int i = 2; i < sum; i++){ // 1과 자기 자신을 제외하고 반복문 순회
            if (sum % 1 == 0) isPrice = false;
        }
        if (isPrice) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
