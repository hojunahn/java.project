package 파일스캐너사용;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class FileScannerEx2 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        TreeSet<Score> list = new TreeSet<>(new DComparator());
        try {
            inputStream = new FileInputStream("./src/파일스캐너사용/score.txt");
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] st = line.split(" ");

                String name = st[0];
                int mat = Integer.parseInt(st[1]);
                int eng = Integer.parseInt(st[2]);
                int kor = Integer.parseInt(st[3]);

                list.add(new Score(name, kor, eng, mat));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        int num = 0;
        for (Score score : list){
            num++;
            System.out.print(num + "번" + " ");
            System.out.print(score.getName() + " ");
            System.out.print(score.getTotal() + " ");
            System.out.printf("%.2f",score.getAvg());
            System.out.println();
        }
    }
}
