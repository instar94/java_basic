package a.b.c.ch5;

public class Ex_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ���ڿ� ������ ��ȯ
		//������
		//���� -> ����
		//+�� ���� ���ڿ��̵� -> ��� ����
		String s0 = 1 + ""; //+�� ���� ���ڿ��� �ٲ�
		System.out.println("s0>>>>> "+s0);
		
		//����
		//String.valueof() : int���� String ������ ��ȯ��
		String s1 =String.valueOf(1);
		System.out.println("s1>>>>> "+s1);
		
		//Integer.toString
		//Int���� String ������ ��ȯ��
		String s2 = Integer.toString(1);
		System.out.println("s2>>>>> "+s2);
		
		//parseInt() : ���� ���ڸ� ���ڷ� �ٲٴ� �Լ�
		//���ڸ� Int������ �����Ѵ�
		int i0 = Integer.parseInt("1");
		System.out.println("i0>>>>> "+i0);
		
		//�迭�� �ִ� ���ڿ��� int������ ����ȯ
		String sval[] = {"010","111","222"};
		//�迭�� ���ڿ��̰�, ������ int����
		//����ȯ�� �ʿ���
		//int sval0 ������ ��������
		int sval0 = Integer.parseInt(sval[0]);
		//sval0������ ���� (println���� toString�� ��)
		System.out.println("sval0>>>"+ sval0);
		
		int sval1 = Integer.parseInt(sval[1]);
		System.out.println("sval1>>>"+ sval1);
		
		int sval2 = Integer.parseInt(sval[2]);
		System.out.println("sval2>>>"+ sval2);
		
		//���� ������ �Ʒ��� ���� for������ ��ü �� ���� �ִ�.
		
		for (int i = 0; i < sval.length ; i++) {
			System.out.println(Integer.parseInt(sval[i]));
			
				int iv = Integer.parseInt(sval[i]);
			
				System.out.println("iv>>>>>" + iv);
			
		}//end of for flow 
		
	}//end of main method

}//end of Ex_String_3 Class
