package Comparator예제;

import java.util.Comparator;

public class DesendingComparator implements Comparator<Frult> {
    @Override
    public int compare(Frult o1, Frult o2) {
        if (o1.price < o2.price)return 1;
        else if (o1.price == o2.price){
            return o1.name.compareTo(o2.name);
        }
        return -1;
    }
}
