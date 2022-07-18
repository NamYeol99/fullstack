package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _01_List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Date());
        al.add("hello");
        al.add(true);
        al.add(1);
        al.clear();
        ArrayList<Integer> list = new ArrayList();
        System.out.println(list);
        
        for (int i = 0; i < 10; i++) {
            list.add(i+1);

        }
        System.out.println(list);

        int total = 0;
        for(Object i : list){ // generics를 사용하면 Object 대신 int로 받을 수 있음
            total += (int)i;
        }
        
        total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += (int)list.get(i); // 형변환 없이 generics타입으로 연산가능 (int)생략가능
        }
        System.out.println(total);

        //Iterator 사용
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        List list2 = new ArrayList();
        list2 = new LinkedList();
    }
}
