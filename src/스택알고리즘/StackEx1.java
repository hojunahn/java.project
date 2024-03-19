package 스택알고리즘;

import java.util.Scanner;
import java.util.Stack;

// 스택을 사용한 괄호 열림/닫힘 확인
public class StackEx1 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        for (int i = 0; i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '(') {
                st.push(ch); // 열림 괄호이면 push
            } else if (ch == ')') {
                if(!st.isEmpty()) st.pop();
                else {
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if (st.isEmpty()){
            System.out.println("괄호가 일치합니다.");
        }else {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
