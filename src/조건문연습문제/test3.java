package 조건문연습문제;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String name = sc.nextLine();
        System.out.print("제목을 입력해주세요: ");
        String Title = sc.nextLine();
        System.out.print("날짜를 입력해주세요: ");
        String date = sc.nextLine();
        System.out.print("시간을 입력해주세요: ");
        String time = sc.nextLine();

        String month = date.substring(4,6);
        String x = "";
        switch (month){
            case "01": x = "한파의 연속인 1월 입니다.";break;
            case "02": x = "한파의 연속인 2월 입니다.";break;
            case "03": x = "봄의 기운이 느껴지는 3월 입니다";break;
            case "04": x = "새싹이 피어나는 4월 입니다.";break;
            case "05": x = "계절의 여왕 5월 입니다.";break;
            case "06": x = "활동하기 좋은 6월 입니다."; break;
            case "07": x = "휴가가 기다려지는 7월 입니다."; break;
            case "08": x = "무더운 8월 입니다."; break;
            case "09": x = "선선한 9월 입니다."; break;
            case "10": x = "천고마비의 계절 10월 입니다."; break;
            case "11": x = "쓸쓸한 늦가을 11월 입니다."; break;
            case "12": x = "한파의 연속인 12월 입니다."; break;
            default:
                System.out.println("날짜를 잘못 입력하셨습니다.");
        }


        System.out.println(name + "님");
        System.out.println(x);
        System.out.println("아래의 일정으로 "+Title+"를 진행하고자 하오니 오셔서 자를 빛내주시기 바랍니다.");
        System.out.println();
        System.out.println("===== 행사 안내 =====");
        System.out.println("행사 안내 : "+x);
        System.out.println("일시: "+date.substring(0,4)+"년"+date.substring(4,6)+"월"+date.substring(6,8)+"일");
        System.out.println("시간: "+time+"시");
    }
}
