package 쓰레드1번;
// Thread란 : 동시에 여러가지 일을 병렬적으로 수행하는 것
// Thread를 만드는 방법
// 1. Thread class를 상속 받는 방법
// 2. Runnable 인터페이스를 상속 받는 방법
public class ThreadEx1 {
    public static void main(String[] args) {
        Thread thread1 = new CustomThread();
        thread1.start();
        System.out.println("Main Thread ...");
        Thread thread2 = new CustomThread();
        thread2.start();
        Runnable task = new Sample();
        Thread thread3 = new Thread(task);
        thread3.start();
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i<=10;i++){
                sum+=i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread() + "값");
        };
        Thread thread4 = new Thread(task2);
        thread4.start();
    }
}
class CustomThread extends Thread {
    @Override
    public void run(){
        int sum = 0;
        for (int i = 0; i<=10;i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "값");
    }
}
class Sample implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i<=10;i++){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "값");

    }
}