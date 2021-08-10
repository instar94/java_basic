package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자로 제너릭 하기
		//제너릭으로 String을 받았기 때문에 문자열로만 받아야함
		//제너릭 < > 이란 데이터 타입을 통일하는 것임
		//대신 캐스팅이라는 행동이 없어져 편해짐
		//사용할때는 parseint 등의 함수로 원하는 값으로 해야함
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("배동민");//문자열
		System.out.println("aList>>> :"+ aList);
		
		aList.add("25");//숫자
		System.out.println("aList>>> :"+ aList);
		
		aList.add("2021-07-21");//날짜
		System.out.println("aList>>> :"+ aList);
		
		//for문을 이용해서 출력하기
		for(int i = 0; i< aList.size();i++) {
			System.out.println("aList "+i+" >>>>"+ aList.get(i));
		}//for문 종료
		
		//숫자로 제너릭 하기
		//단 제너릭은 객체만 가능하기 때문에 기초자료형인 int는 불가능함
		//ArrayList<int> al0 = new ArrayListM<int>();
		ArrayList<Integer> al0 = new ArrayList<Integer>();
		
		al0.add(1);
		al0.add(new Integer(100));
		//al0.add(new Byte(11)); <-11을 Byte로 캐스팅 할 수 없음
		System.out.println("al0>>>>> "+ al0);
		System.out.println("al0.size >>>> " + al0.size());
		
		//for문을 이용해서 출력하기
		for(int i = 0; i< al0.size();i++) {
			System.out.println("al0 "+i+" >>>>"+ al0.get(i));
				}//for문 종료
		
		//사용자 정의 클래스 제너릭
		ArrayList<TestVO> al1 = new ArrayList<TestVO>();
		al1.add(new TestVO("00_1","aa_1","aa00_1","010_1","주소_1"));
		al1.add(new TestVO("00_2","aa_2","aa00_2","010_2","주소_2"));
		al1.add(new TestVO("00_3","aa_3","aa00_3","010_3","주소_3"));
		al1.add(new TestVO("00_4","aa_4","aa00_4","010_4","주소_4"));
		System.out.println("al1>>>>> "+ al1);
		System.out.println("al1.size >>>> " + al1.size());
		
		//for문을 이용해서 출력하기
		for(int i = 0; i< al1.size();i++) {
			TestVO tvo = al1.get(i);
			System.out.print(" " + tvo.getMnum());
			System.out.print(" " + tvo.getMid());
			System.out.print(" " + tvo.getMpw());
			System.out.print(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMjuso());
				}//for문 종료
	}//end of main method

}//end of Ex_ArrayList_2 class
