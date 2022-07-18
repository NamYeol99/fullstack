package object;

public class _11_interface_default_static {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        Child3 child3 = new Child3();
        child3.method1();
        // child3.method2();
    }
}
class Child3 implements MyInterface, MyInterface2 {
    // MyInterface와 MyInterface2의 method1()이 충돌날 때는 재정의 하라!
    @Override
    public void method1() {
        System.out.println("method1()이 충돌나서 재정의함");
    }
}
interface MyInterface {
    //public 생략가능, 기본적인 기능 구현,
    public default void method1() {
        System.out.println("default method1 in MyInterface");
    }
    public default void method2() {
        System.out.println("default method2 in MyInterface");
    }
    //interface의 static 메서드 이므로 MyInterface.staticMethod()로 접근가능
    public static void staticMethod(){
        System.out.println("static method in MyInterface");
    }
}
interface MyInterface2 {
    //public 생략가능, 기본적인 기능 구현,
    public default void method1() {
        System.out.println("default method1 in MyInterface2");
    }
}
