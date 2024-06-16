package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// getConnection(url, un, psw);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/testdb", "root", "hello");
		
		// --------- INSERT SQL -----------
		// a. Write SQL
//		String sql = "insert into user(username, password) values('admin', 'admin1234s')";
//		
//		// b. Create Statement
//		Statement stm = con.createStatement();
//		
//		// c. Execute sql
//		stm.execute(sql);
//		
//		// d. Close db
//		con.close();
//		System.out.println("Success!");
		
		// --------- DELETE SQL ----------
		String sql = "delete from user where id = 2";
		
		Statement stm = con.createStatement();
		
		stm.execute(sql);
		
		System.out.println("Deletion success!!");
	}
	
	
	// select sql
	
	String sql = "select * from user";
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery(sql);
	
	while(rs.next()) {
		System.out.println("id = " + rs.getInt("id"));
	}
	
}
