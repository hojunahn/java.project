package 파일입출력과정렬;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("score.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
