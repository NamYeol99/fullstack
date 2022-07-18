package object;

public class _09_InheriatanceApplicate {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Audio audio = new Audio();
        Computer computer = new Computer();
        // buyer.buy(tv.price, tv.name);
        // buyer.buy(audio.price, audio.name);
        // buyer.buy(computer.price, computer.name);
        buyer.buy(tv);
        buyer.buy(audio);
        buyer.buy(computer);
        System.out.println(buyer.money);
        
    }
}
class Buyer{
    int money = 300;
    int bonusPoint;
    String[] list = new String[10];
    int count = 0;

    // 1) 일반형 타입의 속성으로 처리
    // void buy(int price, String name){
    //     if(money >= price) money -= price;
    //     list[count++] = name;
    // }
    
    // 2) 참조형 타입으로 처리
    // void buy(Computer c){
    //     if(money >= c.price) money -= c.price;
    //     list[count++] = c.name;
    // }
    // void buy(Audio a){
    //     if(money >= a.price) money -= a.price;
    //     list[count++] = a.name;
    // }
    // void buy(Tv t){
    //     if(money >= t.price) money -= t.price;
    //     list[count++] = t.name;
    // }

    // 3) 상속의 형변환
    void buy(Item i){
        if(money >= i.price) money -= i.price;
        list[count++] = i.name;
    }
}

class Item {
    String name;
    int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
}
class Tv extends Item{
    public Tv(){
        super("TV",40); 
    }
}
class Audio extends Item{
    public Audio(){
        super("Audio",100);
    }
}
class Computer extends Item{
    public Computer(){
        super("Computer",160);
    }
}
