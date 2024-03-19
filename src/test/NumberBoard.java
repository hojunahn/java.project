package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 각 번호에 대한 자리수와 확인
// 공백 확인
public class NumberBoard {
    public static void main(String[] args) {
        // 각 번호가 차지하는 자리수 배열 만들기
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        List<Integer> rst = new ArrayList<>(); //
        int sum = 0; // 각 수가 차지하는 크기를 누적, 각 자리수와 여백 포함
        Scanner sc = new Scanner(System.in);
        while (true){
            String num = sc.nextLine(); // 공백을 만날때까지 문자열을 입력 받음
            if(num.equals("0")) break; // 입력값이 0이면 탈출
            for (int i =0;i<num.length();i++){ // 입력받은 문자열의 길이만큼 반복
                sum += numSize[num.charAt(i) - '0'] + 1; // ASCII코드값으로 정수값을 계산하고, 값을 1을 더함
            }
            rst.add(sum + 1); // 1을 더해주는 이유는 맨 앞의 여백 계산
            sum = 0; // 반복문을 통해 sum에 누적된 값을 초기화
        }
        for (int e : rst) System.out.println(e);
    }
}
