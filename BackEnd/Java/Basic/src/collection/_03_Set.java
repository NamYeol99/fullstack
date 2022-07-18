package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _03_Set {
    public static void main(String[] args) {
        Set set = new HashSet<>(); //중복X, 자동정렬
        set.add(4);
        set.add(7);
        set.add(2);
        set.add(3);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();
        
        Set lotto = new HashSet<>();
        while(lotto.size()<6){
            int ball = (int)(Math.random()*45)+1;
            lotto.add(ball);
        }
        System.out.println(lotto);

    }
}
