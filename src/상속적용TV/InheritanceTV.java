package 상속적용TV;
// 시제품 TV를 만들고 상속받아서 기능이 개선된 양산용 TV 만들기
public class InheritanceTV {
    public static void main(String[] args) {
//        ProductTV productTV = new ProductTV();
        ProductTV lgTV = new ProductTV("MY HOME TV");
        lgTV.setPower(true);
        lgTV.setVolume(90);
        lgTV.setChennel(1500,true);
        lgTV.viewTV();
    }
}
