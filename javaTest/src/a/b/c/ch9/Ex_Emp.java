//package
package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//import

//Ŭ����
public class Ex_Emp {

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
	public Ex_Emp() {
		//JDBC ����̹� ����
		try {
			Class.forName(Ex_Emp.ORCL_JDBC_DRIVER);
		}catch(Exception e) {
			System.out.println("���� : JDBC ����̹� ojdnc6.jar ��ã��"+e.getMessage());
		}
	}//end of Ex_Emp ������
	
	//�Լ�
	public ArrayList empSelect() {
		
		//�������� ������ʱ�ȭ�� �̸��̸�
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		
		try {
		conn = DriverManager.getConnection(Ex_Emp.ORCL_URL
										  ,Ex_Emp.ORCL_UESR
										  ,Ex_Emp.ORCL_PASS );
		stmt = conn.createStatement();
		rsRs = stmt.executeQuery(Ex_Emp.EMP_SELECT);
		
		//rsRs�� �����Ͱ� ���ٸ� ���� �� �ʿ䰡 ����
		//if�� ������
		if(rsRs !=null) {
		
		//�����Ͱ� �־�߸� �ν��Ͻ���
		aList = new ArrayList();
		
		//while�� ���� aList�ȿ� ������ ��Ƴ���
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
			Ex_Emp exe = new Ex_Emp();
			ArrayList aList = exe.empSelect();
			
			
			System.out.println("aList�� ��� EmpVO ���� : "+aList.size());
			//Ȯ���ϴ� �ڵ尡 ������ ����ų ���� �ִ�
			if(aList.size() > 0) {
				for(int i = 0; i < aList.size(); i++) {
					//aList�� Ex_EmpVO���� �ƴ�(ArrayList����)
					//���� ĳ������ �ʿ��� -> ���ʸ��� ����ϸ� ���ص���
					Ex_EmpVO evo = (Ex_EmpVO)aList.get(i);
					System.out.print(evo.getEmpno());
					System.out.print(" : " +evo.getEname());
					System.out.print(" : " +evo.getJob());
					System.out.print(" : " +evo.getMgr());
					System.out.print(" : " +evo.getHiredate());
					System.out.print(" : " +evo.getSal());
					System.out.print(" : " +evo.getComm());
					System.out.println(" : " +evo.getDeptno());
					
				}//end of for ��
			}
	}//end of main�Լ�

}//end of Ex_Emp Ŭ����
