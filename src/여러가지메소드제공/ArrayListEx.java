package 여러가지메소드제공;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListEx {
    public static void main(String[] args) {
        // asList() 배열을 List로 변환하기 위해 사용
        String[] data = {"138","129","142"};
        LinkedList<String> pitches = new LinkedList<>(Arrays.asList(data));
        pitches.set(1,"189");
        System.out.println(pitches);
    }
}
