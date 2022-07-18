package object;

public class _05_Static_Instance {
    public static void main(String[] args) {
        Marine m1 = new Marine();        
        Marine m2 = new Marine();
        Marine m3 = new Marine();
        m1.setAttackLv(8);
        // m2.setAttackLv(8);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        String str = m1.info();
        System.out.println(str);

    }
}
class Marine {
    private int hp;
    private static int attackLv = 6;
    static String info(){ //static 메서드 안에서는 static 변수사용
        return "Marine["+attackLv+"]";
        // return toString(); // 에러
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackLv() {
        return this.attackLv;
    }

    public void setAttackLv(int attackLv) {
        this.attackLv = attackLv;
    }
    @Override
    public String toString() { //Instanc 메서드 안에서는 instanc 변수, static 변수 둘다 사용 가능
        // return hp+"/"+attackLv;
        return info();
        
    }
}
