package test;

import java.util.Arrays;
import java.util.Scanner;

// 1: 각 숫자 사이에는 1cm의 여백이 들어감
// 2: 1은 2cm의 너비를 차지함,0은 4cm의 너비이며 나머지 숫자는 모두 3cm
// 3: 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다
public class HomeAdress {
    public static void main(String[] args) {
        int Number[] = {4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("입력: ");
        int sum = 0;
        while (true){
            String n = sc.nextLine();
            for (int i = 0; i<n.length();i++){
                if (n.length()==0){
                    sum+=Number[0]+1;

                } else if (n.length()==1) {
                    sum+=Number[1]+1;
                }else {
                    sum+=3+1;
                }
            }
            System.out.println(sum);
        }
    }
}
