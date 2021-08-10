//package
package a.b.c.ch9;

//import

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty;

//Ŭ����
public class Ex_Emp_2 {

	//���
	//DataSource�� ��� conn���� ����Ʈ��
	
	//������
	public static final String EMP_SELECT = "SELECT * FROM EMP";
	
	//�������
	
	//������
	//connProperty���� import�ؼ� �ʿ� ����
	
	//�Լ�
	public ArrayList<Ex_EmpVO> empSelect() {
		
		//�������� ������ʱ�ȭ�� �̸��̸�
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		
		ArrayList<Ex_EmpVO> aList = null;
		
		try {
		//�ڿ��� �ִ� ConnProperty.getConnection���� ������
		conn = ConnProperty.getConnection();
		stmt = conn.createStatement();
		rsRs = stmt.executeQuery(Ex_Emp_2.EMP_SELECT);
		
		//rsRs�� �����Ͱ� ���ٸ� ���� �� �ʿ䰡 ����
		//if�� ������
		if(rsRs !=null) {
		
		//�����Ͱ� �־�߸� �ν��Ͻ���
		aList = new ArrayList<Ex_EmpVO>();
		
		//while�� ���� aList�ȿ� ������ ��Ƴ���
		//Ŀ�� �Լ� ����
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
				}//end of while��
			}//end of if�� 
		
		}catch(Exception e) {
			System.out.println("emsSelect() �Լ� DB���� �Ǵ� ���� ���� �߻� >>>> "+e.getMessage());
			}//end of try-catch��
		
		//aList�� ��ȯ��
		return aList;
		}//end of empSelect  �Լ�
	
	//main �Լ�
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//ArrayList�� �Ϲ��Լ��̱� ������ ����ϱ� ����
			//new �ν��Ͻ��� �ؾ���
			//exe.empSelect�� ���� aList�� ����
			Ex_Emp_2 exe = new Ex_Emp_2();
			ArrayList<Ex_EmpVO> aList = exe.empSelect();
			
			
			System.out.println("aList�� ��� EmpVO ���� : "+aList.size());
			//Ȯ���ϴ� �ڵ尡 ������ ����ų ���� �ִ�
			/*
			aList.clear() <-ArrayList�� ��������� �Լ�
							������ null���� �ƴ�
			aList = null; <- null���� �������
			boolean b - aList.isEmpty();
			System.out.println(b)
			-> null���� ���� ������ �Ͼ� �� �� ������ Ȯ���Ұ�
			
			*/
			if(aList.size() > 0) {
				for(int i = 0; i < aList.size(); i++) {
					//���ʸ��� ����ؼ� ����ȯ�� �ʿ����
					Ex_EmpVO evo = aList.get(i);
					System.out.print(evo.getEmpno());
					System.out.print(" : " +evo.getEname());
					System.out.print(" : " +evo.getJob());
					System.out.print(" : " +evo.getMgr());
					System.out.print(" : " +evo.getHiredate());
					System.out.print(" : " +evo.getSal());
					System.out.print(" : " +evo.getComm());
					System.out.println(" : " +evo.getDeptno());					
			}//end of for ��
			}else {
				System.out.println("aList�� �����Ͱ� ���� >>> : "+ aList);
		}//end of if-else ��
	}//end of main�Լ�
}//end of Ex_Emp Ŭ����
