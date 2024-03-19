package 스트림활용;

import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        TravelCtomer customerA = new TravelCtomer("안유진", 21 , 100);
        TravelCtomer customerB = new TravelCtomer("유나", 21 , 100);
        TravelCtomer customerC = new TravelCtomer("지수", 25 , 80);
        List<TravelCtomer> customerList = new ArrayList<>();
        customerList.add(customerA);
        customerList.add(customerB);
        customerList.add(customerC);
        customerList.add(new TravelCtomer("민지", 18,90));
        System.out.println("고객 명단 순서대로 출력");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total);
        System.out.println("== 20세 이상 명단 출력 ==");
        customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(c -> c.getName())
                .sorted()
                .forEach(s-> System.out.println(s));

    }
}
class TravelCtomer{
    private String name;
    private int age;
    private int price;

    public TravelCtomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
