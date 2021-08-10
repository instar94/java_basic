package a.b.c.ch9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty_Test02;

//ArrayList<Ex_Test02VO> ���ʸ� ���� 
public class Ex_Test02 {
	
	// ������ 
	public static final String T3_SELECT = "SELECT * FROM T3";
	// �������

	// �Լ� 
	//���ʸ���� -> �ش� Ŭ���������� �����͸� ����
	//-> ĳ���� �����ڸ� ����� �ʿ䰡 ����
	//
	public ArrayList<Ex_Test02VO> t3Select() {
		
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		
		ArrayList<Ex_Test02VO> aList = null;
		
		
		try {
			
			conn = ConnProperty_Test02.getConnection();
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(Ex_Test02.T3_SELECT);
			

						
			if (rsRs !=null) {
				
				aList = new ArrayList<Ex_Test02VO>();
				
				while (rsRs.next()) {
					
					Ex_Test02VO tvo = new Ex_Test02VO();
					tvo.setT3_1(rsRs.getString("T3_1"));
					tvo.setT3_2(rsRs.getString("T3_2"));
					tvo.setT3_3(rsRs.getString("T3_3"));
					tvo.setT3_4(rsRs.getString("T3_4"));
					tvo.setT3_5(rsRs.getString("T3_5"));
					tvo.setT3_6(rsRs.getString("T3_6"));
					
					
					aList.add(tvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("t3Select() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ex_Test02 ext = new Ex_Test02();
		
		ArrayList<Ex_Test02VO> aList = ext.t3Select();

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				Ex_Test02VO tvo = aList.get(i);
				
				System.out.print(tvo.getT3_1() + " : ");
				System.out.print(tvo.getT3_2() + " : ");
				System.out.print(tvo.getT3_3() + " : ");
				System.out.print(tvo.getT3_4() + " : ");
				System.out.print(tvo.getT3_5() + " : ");				
				System.out.println(tvo.getT3_6());				
			}		
		}else {
			System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
		}
	}
}
