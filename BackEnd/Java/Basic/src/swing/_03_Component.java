package swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class _03_Component extends BaseFrm{
    private JPanel pnlNorth, pnlCenter;
    private String arr[];
    private String size[];
    private JRadioButton[] rbArr;
    private ButtonGroup btnGroup;
    private JComboBox cbSize;
    private JLabel lbMenu, lbSize;
    public static void main(String[] args) {
        new _03_Component();
    }
    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        arr =  new String[]{"Coffee", "Latte", "Espresso", "BlackTea", "Ade"};
        size = new String[]{"Small", "Medium", "Large"};
        rbArr = new JRadioButton[5];
        btnGroup = new ButtonGroup();
        cbSize = new JComboBox<>(size);
        lbSize = new JLabel(size[1]);
        for (int i = 0; i < arr.length; i++) {
            rbArr[i] = new JRadioButton(arr[i]);
            final int tmp = i; //지역변수가 익명객체 안으로 들어갈 경우 상수로 변활할 것
            // rbArr[i].addActionListener(e->{lbMenu.setText(rbArr[tmp].getText());}); 
            rbArr[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbMenu.setText(rbArr[tmp].getText());
                }
            });
            cbSize.addActionListener(e -> {
                lbSize.setText(size[cbSize.getSelectedIndex()]);
            });
            btnGroup.add(rbArr[i]);
            pnlNorth.add(rbArr[i]);
        }
        rbArr[0].setSelected(true);
        cbSize.setSelectedIndex(1);
        lbMenu = new JLabel(rbArr[0].getText());
        lbSize = new JLabel(size[cbSize.getSelectedIndex()]);
        lbMenu.setFont(new Font("돋움", Font.ITALIC, 30));
        lbSize.setFont(new Font("돋움", Font.BOLD, 30));
        lbSize.setForeground(Color.orange);
    }
    @Override
    public void arrange() {
        pnlNorth.add(cbSize);
        pnlCenter.add(lbMenu);
        pnlCenter.add(lbSize);
        
        add(pnlNorth,"North");
        add(pnlCenter, "Center");
        
    }
}
