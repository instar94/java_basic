package a.b.c.ch5;

public class Ex_String_2 extends java.lang.Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Class ���ڿ� ���ϱ�
		//���Լ� : equals ();
		String s1 = "abc";
		String s2 = "abc";
		//new String()�� ������ ��� �����ڸ� ����� ����
		//�׷��� new String()�� ����� ��� ������ ��� �Ұ���
		//���ڿ��񱳿� �����ڴ� ��� �� �ϴ°� ����
		boolean b0 = s1.equals(s2);
		boolean b0_1 = s1==s1;
		System.out.println("b0>>>>>>"+b0);
		System.out.println("b0_1>>>>>"+b0_1);
		System.out.println("System.identyHashCode(s1)>>>> : " + System.identityHashCode(s1));
		System.out.println("System.identyHashCode(s2)>>>> : " + System.identityHashCode(s2));
		
		//s1�̶� s2�� �������� ��
		//s1.equals(s2);
		boolean b = s1.equals(s2);
		System.out.println(b);
		// b�� true ���� Ȯ���ϴ� ������ �ʿ��ϴ�
		if(b) {
			System.out.println("s1.equals(s2) >>> :  "+b);
		}
		
		//���ڳ����� �񱳰� �����ϴ�.
		String ss1 = "abcd";
		String ss2 = "abcde";
		// == : ������ = �ڹٿ����� �����ڷ������� ��� (���� ��)
		//�ڹٿ��� ==�� java.lang.Object.equals() �� ������
		//�� �ڹٽ�ũ��Ʈ������ ������ Ÿ���� ���� �� ��, ������ Ÿ�Լ���X
		//������ Ÿ���� var�ϳ��� ���� 
		//���ڿ� == ���ڿ� / ���� == ����
		//But, �ڹٿ��� ���ڿ��� ���Ҷ��� ������ ����ϸ� �� ��
		boolean b1 = ss1.equals(ss2);
		System.out.println(b1);
		
		/*
		*equals �� String �� Object Ŭ������ �� �� ����
			java.lang.Object.equals(); : ��ü�� �ּ� ���� ��
				'=='(������)�� ������
				������ : == ��
			java.lang.String.equals(); : ���ڿ��� ���ϴ� �Լ�
		
		equals �Լ��� ��� �Ҷ��� ���ϴ� ��ü�� ����  jvm�� �Ǵ���
			- ���� �Ǵ��ϴ� ���� �ƴ�
			- JVM�� String���� �Ǵ��ϸ� StringŬ�������� ����ϰ�
			- ���ڿ��� �ƴ϶�� �����ϸ� �ּҰ��� ����
		*/
		
		//�ְܼ� b2 >>>> true ->�ּҰ��� �ٸ����� ���ڿ��μ��� ������
		//b2_1 >>> false -> ���ڿ��� ������ �ּҰ��� �ٸ�
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println("s3>>>> : " + s3);
		System.out.println("s4>>>> : " + s4);
		System.out.println("System.identyHashCode(s3)>>>> : " + System.identityHashCode(s3));
		System.out.println("System.identyHashCode(s4)>>>> : " + System.identityHashCode(s4));
		
		boolean b2 = s3.equals(s4);
		boolean b2_1 = s3 ==s4;
		System.out.println("b2>>>>>" + b2);
		System.out.println("b2_1>>>>"+b2_1);
	}

}
