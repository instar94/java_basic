package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnProperty_Test02 {

	//���
	//�����ͼҽ��� ���ȭ ��Ŵ
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "test02";
	private static final String ORCL_PASS = "1234";
	
	//������ ���̽� ����̹��� ã���ִ� getConnection �Լ� ����
	
public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty_Test02.ORCL_JDBC_DIRVER);	
			conn = DriverManager.getConnection( ConnProperty_Test02.ORCL_URL
					                           ,ConnProperty_Test02.ORCL_USER
					                           ,ConnProperty_Test02.ORCL_PASS);
			
		}catch (Exception e) {
			System.out.println(   "ConnProperty :: �����ͺ��̽��� �����ϴµ� \n"
					            + "����̹� �Ǵ� ���� �������� ������ ���� >>> : \n" 
								+ e.getMessage() + "\n");
		}
		
		return conn;
	}
}
