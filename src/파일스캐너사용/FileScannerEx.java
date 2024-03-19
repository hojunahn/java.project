package 파일스캐너사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

// 파일을 읽을 때 스캐너를 사용 할 수 있음
public class FileScannerEx {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./src/파일스캐너사용/score.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        TreeSet<Score> list = new TreeSet<>(new DComparator());
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] st = line.split(" ");
            while (true){
                String name = st[0];
                int mat = Integer.parseInt(st[1]);
                int eng = Integer.parseInt(st[2]);
                int kor = Integer.parseInt(st[3]);
                list.add(new Score(name,kor,eng,mat));break;
            }
        }
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()){
            Score score = iterator.next();
            System.out.print(score.getName() + " ");
            System.out.print(score.getTotal()+ " ");
            System.out.printf("%.2f",score.getAvg());
            System.out.println();
        }

    }
}
class Score{
    String name;
    int eng;
    int mat;
    int kor;
    int total;
    double avg;

    public double getAvg() {
        return avg;
    }

    public Score(String name, int kor, int eng, int mat) {
        this.name = name;
        this.eng = eng;
        this.mat = mat;
        this.kor = kor;
        this.total = kor + eng+ mat;
        this.avg = (double) total/3;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

