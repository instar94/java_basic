package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Dept {
	//상수
	//데이터 소스를 상수로 만듬
	//jdbc 드라이버
	//데이터베이스 연결 url
	//데이터베이스 계정명
	//데이터베이스 패스워드
	public static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	
	//쿼리문
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	
	//생성자
	public Ex_Dept() {
		try {
			//드라이버를 불러냄
			Class.forName(ORCL_JDBC_DIRVER);
		} catch(Exception e) {
			System.out.println("드라이버가 없음" + e.getMessage());
			}
	}
	
	//함수
	public ArrayList deptSelect() {
		//지역변수 선언 및 디폴트 값으로 초기화
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		
		
		try {
			//각 지역변수를 필요한 값으로 초기화함
			//conn : 연결담당 / url,계정, 패스워드로 접속함
			conn = DriverManager.getConnection(Ex_Dept.ORCL_URL
											  ,Ex_Dept.ORCL_USER
											  ,Ex_Dept.ORCL_PASS);
			//statment를 만듬
			stmt = conn.createStatement();
			//resultSet : stmt로 만들어진 statment에 dept Select를 넣고
			///그 값을 다시 받음
			rsRs = stmt.executeQuery(Ex_Dept.DEPT_SELECT);
			
			//null값이라면 굳이 할 필요가 없으므로  if로 걸러냄
			if(rsRs!=null) {
				
				//aList 인스턴스
				aList = new ArrayList();
				//커서함수로 받아옴
				while(rsRs.next()){
					
					Ex_DeptVO dvo = new Ex_DeptVO();
					
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
					
					aList.add(dvo);
				}
			}
		}catch(Exception e) {
			System.out.println("db연결 문제"+e.getMessage());
			}
		return aList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//deptSelect 함수는 일반 함수 이기 때문에 사용을 위해 인스턴스
		Ex_Dept exe = new Ex_Dept();
		//리턴받은 값을 aList에 넣어줌
		ArrayList aList = exe.deptSelect();
		System.out.println("aList 사이즈 >>>> : " + aList.size());
		
		//해당 값들을 뽑아낼것임
		if(aList.size()>0) {
			for (int i=0; i<aList.size();i++) {
				//Ex_DeptVO에 있는 값들을 출력함
				//다만 aList는 Ex_DeptVO형이 아니라서 형변환 필요
				Ex_DeptVO dvo = (Ex_DeptVO)aList.get(i);
				
				System.out.print(dvo.getDeptno() +" : ");
				System.out.print(dvo.getDname() +" : ");
				System.out.println(dvo.getLoc() +" : ");
				 
			}
		}
	}
}
