package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		/*
		 Date Ŭ������ epoch (����ũ) �ð��� ������
		 1970�� 1�� 1�� 0�� 0�� 0�ʸ� �������� ������ �ð��� millsecond�� ��ȯ 
		 */
		
		//����
		//public int getYear(); <- int���� ��ȯ��
		//getyear()�� ����� �� ���� �� ó�� ǥ�������� ��� ��밡����
		int year = d.getYear();
		System.out.println("year >>>> : " + year );
		
		//���� �Ϲ����� �ؿ� �����ϰ� �Ϸ��� 1900�� ���ؾ� �Ѵ�
		year = year + 1900;
		System.out.println("year + 1900 >>>> : " + year);
		
		//��
		//public int getMonth()
		int month = d.getMonth();
		//0~11�� ���� ����
		System.out.println("month >>>>" + month);
		
		//�Ϲ����� �ް� �����ϰ� ���������� 1�� ���ؾ���
		month = month + 1;
		System.out.println("month + 1 >> "+ month);
		
		//��
		//public int getDate()
		int date = d.getDate();
		System.out.println("date >>>> : "+ date);
		
		//��¥�� ǥ��
		// String.replace : ���ڸ� �ٲٴ� �ʵ�
		String time = year + "." + month + "." + date;
		System.out.println("time >>>>> : "+ time);
		
		// . -> -
		time = time.replace('.', '-');
		System.out.println("time >>>>> : "+ time);
		
		// - -> /
		time = time.replace('-', '/');
		System.out.println("time >>>>> : "+ time);
	}

}
