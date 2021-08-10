package a.b.c.ch9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty;

public class Ex_Dept_2 {

	// ��� 
	
	// ������ 
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	// �������
	
	// �Լ� 
	public ArrayList<Ex_DeptVO> deptSelect() {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList<Ex_DeptVO> aList = null;
		
		try {
			
			conn = ConnProperty.getConnection();
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(Ex_Dept_2.DEPT_SELECT);
			
//			10	ACCOUNTING	NEW YORK
//			20	RESEARCH	DALLAS
//			30	SALES	CHICAGO
//			40	OPERATIONS	BOSTON
			
			if (rsRs !=null) {
				aList = new ArrayList<Ex_DeptVO>();
				
				while (rsRs.next()) {
					
					Ex_DeptVO dvo = new Ex_DeptVO();
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
										
					aList.add(dvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("deptSelect() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ex_Dept_2 exe = new Ex_Dept_2();
		ArrayList<Ex_DeptVO> aList = exe.deptSelect();
		
		System.out.println("aList ������ :: aList ����ִ� ���� Ŭ����(EmpVO) ���� >>> : " + aList.size() + "\n");

		if (aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				Ex_DeptVO dvo = aList.get(i);
				System.out.print(dvo.getDeptno() + " : ");
				System.out.print(dvo.getDname() + " : ");				
				System.out.println(dvo.getLoc());				
			}		
		}
	}
}








