package a.b.c.ch6;

//StringBuffer�� ���ó -> SQL

abstract class SqlQueryMap{
	public static String getSelectQuery(){	
	//SQL
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT					\n");
			sb.append("       A.NAME AS NAME	\n");
			sb.append("       A.ID   AS ID		\n");
			sb.append("       A.PW   AS PW		\n");
			sb.append("       A.HP   AS HP		\n");
			sb.append("       A.ADDR AS ADDR	\n");
			sb.append("FROM   MEMBER A			\n");
			
			return sb.toString();
	}
	
	//�߻�Ŭ���� �� �߻��Լ�
	public abstract void aM();
	
}

public class Ex_StringBuffer_1 extends SqlQueryMap{
	
	@Override
	public void aM() {
		// TODO Auto-generated method stub
				System.out.println(   " SqlQueryMap �߻�Ŭ�������� "
				                   	+ "\n aM() �߻��Լ��� "
				                   	+ "\n StringBufferTest_1 Ŭ������ "
				                   	+ "\n �������̵��ؼ� ����ü�� ������� "
				                   	+ "\n ����ü�� ����ٴ� �ǹ̴� {} �� ����ٴ� ���� ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� ���� �̸����� ���
		String selectQuery = SqlQueryMap.getSelectQuery();
		System.out.println("\n"+selectQuery);
		
		new Ex_StringBuffer_1().aM();
	}

}
