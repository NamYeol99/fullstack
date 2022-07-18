package object;

public class Exercise7_7 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        System.out.println(oi.iv);
        
        
    }
}
class Outer{
    static class Inner {
        int iv = 100;
    }
}