package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckRecordTest {

	public static void main(String[] args) throws SQLException {
	
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cyientDb", "postgres", "5432");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select*from company where name='shraddha'");
		System.out.println(rs.next());
	}

}
