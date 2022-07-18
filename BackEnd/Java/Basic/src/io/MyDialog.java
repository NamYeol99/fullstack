package io;


import javax.swing.*;
public class MyDialog extends JDialog{
    public MyDialog(JFrame frame, boolean moda1){
        super(frame, moda1);
        setTitle("연습");
        setSize(400,500);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setVisible(true);
        
    }
}
