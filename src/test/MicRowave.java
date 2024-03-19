package test;

import java.util.Scanner;

public class MicRowave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int T = sc.nextInt();
        int a;
        int b;
        int c;
        if(T%10 != 0){
            System.out.print("-1");
        }else{
            a = T % 300;
            b = T % 300 / 60;
            c = T % 300 / 10;
            System.out.printf("%d%d%d\n",a,b,c);
        }
    }
}
