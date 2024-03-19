package test;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] cnt = new String[num];

        for (int i = 0; i < cnt.length; i++){
            cnt[i] = sc.next();
        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(cnt));
        ArrayList<String> sortedList = new ArrayList<>(hashSet);

    }
}
