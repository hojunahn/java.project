package test;

import java.util.Scanner;

public class BreakEventPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt(); // 고정비용
        int varCost = sc.nextInt(); // 가변(생산)비용
        int sellprice = sc.nextInt(); // 판매금액

        if(varCost >= sellprice){ // 가변 비용이 판매금액과 같거나 크면 절대 이익이 날수 없음
            System.out.println("-1");
            return;
    }
        System.out.println(fixCost / (sellprice - varCost)+1);

  }
}
