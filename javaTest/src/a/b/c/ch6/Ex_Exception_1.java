package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//int형 배열 선언
			int arr[] = new int[3];//0,1,2번째 구성요소 존재
			
			//arr.length = 3임 (구성요소가 3개니까)
			//그러나 3번째 구성요소는 없음
			for (int i=0; i<=arr.length; i++) {
				System.out.println("["+i+"] >>> : " + arr[i]);
			}//end of for 문
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("ArrayIndexOutOfBoundsException 에러 발생 : "+a.getMessage());
			}finally{
				System.out.println("예외발생과 관계없이 실행");
			}//end of fianlly

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println("date >>> : " 
					+ new SimpleDateFormat().format(new Date()));
		
		}//end of main method
		
	}//end of Exception_1 class
