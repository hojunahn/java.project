package 예외처리미루기;

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) throws IOException {
        IOSample test = new IOSample();
            test.input();
            test.output();
    }
}
class IOSample{
    private int num;
    public void input() throws IOException{
        num = System.in.read();
    }
    public void output(){
        System.out.println(num);
    }
}
