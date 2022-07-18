package exception;

public class _02_Throws {
    public static void main(String[] args) throws Exception{
        method1();
    }
    static void method1() throws Exception{ 
        method2();
    }
    static void method2() throws Exception{
        method3();
    }
    static void method3() throws Exception { // 자신을 호출한 메서드에 Exception위임
        throw new Exception();
        
    }
}
