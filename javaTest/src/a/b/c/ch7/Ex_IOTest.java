package a.b.c.ch7;

import java.util.Scanner;

public class Ex_IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("IO ���� �׽�Ʈ >>> ");
		
		//Scanner�� input �ޱ� ����
		Scanner sc = new Scanner(System.in);
		
		//nextInt() : �޾ƿ� ���� int������ �ٲ����
		int data = sc.nextInt();
		System.out.println("data >>>> : " + data);
		//Integer.toBinaryString = ���������� �ٲ�
		System.out.println("binary >>> :" + Integer.toBinaryString(data));
		
		
		System.out.println("IO ���� �׽�Ʈ >>> ");
		
		Scanner sc1 = new Scanner(System.in);
		
		String dataS = sc1.nextLine();
		System.out.println("���� >>>> : " + dataS);
		
		//�Է��� ���ڿ��� ���ڸ� �ϳ��ϳ��� ����/�������� �������
		for (int i=0; i< dataS.length(); i++) {
			char c = dataS.charAt(i);
			System.out.println("binary >>> : "
								+ " :" + c
								+ " :" + (byte)c
								+ " :" + Integer.toBinaryString((byte)c));
		
		//in/out�� ����Ǹ� ������ �ݾ� �־����
		sc.close();
		sc1.close();
		
		}
		
	}

}
