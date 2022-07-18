package object;

public class _08_InheritanceCasting {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        // if (child instanceof Parent) System.out.println("상속관계");
        // else System.out.println("비상속관계");
        System.out.println((child instanceof Parent)?"상속관계":"비상속관계");
        System.out.println((child instanceof Object)?"상속관계":"비상속관계");
        System.out.println((parent instanceof Object)?"상속관계":"비상속관계");
        System.out.println((parent instanceof Child)?"상속관계":"비상속관계");
        // System.out.println((child instanceof Firebat)?"상속관계":"비상속관계");
        // Child c1 = (Child)new Parent(); // 형변환 부모(Parent) => 자식(Child) 원칙적으로 안됨
        Parent p1 = new Child(); //형변환 자식(Child) => 부모(Parent)    }
        Child c2 = (Child) p1; // 형변환 자 -> 부 -> 자 가능
        System.out.println(p1.age); // 상속관계의 형변환 속성은 부모꺼 사용
        p1.eat(); // 상속관계의 형변환일 때 메서드는 자식꺼 사용
        System.out.println(c2.age);
        c2.eat();
    }
}

class Parent {
    int age = 80;
    String name;
    void eat() {
        System.out.println("부모가 드세요");
    }
    
}
class Child extends Parent {
    int age = 30;
    String name;
    String study;
    void eat() {
        System.out.println("자식이 먹어요");
    }
}

class Father {
    int age;
}
class Moter {
    int age;
}
// class Child2 extends Father, Moter{ } // 자바는 단일 상속만 허용