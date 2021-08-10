package a.b.c.ch6;

//reflect.Method �� �̿��� �Լ��� �̿��� �� ����
//������ / �ʵ�/ ������̼� ��� ���� �� �� ����
//���¸� ���ų� ��뵵 ��� ������ 
import java.lang.reflect.Method;

public class Ex_ClassName extends java.lang.Object{
	
	public void aM() {
		System.out.println("Ex_ClassName aM() �Լ� ���� >>>> ");
		System.out.println("Ex_ClassName aM() �Լ�! ");
		System.out.println("Ex_ClassName aM() �Լ� �� >>>> ");
	}
	
	public void bM() {
		System.out.println("Ex_ClassName bM() �Լ� ���� >>>> ");
		System.out.println("Ex_ClassName bM() �Լ�! ");
		System.out.println("Ex_ClassName bM() �Լ� �� >>>> ");
	}
	
	public void cM() {
		System.out.println("Ex_ClassName cM() �Լ� ���� >>>> ");
		System.out.println("Ex_ClassName cM() �Լ�! ");
		System.out.println("Ex_ClassName cM() �Լ� �� >>>> ");
	}
	
	public void dM() {
		System.out.println("Ex_ClassName dM() �Լ� ���� >>>> ");
		System.out.println("Ex_ClassName dM() �Լ�! ");
		System.out.println("Ex_ClassName dM() �Լ� �� >>>> ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_ClassName main �Լ� ���� >>>> ");
		System.out.println("Ex_ClassName main �Լ�! ");
		
		//�ڽ�Ŭ���� ���� �ڽ�Ŭ���� �������� = new �ڽ�Ŭ���� ������ ����()
		//�θ�Ŭ���� ���� �θ�Ŭ���� �������� = new �ڽ�Ŭ���� ������ ����()
		//���ε� ���� 
		//�� ��� �θ�Ŭ�������� �ڽ�Ŭ������ �̾Ƴ� �� �ִ�.
		//Reference Casting �̶�� ��
		// �θ� obj���� �ڽ�Ŭ���� Ex_ClassName�� ����������
		//obj���� Ex_ClassName�� ĳ�����ϰ� ��ü����ȯ �Ѱ���
		Object obj = new Ex_ClassName();
		System.out.println("�θ�Ŭ������ Objectobj �θ�Ŭ������������" + obj);
		
		//��, �ڹٴ� �� �� ��� �����ؾ��ϱ� ������ �ڷ����� ����������
		Ex_ClassName cn1 = (Ex_ClassName)obj;
		System.out.println("cn1 �������� >>> : " + cn1);
		System.out.println("cn1.getClass() >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() >>> : " + cn1.getClass().getName());
		
		
		Ex_ClassName en = new Ex_ClassName();
		System.out.println("en ���� ���� >>> " + en);
		System.out.println("en.getClass() >>> " + en.getClass().getName());
		
		//thorws�� ��� �� �� ����
		//Class.forName�� �̿��ؼ� �ڿ� ��� ���� (new, ��� ����)
		//-> �ֹ߼� �Լ��� 
		//�� �̸� ����ó���� �س��߸� ����� ������ 
		try {
		Class cc = Class.forName("a.b.c.ch6.Ex_ClassName");
		System.out.println("cc >>>> "+ cc);
		Ex_ClassName cc1= (Ex_ClassName)cc.newInstance();
		System.out.println("cc1 >>>> " + cc1);
		cc1.aM(); //<-new�� ����� �̿����� �ʰ� ����� �� ����
		
		//Ŭ������ ����� �޼ҵ带 ã��
		System.out.println("--------------------");
		Method m [] = cc.getDeclaredMethods();
		for (int i = 0; i<m.length; i++) {
			System.out.println(">>> : "+ m[i].toString());
			String findM = m[i].getName();
			System.out.println("m["+i+"].getName()"+findM);
		}
		System.out.println("--------------------");
		
		Class aList = Class.forName("java.util.ArrayList");
		java.util.ArrayList aList1 = (java.util.ArrayList)aList.newInstance();
		System.out.println("aList >>>> "+aList);
		
		Class d = Class.forName("java.util.Date");
		java.util.Date dd = (java.util.Date)d.newInstance();
		System.out.println("dd >>>> "+dd);
		
		}catch(Exception c) {
			System.out.println("c ���� >>> "+c);
		}//end of try-catch
		
		System.out.println("Ex_ClassName main �Լ� �� >>>> ");
		}//end of main method 

}//end of Ex_ClassName class
