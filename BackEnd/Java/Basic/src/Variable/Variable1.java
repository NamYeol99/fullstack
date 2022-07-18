public class Variable1 {
    static boolean b1;
    static char c1;
    public static void main(String[] args) {
        boolean b2 = true;
        char c2 = 'A';
        // char c3 = 'hello';
        System.out.println(b2);
        // Variable1 v1 = new Variable1();
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(c2+1);
        byte bt1 = 127;
        byte bt2 = (byte)200;
        System.out.println(bt1+10);
        System.out.println(bt2);
        short s1 = 32767;
        short s2 = (short) 32768;
        int i1 = 2147483647;
        long l1 = 2147483648L;
        float f1 = 0.123456789f;
        double d1 = 0.1234567890123456789;
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
    }
}
