package 상속적용TV;

public class PrototypeTV {
    boolean isPower;
    int chennel;
    int volume;
    public PrototypeTV(){ // 생성자는 반환타입이 없고 클래스 이름과 동일, 생성자의 주요 목적은 인스턴스 필드 초기화
        this.isPower = false;
        this.chennel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩(동일한 이름의 메소드가 여러개 존재 하는 것, 매개변수의 타입이나 개수가 달라야함)
    public PrototypeTV(boolean isPower, int chennel, int volume){
        this.isPower = isPower;
        this.chennel = chennel;
        this.volume = volume;
    }
    public void setChennel(int cnl){
        if(cnl > 0 && cnl < 1000){
            chennel = cnl;
        }else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
