package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteInsertQueryTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cyientDb", "postgres", "5432");
		Statement s = conn.createStatement();
	}

}
