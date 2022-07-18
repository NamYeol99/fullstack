package object;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i=0; i<CARD_NUM; i++){
            if(i == 0 || i==2 || i==7){
                cards[i] = new SutdaCard(i+1, true);
            } else {
                cards[i] = new SutdaCard((i%10)+1, false);
            }
        }
    }
    void shuffle(){
        for(int i = 0; i < 100; i++){
            int k = (int)(Math.random()*cards.length);
            int j = (int)(Math.random() * cards.length);
            SutdaCard tmp = cards[k];
            cards[k] = cards[j];
            cards[j] = tmp;
        }
    }
    SutdaCard pick(int index){
        if(index < 0 || index >= CARD_NUM) return null;
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random() * cards.length)];
    }
}
class SutdaCard {   
    int num;
    boolean isKwang;
    
    SutdaCard(){
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
