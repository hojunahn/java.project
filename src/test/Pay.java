package test;

import java.util.Scanner;

//
public class Pay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("고정비용,생산비용,판매비용: ");
        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 생산비용
        int C = sc.nextInt(); // 판매비용

        if(B >= C){
            System.out.println("-1");
            return;
        }
        System.out.println(A / (C-B)+1);
    }
}
