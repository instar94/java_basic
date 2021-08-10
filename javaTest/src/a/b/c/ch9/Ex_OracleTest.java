package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex_OracleTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott", "tiger");
		
		Statement stmt = conn.createStatement();
		ResultSet rsRs = stmt.executeQuery("SELECT * FROM EMP");
		
		while (rsRs.next()) {
			System.out.print(rsRs.getNString(1) + " : ");
			System.out.print(rsRs.getNString(2) + " : ");
			System.out.print(rsRs.getNString(3) + " : ");
			System.out.print(rsRs.getNString(4) + " : ");
			System.out.print(rsRs.getNString(5) + " : ");
			System.out.print(rsRs.getNString(6) + " : ");
			System.out.print(rsRs.getNString(7) + " : ");
			System.out.println(rsRs.getNString(8));
		}
	}

}
