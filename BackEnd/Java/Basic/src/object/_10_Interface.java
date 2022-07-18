package object;



public class _10_Interface {
    public static void main(String[] args) {
        Mammals mammals[] = new Mammals[]{new Lion(), new Rabbit(), new Bat()};
        Birds birds[] = new Birds[]{new Enagle(), new Penguin(), new Crow()};
        Flyable flyable[] = new Flyable[]{new Enagle(), new Crow()};
        Groundable groundable[] = new Groundable[]{new Lion(), new Rabbit(), new Penguin()};
        // Flyable flyable2 = new Flyable() {
        //   @Override
        //   public void fly() {
              
        //   }  
        // };
        
 
        System.out.println("---하늘 나는 동물--");
        for(int i=0; i<flyable.length; i++){
            flyable[i].fly();
            //interface를 implement한 클래스는 그 클래스의 메서드와 멤버변수를 직접 사용 안됨
            //implement 하고 재정의한 메서드에서 메서드와 멤버 변수를 사용가능하다.
            //단일 상속의 문제점을 interface로 보완가능하다.
            // System.out.println( flyable[i].name); 
           
        }
        System.out.println("---포유류--");
        for(int i=0; i<mammals.length; i++){
            System.out.println( mammals[i].name);
        }
        System.out.println("---뚜벅이---");
        for(int i=0; i<groundable.length; i++){
            groundable[i].run();
        }
    }
}

class Mammals {
    String name;
    public Mammals(String name){
        this.name = name;
    }
}
class Birds{
    String name;
    public Birds(String name){
        this.name = name;
    }
}
class Lion extends Mammals implements Groundable {
    public Lion(){
        super("사자");
    }
    String siksung = "육식";
    @Override
    public void run() {
        System.out.println("Lion~");
    }
}
class Rabbit extends Mammals implements Groundable {
    public Rabbit(){
        super("토끼");
    }
    @Override
    public void run() {
        System.out.println("Rabbit");
    }
}
class Bat extends Mammals implements Flyable{
    public Bat(){
        super("박쥐");
    }
    @Override
    public void fly() {
        System.out.println(super.name + "batbat~~~");
    }
}
class Enagle extends Birds implements Flyable{
    public Enagle(){
        super("독수리");
    }
    String baltop = "발톱";
    @Override
    public void fly() {
        System.out.println(super.name);
    }
}
class Penguin extends Birds implements Groundable, Swimmable {
    public Penguin(){
        super("펭귄");
    }
    @Override
    public void run() {
        System.out.println("Penguin");
    }
    @Override
    public void swing() {
        System.out.println("asd");
    }
}

class Crow extends Birds implements Flyable{
    public Crow(){
        super("까마귀");
    }
    @Override
    public void fly() {
        System.out.println(super.name);
    }
}

interface Flyable { //인터페이스에는 상수와 추상메서드만 들어감
    public abstract void fly();
}

interface Groundable {
    public abstract void run();
}

interface Swimmable {
    public abstract void swing();
}