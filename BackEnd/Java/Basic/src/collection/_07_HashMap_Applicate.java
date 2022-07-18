package collection;

import java.util.*;

public class _07_HashMap_Applicate {
    static HashMap phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addPhoneNo("친구", "강길동", "010-1111-1111");
        addPhoneNo("친구", "장길동", "010-1111-1112");
        addPhoneNo("회사", "이길동", "010-1111-1113");
        addPhoneNo("회사", "동길동", "010-1111-1114");
        addPhoneNo("회사", "박길동", "010-1111-1115");
        addPhoneNo("세탁", "051-111-1116");
        printList();
    }
    private static void printList(){
        // Set set = phoneBook.entrySet();
        // Integer it = set.iterator();
        Iterator it = phoneBook.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            Set subSet = ((HashMap)e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();
            System.out.println(" * " + e.getKey()+"["+subSet.size()+"]");
            while(subIt.hasNext()){
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name+" "+ telNo);
            }
            System.out.println();
        }
    }

    static void addPhoneNo(String groupName, String name, String tel){
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }
    static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)) phoneBook.put(groupName, new HashMap<>());
    }
    static void addPhoneNo(String name, String tel){
        addPhoneNo("기타", name, tel);
    }


}