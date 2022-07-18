package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class _01_Container {
    public static void main(String[] args) {
        new MyFrame();
        
    }
}

class MyFrame extends BaseFrm {
        private JButton btnNorth, btnSouth, btnWest, btnEast, btnCenter;
        private JPanel pnlCenter;
        @Override
        public void init() {
            pnlCenter = new JPanel();
            // pnlCenter.setLayout(new BorderLayout());
            btnNorth = new JButton("북");
            btnSouth = new JButton("남");
            btnWest = new JButton("서");
            btnEast = new JButton("동");
            btnCenter = new JButton("중앙");
            btnCenter.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(getParent(), "Hello Swing");
                }
            });
        }
        @Override
        public void arrange() {
            
            add(btnNorth,"North");
            add(btnSouth,"South");
            add(btnWest,"West");
            add(btnEast,"East");
            add(btnCenter,"Center");
            pnlCenter.add(btnCenter);
            pnlCenter.add(btnEast);
            add(pnlCenter,"Center");
        }
}
