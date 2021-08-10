package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 try - catch - finally 구문
		 try{
		 예외 발생이 예상되는 구문 작성
		 }catch(예외클레스 변수){
		 예외처리하는 블럭 - 계층 구조상 하위
		 }catch(예외클레스 변수){
		 예외처리하는 블럭 = 계층 구조상 상위
		 }finally{
		 예외처리와 관계없이 실행되는 블럭
		 }
		 
		 */
			//ArrayIndexOutOfBounds 오류
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
			}catch(Exception e){
				System.out.println("Exception 에러"+e.getMessage());
			}
			
			
			//
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat();
			//Date 참조함수 d를 심플데이트포멧 형태로 만들고
			//이를 문자열 date로 선언함
			String date = sdf.format(d);
			System.out.println("date >>> : " + date);
			System.out.println("date >>> : "
								+ new SimpleDateFormat().format(new Date()));
	}

}

//컴파일시 오류 발생
/*
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at a.b.c.ch6.Ex_Exception.main(Ex_Exception.java:12)
	
arr.length = 3
그러나 arr[] 배열에는 0,1,2 밖에 없음

따라서 오류 발생
 */
