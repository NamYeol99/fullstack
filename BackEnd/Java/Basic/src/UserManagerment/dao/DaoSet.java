package dao;

import java.sql.*;

public abstract class DaoSet {
	Connection conn; // DB 연결을 위한 객체
	PreparedStatement pstmt; // Sql을 사용하기 위한 객체
	Statement stmt; 
	ResultSet rs; // 결과값을 받아오는 객체
	
	public Connection connDB() throws SQLException{
		String driver = "jdbc:mariadb://localhost:3306/";
		String user = "db7";
		String pass = "1234";
		conn = DriverManager.getConnection(driver, user, pass);
		return conn;
	}
	public void closeDB() {
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(rs != null) rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
