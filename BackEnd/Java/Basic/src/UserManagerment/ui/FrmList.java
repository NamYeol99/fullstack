package ui;
import javax.swing.JTable;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import dao.DaoList;

import javax.swing.JScrollPane;

public class FrmList extends BaseFrm{
	private JLabel lbList;
	private JTable table;
	private JScrollPane sp;
	private DefaultTableModel model;
	
	public FrmList() {
		super("Main");
	}
	@Override
	public void init() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		lbList = new JLabel("회원목록");
		lbList.setFont(new Font("굴림", Font.BOLD, 20));
		model = new DefaultTableModel(new String[] { "ID", "NAME", "PASS" },0);		
		table = new JTable(model);
		sp = new JScrollPane(table);
		
//		table.setModel(new DaoList().getList(model));
//		model.fireTableDataChanged();
		new DaoList().getList(model);

				
		
	}
	@Override
	public void arrange() {
		lbList.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lbList, BorderLayout.NORTH);
		getContentPane().add(sp, BorderLayout.CENTER);
		
	}
}
