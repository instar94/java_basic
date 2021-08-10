package a.b.c.ch9;

//제너릭 사용 버전
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Dept_1 {
	//상수
	public static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	
	//쿼리문
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	
	//생성자
	public Ex_Dept_1() {
		try {
			Class.forName(ORCL_JDBC_DIRVER);
		} catch(Exception e) {
			System.out.println("드라이버가 없음" + e.getMessage());
			}
	}
	
	//함수
	public ArrayList<Ex_DeptVO> deptSelect() {
		//지역변수 선언 및 초기화
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList<Ex_DeptVO> aList = null;
		
		try {
			conn = DriverManager.getConnection(Ex_Dept.ORCL_URL
											  ,Ex_Dept.ORCL_USER
											  ,Ex_Dept.ORCL_PASS);
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(Ex_Dept.DEPT_SELECT);
			
			if(rsRs!=null) {
				aList = new ArrayList<Ex_DeptVO>();
				while(rsRs.next()){
					
					Ex_DeptVO dvo = new Ex_DeptVO();
					
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
					
					aList.add(dvo);
					//public void clear()
					//ArrayList 안 모든 데이터를 지워버림
					//하지만 null값은 잡아내질 못한다
					
				}
			}
		}catch(Exception e) {
			System.out.println("db연결 문제"+e.getMessage());
			}
		
		return aList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_Dept_1 exe = new Ex_Dept_1();
		ArrayList<Ex_DeptVO> aList = exe.deptSelect();
		System.out.println("aList 사이즈 >>>> : " + aList.size());
		
		if(aList.size()>0) {
			for (int i=0; i<aList.size();i++) {
				Ex_DeptVO dvo = aList.get(i);
				
				System.out.print(dvo.getDeptno() +" : ");
				System.out.print(dvo.getDname() +" : ");
				System.out.println(dvo.getLoc() +" : ");
				 
			}
		}
	}
}
