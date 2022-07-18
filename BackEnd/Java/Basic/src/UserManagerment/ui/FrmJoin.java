package ui;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.DaoJoin;
import vo.UserVo;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;	
import java.awt.Font;

public class FrmJoin extends BaseFrm{
	private JTextField tfId;
	private JTextField tfName;
	private JPasswordField pfPass;
	private JPasswordField pfRePass;

	public FrmJoin() {
		super("Join", 400, 300);

	}
	@Override
	public void init() {
		getContentPane().setFont(new Font("Dialog", Font.BOLD, 12));
		getContentPane().setLayout(null);
		
		JLabel lbid = new JLabel("ID");
		lbid.setFont(new Font("Dialog", Font.BOLD, 16));
		lbid.setBounds(86, 38, 57, 15);
		getContentPane().add(lbid);
		
		JLabel lbname = new JLabel("Name");
		lbname.setFont(new Font("Dialog", Font.BOLD, 16));
		lbname.setBounds(86, 74, 57, 15);
		getContentPane().add(lbname);
		
		JLabel lbpass = new JLabel("PW");
		lbpass.setFont(new Font("Dialog", Font.BOLD, 16));
		lbpass.setBounds(86, 111, 57, 15);
		getContentPane().add(lbpass);
		
		JLabel lbRePass = new JLabel("Re PW");
		lbRePass.setFont(new Font("Dialog", Font.BOLD, 16));
		lbRePass.setBounds(86, 150, 57, 15);
		getContentPane().add(lbRePass);
		
		tfId = new JTextField();
		tfId.setFont(new Font("굴림", Font.PLAIN, 16));
		tfId.setBounds(155, 35, 116, 21);
		getContentPane().add(tfId);
		tfId.setColumns(10);
		
		tfName = new JTextField();
		tfName.setFont(new Font("굴림", Font.PLAIN, 16));
		tfName.setBounds(155, 71, 116, 21);
		getContentPane().add(tfName);
		tfName.setColumns(10);
		
		pfPass = new JPasswordField();
		pfPass.setFont(new Font("굴림", Font.PLAIN, 16));
		pfPass.setBounds(155, 108, 116, 18);
		getContentPane().add(pfPass);
		
		pfRePass = new JPasswordField();
		pfRePass.setFont(new Font("굴림", Font.PLAIN, 16));
		pfRePass.setBounds(155, 147, 116, 18);
		getContentPane().add(pfRePass);
		
		JButton btnJoinRegist = new JButton("Join");
		btnJoinRegist.setFont(new Font("굴림", Font.PLAIN, 16));
		btnJoinRegist.setBounds(80, 206, 97, 23);
		getContentPane().add(btnJoinRegist);
		btnJoinRegist.addActionListener(e -> {
			String id = tfId.getText();
			String name = tfName.getText();
			String pass = new String(pfPass.getPassword());
			String repass = new String(pfRePass.getPassword());
			//유효성검사 joptionpane meassage dialog
			if(id.equals("")) {
				JOptionPane.showMessageDialog(this, "아이디를 입력해주세요");
				tfId.requestFocus();
			}
			else if (name.equals("")) { 
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요");
				tfName.requestFocus();
			}
			else if (pass.equals("")) { 
				JOptionPane.showMessageDialog(this, "비밀번호를 입력해주세요");
				pfPass.requestFocus();
			}
			else if (!repass.equals(pass)) {
				JOptionPane.showMessageDialog(this, "비밀번호가 맞지 않습니다");
			}
			else {
				int ret = new DaoJoin().addUser(new UserVo(id, name, pass));
				if (ret > 0) JOptionPane.showMessageDialog(this, "가입되었습니다.");
				else JOptionPane.showMessageDialog(this, "가입에 실패하였습니다.");
				dispose();
				new FrmLogin();
			}
		});
		
		JButton cancel = new JButton("Cancel");
		cancel.setFont(new Font("굴림", Font.PLAIN, 16));
		cancel.setBounds(196, 206, 97, 23);
		getContentPane().add(cancel);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void arrange() {
		// TODO Auto-generated method stub
		
	}

}
