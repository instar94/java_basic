package a.b.c.ch5;

import java.util.Calendar;

public class Ex_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calendar�� �ν��Ͻ� �Ҷ��� new�� �ƴ϶� getInstance�� ���� �ҷ��;���
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>>>> \n" + cd);
		
		/*Calendar�� ������� ������ ����
		YEAR = 1
		MONTH = 2
		DATE =5
		�׷��� get(int)�� ���� �ش� ���� �ҷ��� �� �ִ�
		*/
		
		//��
		int y = cd.get(Calendar.YEAR);
		System.out.println("y>>>> " + y);
		System.out.println("cd.get(1) >>> " + cd.get(1));
		
		//��
		//�� ���� 0~11�� ������ ������ 1�� ����
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("m>>>> " + m);
		System.out.println("cd.get(2)+1 >>> " + cd.get(2)+1);
		
		//��
		int d = cd.get(Calendar.DATE);
		System.out.println("d>>>> " + d);
		System.out.println("cd.get(5) >>> " + cd.get(5));
		
		//DATE�� ������ ���� ������
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>>>> "+d1);
		System.out.println("cd.get(5) >>> " + cd.get(5));
		
		//��
		//24�ð� ǥ�ù��
		int t = cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("t>>>> " + t);
		System.out.println("cd.get(11) >>> " + cd.get(11));
		
		//12�ð� ǥ�ù��
		int t1 = cd.get(Calendar.HOUR);
		System.out.println("t1 >>>> " + t1);
		System.out.println("cd.get(10) >>> " + cd.get(10));
		//��
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm>>>> " + mm);
		System.out.println("cd.get(12) >>> " + cd.get(12));
		
		//��
		int s = cd.get(Calendar.SECOND);
		System.out.println("s>>>> " + s);
		System.out.println("cd.get(13) >>> " + cd.get(13));
		
		String time = "����ð���"
					  + y + "��"
					  + m + "��"
					  + d + "��"
					  + t + "��"
					  + mm + "��"
					  + s + "�� �Դϴ�.";
	  System.out.println("time >>>> :  \n" + time);
		
	}//end of main Method

}//end of Ex_Calender class
