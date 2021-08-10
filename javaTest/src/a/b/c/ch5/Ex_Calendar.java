package a.b.c.ch5;

import java.util.Calendar;

public class Ex_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calendar를 인스턴스 할때는 new가 아니라 getInstance를 통해 불러와야함
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>>>> \n" + cd);
		
		/*Calendar는 상수값을 가지고 있음
		YEAR = 1
		MONTH = 2
		DATE =5
		그래서 get(int)를 통해 해당 값을 불러올 수 있다
		*/
		
		//년
		int y = cd.get(Calendar.YEAR);
		System.out.println("y>>>> " + y);
		System.out.println("cd.get(1) >>> " + cd.get(1));
		
		//월
		//월 값은 0~11을 가지기 때문에 1을 더함
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("m>>>> " + m);
		System.out.println("cd.get(2)+1 >>> " + cd.get(2)+1);
		
		//일
		int d = cd.get(Calendar.DATE);
		System.out.println("d>>>> " + d);
		System.out.println("cd.get(5) >>> " + cd.get(5));
		
		//DATE와 동일한 값을 가져감
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>>>> "+d1);
		System.out.println("cd.get(5) >>> " + cd.get(5));
		
		//시
		//24시간 표시방식
		int t = cd.get(Calendar.HOUR_OF_DAY);
		System.out.println("t>>>> " + t);
		System.out.println("cd.get(11) >>> " + cd.get(11));
		
		//12시간 표시방식
		int t1 = cd.get(Calendar.HOUR);
		System.out.println("t1 >>>> " + t1);
		System.out.println("cd.get(10) >>> " + cd.get(10));
		//분
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm>>>> " + mm);
		System.out.println("cd.get(12) >>> " + cd.get(12));
		
		//초
		int s = cd.get(Calendar.SECOND);
		System.out.println("s>>>> " + s);
		System.out.println("cd.get(13) >>> " + cd.get(13));
		
		String time = "현재시간은"
					  + y + "년"
					  + m + "월"
					  + d + "일"
					  + t + "시"
					  + mm + "분"
					  + s + "초 입니다.";
	  System.out.println("time >>>> :  \n" + time);
		
	}//end of main Method

}//end of Ex_Calender class
