//package
package a.b.c.ch9;

//import

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty;

//클래스
public class Ex_Emp_2 {

	//상수
	//DataSource를 모두 conn에서 임포트함
	
	//쿼리문
	public static final String EMP_SELECT = "SELECT * FROM EMP";
	
	//멤버변수
	
	//생성자
	//connProperty에서 import해서 필요 없음
	
	//함수
	public ArrayList<Ex_EmpVO> empSelect() {
		
		//지역변수 선언및초기화는 미리미리
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		
		ArrayList<Ex_EmpVO> aList = null;
		
		try {
		//자원이 있는 ConnProperty.getConnection으로 변경함
		conn = ConnProperty.getConnection();
		stmt = conn.createStatement();
		rsRs = stmt.executeQuery(Ex_Emp_2.EMP_SELECT);
		
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
			Ex_Emp_2 exe = new Ex_Emp_2();
			ArrayList<Ex_EmpVO> aList = exe.empSelect();
			
			
			System.out.println("aList에 담긴 EmpVO 갯수 : "+aList.size());
			//확인하는 코드가 에러를 일으킬 수도 있다
			/*
			aList.clear() <-ArrayList를 비워버리는 함수
							하지만 null값은 아님
			aList = null; <- null값을 집어넣음
			boolean b - aList.isEmpty();
			System.out.println(b)
			-> null값이 들어가면 문제가 일어 날 수 있으니 확인할것
			
			*/
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
			}else {
				System.out.println("aList에 데이터가 없음 >>> : "+ aList);
		}//end of if-else 문
	}//end of main함수
}//end of Ex_Emp 클래스
