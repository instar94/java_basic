package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		- �� Deprecated. : �̰ͺ��� ���� ������ ������
		- Calender�� �ֽ��̳� �ѱ������� ���⶧���� Date�� ����
		- �� ��ǻ�ʹ� �ð��� �ʷ� ����
			- 1day = 24 * 60 * 60 = 86400 sec
		- The leap : ����
		- GMT : �׸���ġ õ���� �ð�
		- GPS : global positioning Sytem
		// 1���� 1900�� �� ���� A year y is represented by the integer y - 1900.
		// 0~11�̳��� (1�� ���������) A month is represented by an integer from 0 to 11; 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		Date�� Ŭ���̾�Ʈ�� �ð��� �����
		 
		 */
		
		//util�� �ִ°� import
		Date d = new Date();
		//Ŭ���̾�Ʈ�� �ð��� �����
		System.out.println("d>>>>>>"+d);
		//�ּ� ���
		System.out.println("d>>>>>>"+System.identityHashCode(d));
		//SimpeDateFormat ����� ���� �������� ����
		//�Ű������� ���ϴ� ������ ���ڿ��� ǥ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		//�ּҰ� ����
		System.out.println("sdf >>>>>>> " + sdf);
		//.format(d)�� �ؾ� SimpleDateFormat()�� ���� ���Ĵ�� �ݿ���
		System.out.println("sdf >>>>>>> " + sdf.format(d));
		
		Date d1 = new Date();
		System.out.println("d1>>>>>>"+d1);
		System.out.println("d1>>>>>>"+System.identityHashCode(d1));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf1 >>>>>>> " + sdf1);
		System.out.println("sdf1 >>>>>>> " + sdf1.format(d1));
	
		//�̰� ���� ���� �����
		Date d2 = new Date();
		System.out.println("d2>>>>>>> "+d2);
		System.out.println("d2 >>>>>> "+System.identityHashCode(d2));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("sdf2 >>>> "+sdf2);
		System.out.println("sdf2 >>>> "+sdf2.format(d2));
		
	}//end of main method
}//end of Ex_Date class
