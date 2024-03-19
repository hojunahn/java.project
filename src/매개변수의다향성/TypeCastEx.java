package 매개변수의다향성;

import java.util.Scanner;

public class TypeCastEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("구입할 제품 입력(TV[1] /Computer[2] /Audio[3] /종료[4]) : ");
            int selNumber = sc.nextInt();
            switch (selNumber){
                case 1:
                    System.out.println("TV를 구입합니다.");
                    buyer.buy(tv); break;
                case 2:
                    System.out.println("Computer를 구입합니다.");
                    buyer.buy(computer); break;
                case 3:
                    System.out.println("Audio를 구입합니다.");
                    buyer.buy(audio); break;
                case 4:
                    buyer.viewInfo();
                    return;
                default: break;
            }
        }
    }
}
class Product{
    int price;
    int BonusPoint;
}
class TV extends Product{
    String name;
    TV(){
        this.name = "my tv";
        this.price = 100;
        this.BonusPoint = 10;
    }
}
class Computer extends Product{
    Computer(){
        this.price = 200;
        this.BonusPoint = 20;
    }
}
class Audio extends Product{
    Audio(){
        this.price = 120;
        this.BonusPoint = 12;
    }
}
class Buyer {
    int money = 1000;
    int BonusPoint = 0;
    void buy(Product p){
        money -= p.price;
        BonusPoint += p.BonusPoint;
    }
    void viewInfo(){
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + BonusPoint);
    }
}
