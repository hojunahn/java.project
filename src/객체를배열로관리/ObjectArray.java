package 객체를배열로관리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 객체를 배열로 관리, 배열의 각 요소가 기본 타입이 아니고 객체임을 의미
public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt= sc.nextInt();
//        NameCard[] nameCards = new NameCard[cnt]; // NameCard 클래스 타입의 배열 선언
        List<NameCard> list = new ArrayList<>(); // ArrayList로 하는법
        System.out.println("정보 입력 : ");
        System.out.println("-----------------------------------------");
        //        for (int i = 0; i < nameCards.length;i++){ ArrayList로 하는법
//            nameCards[i] = new NameCard();
//            System.out.print("이름 : ");
//            nameCards[i].setName(sc.next());
//            System.out.print("나이 : ");
//            nameCards[i].setAge(sc.nextInt());
//            System.out.print("이메일 : ");
//            nameCards[i].setMail(sc.next());
//            System.out.print("연락처 : ");
//            nameCards[i].setPhoneNumber(sc.next());
//        }
        for(int i = 0; i< cnt; i++){
            NameCard nameCard = new NameCard();
            System.out.print("이름 : ");
            nameCard.setName(sc.next());
            System.out.print("나이 : ");
            nameCard.setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCard.setMail(sc.next());
            System.out.print("연락처 : ");
            nameCard.setPhoneNumber(sc.next());
            list.add(nameCard);
        }
//        for(NameCard e : nameCards) e.printInfo(); ArrayList로 하는법
        for(NameCard e : list) e.printInfo();
    }
}
