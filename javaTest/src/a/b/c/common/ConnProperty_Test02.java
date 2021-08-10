package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnProperty_Test02 {

	//상수
	//데이터소스를 상수화 시킴
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "test02";
	private static final String ORCL_PASS = "1234";
	
	//데이터 베이스 드라이버를 찾아주는 getConnection 함수 만듬
	
public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty_Test02.ORCL_JDBC_DIRVER);	
			conn = DriverManager.getConnection( ConnProperty_Test02.ORCL_URL
					                           ,ConnProperty_Test02.ORCL_USER
					                           ,ConnProperty_Test02.ORCL_PASS);
			
		}catch (Exception e) {
			System.out.println(   "ConnProperty :: 데이터베이스를 연결하는데 \n"
					            + "드라이버 또는 연결 과정에서 문제가 생김 >>> : \n" 
								+ e.getMessage() + "\n");
		}
		
		return conn;
	}
}
