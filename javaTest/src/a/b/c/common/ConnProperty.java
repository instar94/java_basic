package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

//추상클래스로 만듬
public abstract class ConnProperty {

	//상수
		public static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
		public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
		public static final String ORCL_USER = "scott";
		public static final String ORCL_PASS = "tiger";
		

		public static Connection getConnection() {
			Connection conn=null;
			
			try {
				Class.forName(ConnProperty.ORCL_JDBC_DIRVER);	
				conn = DriverManager.getConnection( ConnProperty.ORCL_URL
						                           ,ConnProperty.ORCL_USER
						                           ,ConnProperty.ORCL_PASS);
				
			}catch (Exception e) {
				System.out.println(   "ConnProperty :: 데이터베이스를 연결하는데 \n"
						            + "드라이버 또는 연결 과정에서 문제가 생김 >>> : \n" 
									+ e.getMessage() + "\n");
			}
			return conn;
			
		}
}
