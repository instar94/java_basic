package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class BdmConnProperty {

	//상수 -> 데이터소스
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "bdm00";
	private static final String ORCL_PASS = "bdm1234";
	
	//연결용 함수 만듬
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(BdmConnProperty.ORCL_JDBC_DIRVER);
			conn = DriverManager.getConnection(BdmConnProperty.ORCL_URL
											 , BdmConnProperty.ORCL_USER
											 ,BdmConnProperty.ORCL_PASS);
			
		}catch(Exception e) {
			System.out.println("드라이버 연결 불가 >>>" + e.getMessage());
		}
		
		return conn;
		
	}
	//연결 해제 함수
	//IO함수 같은 함수는 다 사용한 뒤에 close를 해준 뒤 null값으로 만들어 줘야함
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

