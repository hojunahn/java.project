package Set인터페이스;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Set 인터페이스 : 중복을 허용하지 않음
// HashSet 클래스 : 순서 유지를 하지 않음, 중복 허용 하지 않음, 집합의 개념
public class HashSetBaseicEx {
    public static void main(String[] args) {
//        String[] data = {"H","e","l","l","o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(data));
//        System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");

        for (String e : set) System.out.println(e + " ");
    }
}
