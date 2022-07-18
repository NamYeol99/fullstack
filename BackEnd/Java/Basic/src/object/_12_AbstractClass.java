package object;

public class _12_AbstractClass {
    public static void main(String[] args) {
        // Terran terran = new Terran(); //추상 클래스는 스스로 인스턴스 생성 불가
        Medic medic = new Medic(); 

    }
}
// 추상클래스에 추상메서드 추가 가능
abstract class Terran implements Flyable{
    String name;
    public final int ATTACK_LV = 100;
    public abstract void steamPack();
}
class Medic extends Terran {
    @Override
    public void steamPack() {
        System.out.println("steampack~!~!~!~!!~!~!~!!~");
    }
    @Override
    public void fly() {
        
    }
}
