package lambda;
import java.awt.event.*;
import javax.swing.*;

public class _01_Lambda {
    // 인터페이스를 구현한 익명 클래스의 객체
    static MyMax m = new MyMax() { 
        public int max(int a, int b){
            return a > b ? a : b;
        }
    };

    //람다식
    MyMax m2 = (int a, int b) -> a>b?a:b;
    static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
    public static void main(String[] args) {

        JButton btn = new JButton();
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("hello");
            }
        });
        btn.addActionListener((e) -> 
                System.out.println("hello"));

        MyFunction f0 = new MyFunction() {
            public void run() {
                System.out.println("MyFuction");
            };
        };
        f0.run();
        MyFunction f1 = ()-> {
            System.out.println("MyFunction");
            System.out.println("hello");
        };
        f1.run();
        
        MyFunction f2 = getMyFunction();
        f2.run();
    
        System.out.println(m.max(1,2));
        _01_Lambda lambda = new _01_Lambda();
        System.out.println(lambda.m2.max(1, 2));
    }
}
    


@FunctionalInterface
interface MyFunction {
    void run();
}
@FunctionalInterface
interface MyMax {
    int max(int a, int b);
}