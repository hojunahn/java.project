package 영화표예매;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket movieTicket = new MovieTicket(13000);
        while(true){
            System.out.print("[1]예매하기");
            System.out.print("[2]종료하기");
            int selMenu = sc.nextInt();
            if (selMenu == 1) movieTicket.selectSeat();
            else{
                System.out.println(movieTicket.totalAmount());
                break;
            }
        }
    }
}

