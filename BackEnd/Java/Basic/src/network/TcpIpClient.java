package network;

import javax.swing.*;
import java.io.*;
import java.net.*;
public class TcpIpClient {
    public static void main(String[] args) {
        try {
            String serverIp = JOptionPane.showInputDialog("Input Server Address:", "192.168.0.127");
            System.out.println("Connection Server... ServerIp: "+ serverIp);
            Socket socket = new Socket(serverIp, 7777);
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("From Serer: "+ dis.readUTF());
            dis.close();
            socket.close();
            System.out.println("Server Connection is Closed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
