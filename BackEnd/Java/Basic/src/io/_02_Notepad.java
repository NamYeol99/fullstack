package io;

import javax.swing.*;

import swing.BaseFrm;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class _02_Notepad extends BaseFrm implements ActionListener{
    public static void main(String[] args){
        new _02_Notepad();
    }
    private JMenuBar menuBar;
    private JMenu mmFile, mmInfo;
    private JMenuItem miOpen, miNew, miSave, miExit, miInfo;
    private JTextArea ta;
    private JScrollPane scp;
    private JFileChooser  fc;

    @Override
    public void init() {
        menuBar = new JMenuBar();
        mmFile = new JMenu("File(F)");
        mmInfo = new JMenu("Info(I)");
        miNew = new JMenuItem("새로만들기(N)");
        miOpen = new JMenuItem("열기0)");
        miSave = new JMenuItem("저장(S)");
        miExit = new JMenuItem("종료(E)");
        miInfo = new JMenuItem("정보(I)");
        fc = new JFileChooser();

        mmFile.add(miNew);
        mmFile.add(miOpen);
        mmFile.add(miSave);
        mmFile.add(miExit);
        menuBar.add(mmFile);
        menuBar.add(mmInfo);
        mmInfo.add(miInfo);

        mmFile.setMnemonic(KeyEvent.VK_F); // alt + f
        mmInfo.setMnemonic(KeyEvent.VK_I); // alt + i
        miNew.setMnemonic((KeyEvent.VK_N)); //alt + n
        miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); // ctrl + n
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // ctrl + o
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // ctrl + s
        // miInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK)); // ctrl + i

        miNew.addActionListener(this);
        miOpen.addActionListener(this);
        miSave.addActionListener(this);
        miInfo.addActionListener(this);

        setJMenuBar(menuBar);
        ta = new JTextArea();
        scp = new JScrollPane(ta);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == miNew){
            ta.setText("");
        } else if (e.getSource() == miOpen){
            fileOpen();
        } else if (e.getSource() == miSave){
            fileSave();
        } else if (e.getSource() == miInfo){
            // dispose(); // 창 닫기
            new MyDialog(null, false);
        }
    }
    private void fileOpen() {
        try {
            int ret = fc.showOpenDialog(miOpen);
            if(ret == 0 ){
                String selectedFile = fc.getSelectedFile().toString();
                FileReader fr = new FileReader(selectedFile);
                int data = 0;
                ta.setText("");
                while((data = fr.read()) != -1){
                    ta.append(String.valueOf((char)data));
                }
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void fileSave() {
        try {
            int ret = fc.showSaveDialog(miSave);
            if(ret ==0 ) {
                String saveFile = fc.getSelectedFile().toString();
                FileWriter fw = new FileWriter(saveFile);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(ta.getText());
                bw.close();
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void arrange() { 
        add(scp);
        setTitle("메모장");
    }

}
