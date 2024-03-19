package 객체타입확인;
// 객체 타입을 확인하는 instanceof
public class ObjectType {
    public static void main(String[] args) {
        Child child = new Child("fff");

//        Parent parent = new Parent("부모 클래스");
//        Child child = new Child("자식 클래스");
//        System.out.println(parent instanceof Parent); // True
//        System.out.println(child instanceof Parent); // 상속 관계가 성립하므로 True
//        System.out.println(parent instanceof Child); // False
//        System.out.println(child instanceof Child); // True

//        Parent parent1 = new Child("ddd"); True
//        Child child1 = new Parent("ddd"); False
    }
}
class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}
class Child extends Parent{
    Child(String name){
        super(name); // 부모 생성자 호출,부모가 기본 생성자면 안불러도 된다
        this.name = name;
    }
}