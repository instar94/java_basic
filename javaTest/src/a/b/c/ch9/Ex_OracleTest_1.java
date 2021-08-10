package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex_OracleTest_1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. ù��° ���ο��� ojdbc6.jar ���� oracle.jdbc.driver.OracleDriver Ŭ������ ã�Ƽ� �޸𸮿� �÷� ������. 
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott", "tiger");
		// 2. �ι�° ���ο��� java.sql.Connection �������̽��� 
				//    ����ؼ� Oracle Vender����  jdbc ����̹��� ����� ������ ������ oracle.jdbc.driver.T4CConnection@2d38eb89 Ŭ������ 
				//    �츮�� ������ datasource ���������� ������ Ex_OracleTest_1 Ŭ������ orclKOSMO00.scott ������ ������ �Ѵ�. 
				//    �� ��ü(�ڹپ��� �� �����ͺ��̽�)�� ������ �Ǹ� �ڵ�Ŀ��(auto commit)���� ������ ������ �ȴ�. 
		
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM EMP WHERE ROWNUM <= 1");
		// 3. ����° ���ο��� java.sql.PreparedStatement �� �����  oracle.jdbc.driver.OraclePreparedStatementWrapper@174d20a 
		//    ����Ŭ ���� ����ü Ŭ������ prepareStatement() �Լ��� ����� ������ ���ڿ��� ������ 
		//    ����Ŭ ���̺��̽��� (localhost:1521:orclKOSMO00", "scott", "tiger") �����Ѵ�. 
		ResultSet rsRs = pstmt.executeQuery();
		// 4. �׹�° ���ο��� ����Ŭ �����ͺ��̽��� ���޵� �������� ����Ŭ Optimizer�� ������ �ؼ� ����� �߻��� �Ǹ� 
				//    oracle.jdbc.driver.OraclePreparedStatementWrapper@174d20a ��ü �߻��� ����� 
				//    java.sql.ResultSet �������̽��� ����� ����Ŭ ���� ����ü Ŭ����  
				//    oracle.jdbc.driver.OracleResultSetImpl@735b5592��  ����� �޴´�.
				//    �� ����� ���������� �޸� ������ ������ �ִ�.
		
		//5. �ټ���° ���� while ������ next() Ŀ�� �Լ��� �̿��ؼ� ���ڵ带 ��� �ϰų� ������ ���ε� �Ѵ�. 
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
