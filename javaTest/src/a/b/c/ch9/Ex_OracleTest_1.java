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
		// 1. 첫번째 라인에서 ojdbc6.jar 에서 oracle.jdbc.driver.OracleDriver 클래스를 찾아서 메모리에 올려 놓은다. 
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclKOSMO00", "scott", "tiger");
		// 2. 두번째 라인에서 java.sql.Connection 인터페이스를 
				//    상속해서 Oracle Vender에서  jdbc 드라이버를 만드는 팀에서 실현한 oracle.jdbc.driver.T4CConnection@2d38eb89 클래스로 
				//    우리가 제공한 datasource 연결정보를 가지고 Ex_OracleTest_1 클래스와 orclKOSMO00.scott 계정에 연결을 한다. 
				//    두 객체(자바어플 과 데이터베이스)가 연결이 되면 자동커밋(auto commit)으로 세션이 열리게 된다. 
		
		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM EMP WHERE ROWNUM <= 1");
		// 3. 세번째 라인에서 java.sql.PreparedStatement 를 상속한  oracle.jdbc.driver.OraclePreparedStatementWrapper@174d20a 
		//    오라클 벤더 구현체 클래스가 prepareStatement() 함수에 적재된 쿼리문 문자열을 가지고 
		//    오라클 데이베이스에 (localhost:1521:orclKOSMO00", "scott", "tiger") 전달한다. 
		ResultSet rsRs = pstmt.executeQuery();
		// 4. 네번째 라인에서 오라클 데이터베이스에 전달된 쿼리문을 오라클 Optimizer가 실행을 해서 결과가 발생이 되면 
				//    oracle.jdbc.driver.OraclePreparedStatementWrapper@174d20a 객체 발생된 결과를 
				//    java.sql.ResultSet 인터페이스를 상속한 오라클 벤더 구현체 클래스  
				//    oracle.jdbc.driver.OracleResultSetImpl@735b5592가  결과를 받는다.
				//    그 결과를 파일형태의 메모리 구조를 가지고 있다.
		
		//5. 다섯번째 라인 while 문에서 next() 커서 함수를 이용해서 레코드를 출력 하거나 변수에 바인딩 한다. 
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
