//package
package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//import

//Ŭ����
public class Ex_Emp_1 {

	//���
	//DataSource : �����ͺ��̽� ��������
		//�����ͺ��̽��ҽ��� �ʿ��� ����
		//1. jdbc ����̹� ������ ���ӽ����̽�
		//2. �����ͺ��̽� ���� URL
		//3. ������
		//4. ���� �н�����
	//�� ���ڿ����� �������
	public static final String ORCL_JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String ORCL_UESR = "scott";
	public static final String ORCL_PASS = "tiger";
	
	//������
	public static final String EMP_SELECT = "SELECT * FROM EMP";
	
	//�������
	
	//������
	public Ex_Emp_1() {
		//JDBC ����̹� ����
		try {
			Class.forName(Ex_Emp.ORCL_JDBC_DRIVER);
		}catch(Exception e) {
			System.out.println("���� : JDBC ����̹� ojdnc6.jar ��ã��"+e.getMessage());
		}
	}//end of Ex_Emp ������
	
	//�Լ�
	public ArrayList<Ex_EmpVO> empSelect() {
		
		//�������� ������ʱ�ȭ�� �̸��̸�
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
			Ex_Emp_1 exe = new Ex_Emp_1();
			ArrayList<Ex_EmpVO> aList = exe.empSelect();
			
			
			System.out.println("aList�� ��� EmpVO ���� : "+aList.size());
			//Ȯ���ϴ� �ڵ尡 ������ ����ų ���� �ִ�
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
		}//end of if��
	}//end of main�Լ�
}//end of Ex_Emp Ŭ����
