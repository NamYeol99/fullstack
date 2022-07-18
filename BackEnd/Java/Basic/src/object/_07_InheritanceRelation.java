package object;

public class _07_InheritanceRelation {
    public static void main(String[] args) {
        Firebat firebat = new Firebat();
        firebat.move(100,100);
        firebat.steamPack();
        // 클래스와 클래스를 전개할 때 관계를 고려해야 한다.
        // is-a 관계 상속(Inheritance)
        // has-a 관계 포함
    }
}

class Unit {
    int x;
    int y;
    int hp;
    int attackLv;
    int armor;
    void move (int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Firebat extends Unit{
    void steamPack(){
        System.out.println("스팀펙");
    }
}

class Car {
    int wheel;
    int door;
    Engine engine = new Engine();
}
class Engine {
    int gitong;
    int mph;
    int cc;
}