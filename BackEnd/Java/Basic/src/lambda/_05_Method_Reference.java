package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class _05_Method_Reference {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s); // 람다식

        //메서드 참조 => 람다식이 하나의 메서드만 호출할 경우
        Function<String, Integer> f1 = Integer::parseInt; //메서드 참조

        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s1 = MyClass::new; //생성자의 메서드 참조
        
        Function<Integer, int[]> f2 = i -> new int[i]; //크기가 1인 배열 반환
        Function<Integer, int[]> f3 = int[]::new;; //배열의 메서드 참조

    }
}
class MyClass{}
