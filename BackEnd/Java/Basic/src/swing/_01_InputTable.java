package swing;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class _01_InputTable extends BaseFrm {
	public _01_InputTable() {
		super("수정");
	}
	private JTextField tfId;
	private JLabel lbId, lbPw;
	private JPasswordField pfPw;
	private JTable table;
	private DefaultTableModel tblModel;
	private JButton btnAdd, btnDel;
	private JScrollPane scp;
	public static void main(String[] args) {
		new _01_InputTable();
	}

	@Override
	public void init() {
			getContentPane().setLayout(null);
			
			lbId = new JLabel("ID");
			lbId.setFont(new Font("Dialog", Font.BOLD, 20));
			lbId.setBounds(22, 36, 57, 18);
			
			tfId = new JTextField();
			tfId.setFont(new Font("Dialog", Font.PLAIN, 20));
			tfId.setBounds(50, 35, 116, 21);
			tfId.setColumns(10);
			
			lbPw = new JLabel("PW");
			lbPw.setFont(new Font("Dialog", Font.BOLD, 20));
			lbPw.setBounds(189, 36, 57, 18);
			
			pfPw = new JPasswordField();
			pfPw.setFont(new Font("Dialog", Font.PLAIN, 20));
			pfPw.setBounds(229, 35, 116, 21);
			
			btnAdd = new JButton("Add");
			btnAdd.setFont(new Font("굴림", Font.BOLD, 20));
			btnAdd.setBounds(365, 31, 75, 33);
			btnAdd.addActionListener(e -> {
				if(tfId.getText().equals("") || new String(pfPw.getPassword()).equals("")) {
					JOptionPane.showMessageDialog(btnAdd, "Check ID and Password");
					return;
				}
				String[] row = new String[2];
				row[0] = tfId.getText();
				row[1] = new String(pfPw.getPassword());
				tblModel.addRow(row);
				tfId.setText("");
				pfPw.setText("");
				tfId.requestFocus();
				
			});

			btnDel = new JButton("Delete");
			btnDel.setFont(new Font("굴림", Font.BOLD, 20));
			btnDel.setBounds(452, 31, 104, 33);
			btnDel.addActionListener(e-> {
				int row = table.getSelectedRow();
				if(row == -1) return;
				tblModel.removeRow(row);
			});
			
			String[] tblTitle = {"Id", "Password"};
			tblModel = new DefaultTableModel(tblTitle,0);
			table = new JTable(tblModel);
			scp = new JScrollPane(table);
//			scp.add(table);
			scp.setBounds(30, 74, 526, 365);
	}

	@Override
	public void arrange() {
		getContentPane().add(btnDel);
		getContentPane().add(lbId);
		getContentPane().add(tfId);
		getContentPane().add(lbPw);
		getContentPane().add(pfPw);
		getContentPane().add(btnAdd);
		getContentPane().add(scp);
		
	}
}
