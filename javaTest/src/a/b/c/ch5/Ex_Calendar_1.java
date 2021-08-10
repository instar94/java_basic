package a.b.c.ch5;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex_Calendar_1 {

	//TimeZone Ŭ���� : �پ��� ������ �ð��븦 �������� Ŭ����
	//getAvailableIDs() : ID�� ������ ��
	public static void timeZone() {
		//cityID��� ���ڿ� �迭�� ��� �ð��븦 ����
		String cityID[] = TimeZone.getAvailableIDs();
		//cityID ���ڿ��� ���� = �ڹٿ��� �����ϴ� �ð����� ��
		System.out.println("������ ���� �� >> : " + cityID.length);
	
		//�ݺ����� �̿��Ͽ� city ID�� ���� 
	for (int i =0 ; i < cityID.length; i++) {
		System.out.println("citiyID["+i+"] >>>> " + cityID[i]);
		}
	}
	
	public static String cityTime(Calendar cd) {
		
		String time = "����ð� : "
					  + cd.get(Calendar.YEAR)+"��"
					  +(cd.get(Calendar.MONTH)+1)+"��"
					  +cd.get(Calendar.DATE) + "��"
					  +cd.get(Calendar.HOUR_OF_DAY)+"��"
					  +cd.get(Calendar.MINUTE)+"��"
					  +cd.get(Calendar.SECOND)+"��";
		
		return time;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ���� ��������
		Ex_Calendar_1.timeZone();
		
		String strID[] = {  "Asia/Seoul"
		           		,"America/New_York"
		           		,"Europe/Paris"
		           		,"Europe/London"
		           		,"Australia/Sydney"
		           		,"Europe/Dublin"};
		
		String strName[] = {"����","����","�ĸ�","����","�õ��","����"};
		
		//������ �ð� ��������
		for(int i = 0; i <strID.length; i++) {
			
			//getTimeZone : ID�� ����Ű�� �ִ� �ð��븦 ������
			TimeZone tz = TimeZone.getTimeZone(strID[i]);
			//Calendar �� �ν��Ͻ���
			Calendar cd = Calendar.getInstance(tz);
			//String t�� cityTime �Լ��� Ķ���� ���������� ����
			String t = Ex_Calendar_1.cityTime(cd);
			
			System.out.println(strName[i]+""+t);
		}

	
	}

}
