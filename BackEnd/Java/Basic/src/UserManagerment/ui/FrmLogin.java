package ui;
import javax.swing.JButton;
import javax.swing.JTextField;

import dao.DaoLogin;
import vo.UserVo;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class FrmLogin extends BaseFrm{
	private JTextField textField;
	private JPasswordField passwordField;

	
	public FrmLogin() {
		super("Login", 400, 300);
	}

	@Override
	public void init() {
		getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(36, 192, 97, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(e-> {
			String id = textField.getText();
			String pass = new String(passwordField.getPassword());
			UserVo user = new DaoLogin().loginCheck(id,pass);
			if(user == null) {
				JOptionPane.showMessageDialog(this, "로그인에 실패하였습니다");
				textField.setText("");
				passwordField.setText("");
				textField.requestFocus();
				return;
			}
			dispose();
			new FrmList();
		
			
		});
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(145, 192, 97, 23);
		getContentPane().add(btnCancel);
		
		JButton btnJoin = new JButton("가입");
		btnJoin.setBounds(254, 192, 97, 23);
		getContentPane().add(btnJoin);
		btnJoin.addActionListener(e->{
			// 유효성 검사
			dispose();
			new FrmJoin();
		});
		
		textField = new JTextField();
		textField.setBounds(152, 51, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 120, 116, 23);
		getContentPane().add(passwordField);
		
		JLabel id = new JLabel("ID");
		id.setFont(new Font("굴림", Font.BOLD, 16));
		id.setBounds(103, 54, 57, 15);
		getContentPane().add(id);
		
		JLabel pw = new JLabel("PW");
		pw.setFont(new Font("굴림", Font.BOLD, 16));
		pw.setBounds(103, 124, 57, 15);
		getContentPane().add(pw);
		
	}
	@Override
	public void arrange() {
		
	}
}
