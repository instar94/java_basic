package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		- ★ Deprecated. : 이것보다 향상된 버전이 존재함
		- Calender가 최신이나 한국에서는 윤년때문에 Date를 쓴다
		- ★ 컴퓨터는 시간을 초로 센다
			- 1day = 24 * 60 * 60 = 86400 sec
		- The leap : 윤초
		- GMT : 그리니치 천문대 시간
		- GPS : global positioning Sytem
		// 1년은 1900을 뺀 값임 A year y is represented by the integer y - 1900.
		// 0~11이나옴 (1을 더해줘야함) A month is represented by an integer from 0 to 11; 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		Date는 클라이언트의 시간을 출력함
		 
		 */
		
		//util에 있는거 import
		Date d = new Date();
		//클라이언트의 시간을 출력함
		System.out.println("d>>>>>>"+d);
		//주소 출력
		System.out.println("d>>>>>>"+System.identityHashCode(d));
		//SimpeDateFormat 사용을 위해 참조변수 선언
		//매개변수로 원하는 형식을 문자열로 표현
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		//주소가 나옴
		System.out.println("sdf >>>>>>> " + sdf);
		//.format(d)를 해야 SimpleDateFormat()에 적은 형식대로 반영됨
		System.out.println("sdf >>>>>>> " + sdf.format(d));
		
		Date d1 = new Date();
		System.out.println("d1>>>>>>"+d1);
		System.out.println("d1>>>>>>"+System.identityHashCode(d1));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf1 >>>>>>> " + sdf1);
		System.out.println("sdf1 >>>>>>> " + sdf1.format(d1));
	
		//이걸 좀더 많이 사용함
		Date d2 = new Date();
		System.out.println("d2>>>>>>> "+d2);
		System.out.println("d2 >>>>>> "+System.identityHashCode(d2));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("sdf2 >>>> "+sdf2);
		System.out.println("sdf2 >>>> "+sdf2.format(d2));
		
	}//end of main method
}//end of Ex_Date class
