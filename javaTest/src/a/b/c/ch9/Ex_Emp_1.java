//package
package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//import

//클래스
public class Ex_Emp_1 {

	//상수
	//DataSource : 데이터베이스 연결정보
		//데이터베이스소스에 필요한 정보
		//1. jdbc 드라이버 시작점 네임스페이스
		//2. 데이터베이스 연결 URL
		//3. 계정명
		//4. 계정 패스워드
	//긴 문자열들을 대신해줌
	public static final String ORCL_JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String ORCL_UESR = "scott";
	public static final String ORCL_PASS = "tiger";
	
	//쿼리문
	public static final String EMP_SELECT = "SELECT * FROM EMP";
	
	//멤버변수
	
	//생성자
	public Ex_Emp_1() {
		//JDBC 드라이버 연결
		try {
			Class.forName(Ex_Emp.ORCL_JDBC_DRIVER);
		}catch(Exception e) {
			System.out.println("에러 : JDBC 드라이버 ojdnc6.jar 못찾음"+e.getMessage());
		}
	}//end of Ex_Emp 생성자
	
	//함수
	public ArrayList<Ex_EmpVO> empSelect() {
		
		//지역변수 선언및초기화는 미리미리
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList<Ex_EmpVO> aList = null;
		
		try {
		conn = DriverManager.getConnection(Ex_Emp_1.ORCL_URL
										  ,Ex_Emp_1.ORCL_UESR
										  ,Ex_Emp_1.ORCL_PASS );
		stmt = conn.createStatement();
		rsRs = stmt.executeQuery(Ex_Emp_1.EMP_SELECT);
		
		//rsRs가 데이터가 없다면 굳이 할 필요가 없음
		//if로 묶어줌
		if(rsRs !=null) {
		
		//데이터가 있어야만 인스턴스함
		aList = new ArrayList<Ex_EmpVO>();
		
		//while을 통해 aList안에 정보를 담아놓음
		//커서 함수 역할
		while (rsRs.next()) {
			Ex_EmpVO evo = new Ex_EmpVO();
			evo.setEmpno(rsRs.getString("EMPNO"));
			evo.setEname(rsRs.getString("ENAME"));
			evo.setJob(rsRs.getString("JOB"));
			evo.setMgr(rsRs.getString("MGR"));
			evo.setSal(rsRs.getString("SAL"));
			evo.setComm(rsRs.getString("COMM"));
			evo.setDeptno(rsRs.getString("DEPTNO"));
			
			aList.add(evo);
				}//end of while문
			}//end of if문 
		
		}catch(Exception e) {
			System.out.println("emsSelect() 함수 DB연결 또는 쿼리 문제 발생 >>>> "+e.getMessage());
			}//end of try-catch문
		
		//aList를 반환함
		return aList;
		}//end of empSelect  함수
	
	//main 함수
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//ArrayList는 일반함수이기 때문에 사용하기 위해
			//new 인스턴스를 해야함
			//exe.empSelect의 값을 aList에 넣음
			Ex_Emp_1 exe = new Ex_Emp_1();
			ArrayList<Ex_EmpVO> aList = exe.empSelect();
			
			
			System.out.println("aList에 담긴 EmpVO 갯수 : "+aList.size());
			//확인하는 코드가 에러를 일으킬 수도 있다
			if(aList.size() > 0) {
				for(int i = 0; i < aList.size(); i++) {
					//제너릭을 사용해서 형변환이 필요없음
					Ex_EmpVO evo = aList.get(i);
					System.out.print(evo.getEmpno());
					System.out.print(" : " +evo.getEname());
					System.out.print(" : " +evo.getJob());
					System.out.print(" : " +evo.getMgr());
					System.out.print(" : " +evo.getHiredate());
					System.out.print(" : " +evo.getSal());
					System.out.print(" : " +evo.getComm());
					System.out.println(" : " +evo.getDeptno());					
			}//end of for 문
		}//end of if문
	}//end of main함수
}//end of Ex_Emp 클래스
