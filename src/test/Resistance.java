package test;

import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        String[] Color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int[] val = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        Scanner sc = new Scanner(System.in);
        System.out.println("3가지 색을 입력하세요 : ");
        String First = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();



        int A = 0, B = 0, C= 0;

        for (int i = 0; i<10;i++){
            if (First.equals(Color[i])){
                A = i;
            }
            if(second.equals(Color[i])){
                B = i;
            }
            if(third.equals(Color[i])){
                C = val[i];
            }

        }
        System.out.println(((A*10)+B)*C);
    }
}