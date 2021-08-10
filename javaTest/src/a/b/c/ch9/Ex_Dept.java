package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Dept {
	//���
	//������ �ҽ��� ����� ����
	//jdbc ����̹�
	//�����ͺ��̽� ���� url
	//�����ͺ��̽� ������
	//�����ͺ��̽� �н�����
	public static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	
	//������
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	
	//������
	public Ex_Dept() {
		try {
			//����̹��� �ҷ���
			Class.forName(ORCL_JDBC_DIRVER);
		} catch(Exception e) {
			System.out.println("����̹��� ����" + e.getMessage());
			}
	}
	
	//�Լ�
	public ArrayList deptSelect() {
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		
		
		try {
			//�� ���������� �ʿ��� ������ �ʱ�ȭ��
			//conn : ������ / url,����, �н������ ������
			conn = DriverManager.getConnection(Ex_Dept.ORCL_URL
											  ,Ex_Dept.ORCL_USER
											  ,Ex_Dept.ORCL_PASS);
			//statment�� ����
			stmt = conn.createStatement();
			//resultSet : stmt�� ������� statment�� dept Select�� �ְ�
			///�� ���� �ٽ� ����
			rsRs = stmt.executeQuery(Ex_Dept.DEPT_SELECT);
			
			//null���̶�� ���� �� �ʿ䰡 �����Ƿ�  if�� �ɷ���
			if(rsRs!=null) {
				
				//aList �ν��Ͻ�
				aList = new ArrayList();
				//Ŀ���Լ��� �޾ƿ�
				while(rsRs.next()){
					
					Ex_DeptVO dvo = new Ex_DeptVO();
					
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
					
					aList.add(dvo);
				}
			}
		}catch(Exception e) {
			System.out.println("db���� ����"+e.getMessage());
			}
		return aList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//deptSelect �Լ��� �Ϲ� �Լ� �̱� ������ ����� ���� �ν��Ͻ�
		Ex_Dept exe = new Ex_Dept();
		//���Ϲ��� ���� aList�� �־���
		ArrayList aList = exe.deptSelect();
		System.out.println("aList ������ >>>> : " + aList.size());
		
		//�ش� ������ �̾Ƴ�����
		if(aList.size()>0) {
			for (int i=0; i<aList.size();i++) {
				//Ex_DeptVO�� �ִ� ������ �����
				//�ٸ� aList�� Ex_DeptVO���� �ƴ϶� ����ȯ �ʿ�
				Ex_DeptVO dvo = (Ex_DeptVO)aList.get(i);
				
				System.out.print(dvo.getDeptno() +" : ");
				System.out.print(dvo.getDname() +" : ");
				System.out.println(dvo.getLoc() +" : ");
				 
			}
		}
	}
}
