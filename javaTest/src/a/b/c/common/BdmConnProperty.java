package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class BdmConnProperty {

	//��� -> �����ͼҽ�
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "bdm00";
	private static final String ORCL_PASS = "bdm1234";
	
	//����� �Լ� ����
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(BdmConnProperty.ORCL_JDBC_DIRVER);
			conn = DriverManager.getConnection(BdmConnProperty.ORCL_URL
											 , BdmConnProperty.ORCL_USER
											 ,BdmConnProperty.ORCL_PASS);
			
		}catch(Exception e) {
			System.out.println("����̹� ���� �Ұ� >>>" + e.getMessage());
		}
		
		return conn;
		
	}
	//���� ���� �Լ�
	//IO�Լ� ���� �Լ��� �� ����� �ڿ� close�� ���� �� null������ ����� �����
	public static void conClose(Connection conn, PreparedStatement pstmt, ResultSet rsRs) {
		try{
			if (rsRs != null) try { rsRs.close(); rsRs = null; } catch(Exception ex){}
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}catch (Exception e2){
			
		}			
	}
	
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try{
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}catch (Exception e2){}			
	}	
	}	

