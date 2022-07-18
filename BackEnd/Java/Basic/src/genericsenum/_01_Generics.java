package genericsenum;

import java.util.ArrayList;

public class _01_Generics {
    public static void main(String[] args) {
        //Generics의 장점
        //1. 타입의 안정성
        //2. 형변환 생략으로 코드 간결
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person());
        // list.add(100); //에러
        
        System.out.println(list.get(0));
    }
}
class Person {
    String name ="asd";
}

