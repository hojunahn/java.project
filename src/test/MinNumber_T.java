package test;

import java.util.Scanner;

// 10 5
// 1 10 4 9 2 3 8 5 7 6
// = 1 4 2 3
public class MinNumber_T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수를 입력 받는 배열 수
        int x = sc.nextInt(); // 조건 비교를 위한 수(x 미만의 수 출력)
        int[] arr = new int[n];

        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt(); // 배열의 크기 만큼 임의의 값 입력
            if (arr[i] < x) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
