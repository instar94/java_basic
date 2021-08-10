package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList를 선언
		ArrayList aList = new ArrayList();
		
		//aList에 TestVO의 주소값을 담음
		for(int i = 0; i < 3; i++) {
		//TestVO 사용 및 주소값을 담기 위해 인스턴스
			TestVO tvo = new TestVO();
			
			//TestVO가 가지고있는 자원들도 인스턴스
			tvo.setMnum("00_"+i);
			tvo.setMid("aa_"+i);
			tvo.setMpw("aa00_"+i);
			tvo.setMhp("010_"+i);
			tvo.setMjuso("주소_"+i);
			
			//이 데이터들을 가르키는 주소값->tvo를 aList에 담기
			aList.add(tvo);
			System.out.println(aList);
		}//end of for 문
		
		
		//aList의 크기 프린트
		System.out.println(aList.size());
		
		//tvo 주소값을 이용해 TestVO에 있는 자원들을 꺼내옴
		for(int i = 0; i < aList.size(); i++) {
			
			//aList에 담긴 하나 하나의 주소값을 보여줌
			System.out.println(i + ">>>> : " + aList.get(i));
			
			//Test VO는 자원이 5개인 클래스
			//aList는 그저 ArrayList임
			//둘의 데이터 크기는 다름 -> 동치를 위해 등치캐스팅(우측이 맞춰줌)
			//get(i) : i번째 구성요소 출력
			TestVO tvo = (TestVO)aList.get(i);
			
			System.out.print(" "+ tvo.getMnum());
			System.out.print(" "+ tvo.getMid());
			System.out.print(" "+ tvo.getMpw());
			System.out.print(" "+ tvo.getMhp());
			System.out.println(" "+ tvo.getMjuso());
			
		}//end of for문
		
		//------------------------------------------
		//제너릭(Generic) : 데이터 타입을 한정함
		//= 한가지만 사용할 것
		// 값 자체는 동일하나 이클립스상 있던 노란줄도 없음
		System.out.println("\n제너릭으로 실행 >>>>>>>>>>>>");
		
		//<TestVO> : TestVO의 자원만 쓰라는 제너릭
		ArrayList<TestVO> aList1 = new ArrayList<TestVO>();
		
		for(int i = 0; i < 3; i++) {
		
		TestVO tvo1 = new TestVO();
		
		//TestVO가 가지고있는 자원들도 인스턴스
		tvo1.setMnum("00_"+i);
		tvo1.setMid("aa_"+i);
		tvo1.setMpw("aa00_"+i);
		tvo1.setMhp("010_"+i);
		tvo1.setMjuso("주소_"+i);
		
		//이 데이터들을 가르키는 주소값->tvo를 aList에 담기
		aList1.add(tvo1);
		System.out.println(aList1);
	}//end of for 문
	
	
	//aList의 크기 프린트
	System.out.println(aList1.size());
	
	//tvo 주소값을 이용해 TestVO에 있는 자원들을 꺼내옴
	for(int i = 0; i < aList1.size(); i++) {
		
		//aList에 담긴 하나 하나의 주소값을 보여줌
		System.out.println(i + ">>>> : " + aList1.get(i));
		
		//Test VO는 자원이 5개인 클래스
		//aList는 그저 ArrayList임
		//둘의 데이터 크기는 다름 -> 동치를 위해 등치캐스팅(우측이 맞춰줌)
		//get(i) : i번째 구성요소 출력
		TestVO tvo1 = (TestVO)aList1.get(i);
		
		System.out.print(" "+ tvo1.getMnum());
		System.out.print(" "+ tvo1.getMid());
		System.out.print(" "+ tvo1.getMpw());
		System.out.print(" "+ tvo1.getMhp());
		System.out.println(" "+ tvo1.getMjuso());
		
	}//end of for문
		
	}//end of main method

}//end of ArrayList_1 클래스
