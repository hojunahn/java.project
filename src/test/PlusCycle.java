package test;

import java.util.Scanner;
public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력: ");
        int number = sc.nextInt();
        int add;
        int cnt = 0;
        while (true){
                add = (number / 10) + (number % 10);
                ++cnt;
            System.out.println(cnt);
            System.out.println(add);
            break;
//                if(number == add){
//                    System.out.println(cnt);
//                    break;
//                }
            }

        }
    }
