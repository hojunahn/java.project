package Comparable예제;

import java.util.TreeSet;

// Comparable/Comparator 인터페이스는 객체들을 정렬하는 데 사용되는 인터페이스
// Comparable : 자기 자신과 외부로 부터 전달된 객체를 비교
// Comparator : 두개의 객체를 전달 받아 비교해 줌
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComparable> list = new TreeSet<>();
        list.add(new CarComparable("Santafe",2016,"흰색"));
        list.add(new CarComparable("Sorento",2012,"은색"));
        list.add(new CarComparable("Grandeur",2018,"블랙"));
        list.add(new CarComparable("Morning",2012,"오랜지"));

        for (CarComparable e : list){
            System.out.println(e.modelName + " : " + e.modelYear);
        }
    }
}
