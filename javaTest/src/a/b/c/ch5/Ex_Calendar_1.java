package a.b.c.ch5;

import java.util.Calendar;
import java.util.TimeZone;

public class Ex_Calendar_1 {

	//TimeZone 클래스 : 다양한 도시의 시간대를 가져오는 클래스
	//getAvailableIDs() : ID를 가지고 옴
	public static void timeZone() {
		//cityID라는 문자열 배열에 모든 시간대를 담음
		String cityID[] = TimeZone.getAvailableIDs();
		//cityID 문자열을 길이 = 자바에서 지원하는 시간대의 수
		System.out.println("전세계 도시 수 >> : " + cityID.length);
	
		//반복문을 이용하요 city ID를 나열 
	for (int i =0 ; i < cityID.length; i++) {
		System.out.println("citiyID["+i+"] >>>> " + cityID[i]);
		}
	}
	
	public static String cityTime(Calendar cd) {
		
		String time = "현재시간 : "
					  + cd.get(Calendar.YEAR)+"년"
					  +(cd.get(Calendar.MONTH)+1)+"월"
					  +cd.get(Calendar.DATE) + "일"
					  +cd.get(Calendar.HOUR_OF_DAY)+"시"
					  +cd.get(Calendar.MINUTE)+"분"
					  +cd.get(Calendar.SECOND)+"초";
		
		return time;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//세계 도시 지명 가져오기
		Ex_Calendar_1.timeZone();
		
		String strID[] = {  "Asia/Seoul"
		           		,"America/New_York"
		           		,"Europe/Paris"
		           		,"Europe/London"
		           		,"Australia/Sydney"
		           		,"Europe/Dublin"};
		
		String strName[] = {"서울","뉴욕","파리","런던","시드니","더블린"};
		
		//도시의 시간 가져오기
		for(int i = 0; i <strID.length; i++) {
			
			//getTimeZone : ID가 가르키는 있는 시간대를 가져옴
			TimeZone tz = TimeZone.getTimeZone(strID[i]);
			//Calendar 를 인스턴스함
			Calendar cd = Calendar.getInstance(tz);
			//String t는 cityTime 함수에 캘린더 참조변수를 넣음
			String t = Ex_Calendar_1.cityTime(cd);
			
			System.out.println(strName[i]+""+t);
		}

	
	}

}
