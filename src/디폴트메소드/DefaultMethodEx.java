//package 디폴트메소드;
//
//import java.util.Scanner;
//
//// 디폴트 메소드란? 인터페이스에 있는 구현 메서드를 의미
//// 메서드 앞에 default 예약어 사용
//// {} 구현부가 존재해야 함
//public class DefaultMethodEx {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        RemoteControl remoteControl;
//        System.out.print("제품 선택 : [1]TV, [2]Audio : ");
//        int sel = sc.nextInt();
//        if (sel == 1){
//            remoteControl = new TV();
//            remoteControl.turnON();
//            remoteControl.setVolume(20);
//            remoteControl.setMute(true);
//            RemoteControl.changeBattery(); // 인터페이스에 있는 메소드 접근
//        }else {
//            remoteControl = new Audio();
//            remoteControl.turnON();
//            remoteControl.setvolume(39);
//        }
//        RemoteControl rc = new RemoteControl() {
//            @Override
//            public void turnON() {
//                System.out.println("플레이스테이션5 켭니다.");
//            }
//
//            @Override
//            public void turnOFF() {
//                System.out.println("플레이스테이션5 끕니다.");
//            }
//
//            @Override
//            public void setMaxVolume(int volume) {
//                if (volume > RemoteControl.MAX_VOLUME){
//                    this.volume = RemoteControl.MAX_VOLUME;
//                } else if (volume < RemoteControl.MIN_VOLUME) {
//                    this.volume = RemoteControl.MIN_VOLUME;
//                }else {
//                    this.volume = volume;
//                }
//                System.out.println("현재 TV 볼륨 : " + this.volume);
//            }
//        };
//        rc.turnON();
//        rc.setVolume(100);
//    }
//}
