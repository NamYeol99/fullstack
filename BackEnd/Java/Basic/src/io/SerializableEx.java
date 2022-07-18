package io;

import java.io.*;
import java.util.ArrayList;

public class SerializableEx {
    public static void main(String[] args) {
        User u1 = new User("KNY", 1);
        User u2 = new User("JJJ", 0);
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        String exportFile = "UserInfo.ser";
        try {
            FileOutputStream fos = new FileOutputStream(exportFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(exportFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);
            

            User get1 = (User) in.readObject();
            User get2 = (User) in.readObject();
            ArrayList result = (ArrayList) in.readObject();
            System.out.println(get1);
            System.out.println(get2);
            System.out.println(result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    String name;
    int gender;

    public User(){
        this("Unknown", 0);
    }
    public User(String name, int gender){
        this.name = name;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return name+"/"+gender;
    }  
}
