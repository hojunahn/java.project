package 생성자TV만들기;

public class TV {
    private boolean isON; // 전원
    private  int channel;
    private  int volume;
    // 매개변수가 없는 기본 생성자
    TV(){
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : "+isON+",채널 : "+channel+",볼륨 : "+ volume);
    }
    // 생성자 오버로딩된 생성자
    TV(boolean isON, int channel, int volume){
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
    }
    public void setON(boolean onOff){
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF";// 불리언 값으로 받은 값을 ON/OFF 문자열로 변환
        System.out.println("TV 전원 : " + onOffStr);
    }
    public  void setChannel(int cnl){
        if (cnl >=1 && cnl <= 999){ // 인스턴스 핗드에 값을 쓰기전에 유효한 값인지 여부 확인
            channel = cnl;
            System.out.println("채널을 "+ channel + "변경 하였습니다.");
        }else {
            System.out.println("유효하지 않은 채널 입니다.");
        }
    }
    public void setVolume(int vol){
        if (vol >= 0 && vol <= 100){
            volume = vol;
            System.out.println("볼륨을 "+ volume + "변경 하였습니다.");
        }else {
            System.out.println("유효하지 않은 볼륨값 입니다.");
        }
    }
    public void prnTvInfo(){
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("===== TV 정보 =====");
        System.out.println("전월 : "+ onOffStr);
        System.out.println("볼륨 : "+ volume);
        System.out.println("채널 : "+channel);
    }


}
