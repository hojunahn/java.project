package Comparator예제;

import java.util.Iterator;
import java.util.TreeSet;

// 객체 정리를 위해서 사용, 두개의 객체를 받아서 정렬 해줌
public class ComparatorEx {
    public static void main(String[] args) {
        TreeSet<Frult> list = new TreeSet<>(new DesendingComparator());
        list.add(new Frult("포도",3000));
        list.add(new Frult("수박",10000));
        list.add(new Frult("딸기",18000));
        list.add(new Frult("복숭아",18000));
//        Iterator<Frult> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Frult frult = iterator.next();
//            System.out.println(frult.name + " : " + frult.price);
//        }
        for (Frult e : list) System.out.println(e.name + " : " + e.price);
    }
}
