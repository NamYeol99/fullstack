package collection;

import java.util.*;

public class _05_TreeSet {
    public static void main(String[] args) {
        Set lotto = new TreeSet();
        while(lotto.size() < 6){
            int ball = (int)(Math.random()*45)+1;
            lotto.add(ball);
        }
        System.out.println(lotto);
        // Iterator it = lotto.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next()+" ");
        // }

        Set set = new TreeSet<>();
        Ball[] balls = new Ball[5];
        int[] nums = {4,2,1,5,3};
        String[] colors = {"red", "navy", "black", "pink", "green"};
        for (int i = 0; i < balls.length; i++) {
            balls[i]= new Ball(nums[i],colors[i]);
            set.add(balls[i]);
        }
        System.out.println(set);

    }
}

class Ball implements Comparable {
    int num;
    String color;

    public Ball(int num, String color){
        this.num=num;
        this.color=color;
    }
    @Override
    public int compareTo(Object o) {
        Ball tmp = (Ball) o;
        // if(num > tmp.num){  //내림차순 num > tmp.num -> 오름차순
        //     return 1;
        // }
        // else if(num == tmp.num){
        //     return 0;
        // }
        // return -1;
        return -(tmp.color.compareTo(color));

    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ball)) return false;
        Ball tmp = (Ball)obj;
        return tmp.num == num && tmp.color.equals(color);
        }
        
    @Override
    public int hashCode() {
        return Objects.hash(num,color);
    }
    @Override
    public String toString() {
        return num +"["+ color + "]";
    }
}
