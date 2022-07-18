package network;


import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
public class _02_TcpipMultiChatClient {
    public static void main(String[] args) {
        String serverIp = JOptionPane.showInputDialog("Input Server Ip", "192.168.0.127");
        String nickName = JOptionPane.showInputDialog("Input Your Nickname");
        Scanner s = new Scanner(System.in);
        DataOutputStream dos;
        try {
            Socket socket = new Socket(serverIp, 7777);
            Receiver receiver = new Receiver(socket);
            receiver.start();
            dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(nickName);
            while(dos != null){
                dos.writeUTF("["+nickName+"]"+s.nextLine());
                
            }

        } catch (Exception e) {
            
        }
    }
}
class Receiver extends Thread {
    Socket socket;
    DataInputStream in;
    public Receiver(Socket socket){
        try {
            this.socket = socket;
            in = new DataInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        while(in != null){
            try {
                System.out.println(in.readUTF());
            } catch (Exception e) {
                //TODO: handle exception
            }
        }   
    }

}