package network;

import java.io.*;
import java.net.URL;

public class _01_UrlConnection {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://www.naver.com";
        String line = "";
        try {
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
            while((line = input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
