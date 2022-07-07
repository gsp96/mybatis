package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) {
		final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		final String DB_USER = "mybatis";
		final String DB_PASSWORD = "mybatis";
		
		Connection conn = null; //client server사이의 연결 표현
		PreparedStatement stmt = null; // sql code를 표현
		ResultSet rs = null;//sql table을 표현
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			String query = "SELECT user_id, user_name, reg_date FROM users";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, 1);
			rs = stmt.executeQuery();
			
			User user = null;
			while(rs.next()) {//or mapping mybatis에서는 이부분을 자동으로 해준다.
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setRegDate(rs.getDate(3));
				
				System.out.println(user);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {}
		}
	}
}