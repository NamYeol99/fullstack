package javalang;

public class Exercise9_1 {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        SutdaCard s = new SutdaCard();
        
        deck.printDeck();
        deck.shuffle();
        deck.printDeck();

        
    }
}

class SutdaCard {
    private int num;
    private boolean kwang;

    public SutdaCard(int num, boolean kwang){
        this.num = num;
        this.kwang = kwang;
    }
    public SutdaCard(){
        this(1, false);
    }
    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public boolean isKwang() {
        return this.kwang;
    }
    public void setKwang(boolean kwang) {
        this.kwang = kwang;
    }
    @Override
    public String toString() {
        return num + (kwang? "(K)" : "");
    }
    public boolean equals(Object obj){
        if(obj instanceof SutdaCard){
            SutdaCard tmp = (SutdaCard)obj;
            return tmp.getNum() == num && tmp.isKwang()==kwang;
        }
        return false;
    }

}

class CardDeck {
    // 1. card 20장 클래스 2. card 20장 초기화, 3. card 섞기
    // final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[20];
    SutdaCard s = new SutdaCard();
    SutdaCard s2 = new SutdaCard();
    CardDeck(){
        for(int i=0; i<cards.length; i++){
            // cards[i] = new SutdaCard((i)%10 +1, (i<10 && (i==0 || i==2 || i ==7))? true : false); 
                   
            if(i<10 && (i%10 +1 == 1 || i%10 +1 == 3 || i%10 +1 == 8))
                cards[i] = new SutdaCard((i)%10 +1, true); 
            
            else cards[i] = new SutdaCard((i)%10 +1, false); 
        }
    }
    void printDeck(){
        System.out.print("[");
        for (int i = 0; i < cards.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(cards[i]);
        }
        System.out.println("]");
    }
    void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int rand = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = tmp;
          }
    }
}