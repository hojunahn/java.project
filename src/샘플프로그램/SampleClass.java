package 샘플프로그램;
/*
  이건 범위 주석 입니다. 주석은 컴파일러는 해석하지 않는 코드 영역이고 사람에게 알려 주는 내용 입니다.
  Author : 정경수
  Date : 2024.02.26
  Purpose : 자바 연습용 프로그램
 */
// [] : 배열을 정의 할 때 사용
// {} : 함수의 블록을 지정
// () : 함수의 매개변수 전달

public class SampleClass {
    public static void main(String[] args) {
        System.out.println("자바 개발을 시작 합니다.!!!!!");
        System.out.println("오늘은 날씨 쌀쌀해요.");
        int age = 100;
        if(true) {
            System.out.println("집에 가고 싶어요.");
        }
        System.out.println(age);
        System.out.println(7);
        System.out.println("7");
        System.out.println(7.00);

        System.out.printf("%d\n", 7);  // 정수 표현
        System.out.printf("%s\n", "7"); // 문자열 표현
        System.out.printf("%.2f\n", 7.00); // 실수형 표현
    }
}
