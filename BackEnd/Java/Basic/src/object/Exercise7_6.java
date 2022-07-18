package object;

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
        System.out.println(oi.iv);
        
        
    }
}
class Outer{
    class Inner {
        int iv = 100;
    }
}