package test;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        int call[] = new int[20];
        int y = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수: ");
        int n = sc.nextInt();
        System.out.print("통화 시간: ");

        for (int i =0; i<n; i++){
            call[i] = sc.nextInt();
        }
        for (int i = 0; i< n; i++){
            y += (call[i] / 30) * 10 + 10;
            m += (call[i] / 60) * 15 + 15;

        }
        if(y>m){
            System.out.println("m " + m);
        }else if (y<m) {
            System.out.println("y " + y);
        }else {
            System.out.println("y,m " + y);
        }
    }
}
