package dao;

import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;


public class DaoList extends DaoSet {
	// 디폴트테이블모델 -> 
	public DefaultTableModel getList(DefaultTableModel model) {
		try {
			conn = connDB();
			String sql = "select * from db7.users" ;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //select = Query
			while(rs.next()) {
				model.addRow(
					new String[] {rs.getString("id"), rs.getString("NAME"), rs.getString("pass")}
				);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}
}
