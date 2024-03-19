package 파일스캐너사용;

import java.util.Comparator;

public class DComparator implements Comparator<Score> {

    @Override
    public int compare(Score o1, Score o2) {
        if(o1.total < o2.total){
            return 1;
        }else if(o1.total == o2.total){
            if (o1.name.indexOf(0) < o2.name.indexOf(0)){
                return 1;
            }
        }
        return -1;
    }
}
