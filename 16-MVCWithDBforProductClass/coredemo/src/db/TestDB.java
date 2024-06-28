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

		// --------- DELETE SQL ----------
		String sql = "delete from user where id = 2";

		Statement stm = con.createStatement();

		stm.execute(sql);

		System.out.println("Deletion success!!");
	}


}
