package object;

public class _13_InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InstanceInner oi = outer.new InstanceInner(); // 내부클래스 접근
        System.out.println(oi.iv);
        Outer.StaticInner os = new Outer.StaticInner(); // 스태틱내부클래스 접근
        System.out.println(os.iv);
        outer.myMethod(); // 내부메서드 접근
        
    }
}
class Outer{
    class InstanceInner {
        int iv = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int sv = 300;
    }
    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
        System.out.println(new LocalInner().iv); //내부메서드 접근
    }
}