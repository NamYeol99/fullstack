package collection;

import java.util.*;


public class _06_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("admin", "1234");
        map.put("user", "1111");
        map.put("user", "1234");
        

        System.out.println(map);
        
        //key, value 모두
        Iterator it = map.entrySet().iterator(); 
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //key 만 불러 올 경우 value도 불러오기 가능
        it = map.keySet().iterator(); 
        while(it.hasNext()){
            String id = (String)it.next();
            System.out.println(id + ":"+ map.get(id));
        }

        //value만 불러 올 경우 key는 못불러옴
        it = map.values().iterator();
        while(it.hasNext()){
            String value = (String)it.next();
            System.out.println(value);
        }
        

    }
}
