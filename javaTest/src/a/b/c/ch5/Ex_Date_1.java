package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		/*
		 Date 클래스는 epoch (에포크) 시간을 리턴함
		 1970년 1월 1일 0시 0분 0초를 기준으로 지나간 시간을 millsecond로 반환 
		 */
		
		//연도
		//public int getYear(); <- int형을 반환함
		//getyear()를 사용할 수 없는 것 처럼 표시했지만 사실 사용가능함
		int year = d.getYear();
		System.out.println("year >>>> : " + year );
		
		//따라서 일반적인 해와 동일하게 하려면 1900을 더해야 한다
		year = year + 1900;
		System.out.println("year + 1900 >>>> : " + year);
		
		//월
		//public int getMonth()
		int month = d.getMonth();
		//0~11의 값을 가짐
		System.out.println("month >>>>" + month);
		
		//일반적인 달과 유사하게 가져가려면 1을 더해야함
		month = month + 1;
		System.out.println("month + 1 >> "+ month);
		
		//일
		//public int getDate()
		int date = d.getDate();
		System.out.println("date >>>> : "+ date);
		
		//날짜로 표현
		// String.replace : 문자를 바꾸는 필드
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
