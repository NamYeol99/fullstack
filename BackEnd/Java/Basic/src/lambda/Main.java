package lambda;
import javax.swing.*;
import java.awt.event.*;

class main {     
    
    public static void main(String[] args) {    
                
        JFrame f = new JFrame();
        f.setSize(300,200);     
        f.setLayout( null );
        
        JButton b = new JButton("테스트");
        b.setBounds(10, 10, 100, 30);
        f.add(b);
        
        JTextField t = new JTextField("3434");
        t.setBounds(10, 50, 250, 30);
        f.add(t);       
        f.setVisible(true);
                
                
        b.addActionListener( new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {

                System.out.println("버튼이 클릭되었습니다.");             
            }
            
        });
    }       
}