package a.b.c.ch6;

public class Ex_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sVal = "Hell Java Testing !!";
		//sval�� Hello�� �ִ� �� Ȯ��
		boolean bool = sVal.contains("Hello");
		System.out.println("bool >>> " + bool);
		
		String sVal1 = "�б����� ������ �������";
		bool = sVal1.contains("�б���");
		System.out.println("bool >>> " + bool);
		bool = sVal1.contains("������");
		System.out.println("bool >>> " + bool);
		
		//compareTo()
		//���ϰ��� 0/����/��� int
		//0 : ������ ����
		//��� : compareTo()�� ȣ���� ��ü�� ���ں��� ����
		//���� : ����
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "World";
		System.out.println("s1.compareTo(s2)>>>>"+s1.compareTo(s2));
		System.out.println("s1.compareTo(s3)>>>>"+s1.compareTo(s3));
		System.out.println("s1.compareTo(s1)>>>>"+s3.compareTo(s1));
	}

}
