package 단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

// 길이가 짧은 것, 길이가 같으면 사전 순, 중복제거
public class WordSortEx {
    public static void main(String[] args) {
        // 사용자로 부터 n개의 수를 입력 받음
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n개의 문자열을 입력 받은 배열 생성하고, 문자열을 줄바꿈 기준으로 입력 받음
        String[] word = new String[n];
        sc.nextLine(); // 입력 받은 줄바꿈 문자를 소모시킴
        for (int i = 0; i<word.length;i++){
            word[i] = sc.nextLine(); // 줄바꿈(enter) 기준으로 입력 받아서 배열에 담음
        }
        // 중복 제거
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // 입력된 문자열을 중복을 제거하기 위해 HashSet에 저장 후,
        // Arrays.asList()를 사용하여 배열을 리스트로 변환후 HashSet 생성자에 전달
        word = hashSet.toArray(new String[0]); // Set의 길이를 유지하면서 배열로 변환
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2); // 앞에 값이 사전순으로 뒤에 있는 경우 양수반환
                }else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
