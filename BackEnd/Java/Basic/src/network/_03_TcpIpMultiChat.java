package network;

import javax.swing.*;
import java.awt.*;
import swing.BaseFrm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class _03_TcpIpMultiChat extends BaseFrm {
	private JTextArea ta;
	private JScrollPane sp;
	private JTextField tf;
	private Socket socket; 
	private String nickName;
	private DataOutputStream out;

  public _03_TcpIpMultiChat(){
    super("MultiChat",400,500);
    String serverIp = JOptionPane.showInputDialog("Input Server Ip", "192.168.0.127");
    nickName = JOptionPane.showInputDialog("Input Your Nickname");

    Scanner s = new Scanner(System.in);
   
    try {
    	socket = new Socket(serverIp, 7777);
    	out = new DataOutputStream(socket.getOutputStream());
    	out.writeUTF(nickName);
//        while(out != null){
//            out.writeUTF("["+nickName+"]"+s.nextLine());
//        }
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    Receiver r = new Receiver(socket);
    r.start();
    
    tf.requestFocus();
    
  }
  public static void main(String[] args) {
    new _03_TcpIpMultiChat();
  }
  @Override
  public void init() {
	  	ta = new JTextArea();
		ta.setEditable(false);
		sp = new JScrollPane(ta);
		tf = new JTextField();
		
		tf.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		ta.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
	
		tf.addActionListener(e->{
			try {
				out.writeUTF("["+nickName+"]"+tf.getText());
				tf.setText("");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
  }
  @Override
  public void arrange() {
    add(sp, "Center"); add(tf, "South");
  }

  private class Receiver extends Thread {
    DataInputStream in;
  
    public Receiver(Socket socket) {
      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (Exception e) {
    	  e.printStackTrace();
      }
    }
  
    @Override
    public void run() {
      while (in != null) {
        try {
        	ta.append(in.readUTF()+"\n");
    		ta.setCaretPosition(ta.getDocument().getLength()); //스크롤 하단에 고정
//          System.out.println(in.readUTF());
        } catch (Exception e) {e.printStackTrace();}
      }
    }
  }
}
