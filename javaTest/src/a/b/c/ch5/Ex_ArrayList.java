package a.b.c.ch5;

import java.util.ArrayList;

public class Ex_ArrayList {
//class ArrayList 1.4 버전
//https://javaalmanac.io/jdk/1.4/api/index.html
//class ArrayList <E> : 제너릭있음 1.5버전
//https://javaalmanac.io/jdk/5/api/index.html


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList는 마음씨 좋은 키다리 아저씨이다.	
		// -> 데이터 타입이 달라도 괜찮고 / 갯수가 모자르거나 넘쳐도 허용
		//순차가 존재 = index가 있음
		
		//Array배열은 깍쟁이 아가씨이다.
		//-> 데이터 타입 동일 / 갯수가 모자라면 에러
		//순차가 존재 - index가 있음
		//데이터양이 작고, 빠르게 처리 할 때 사용함
		//배열은 지역변수로 선언하는거 아님 - 참조변수로 선언하는것임
		
		ArrayList aList = new ArrayList();
		System.out.println("aList >>>> " + aList);
		//.size : 구성요소의 수를 구함
		//기본적인 구성요소는 총 10개
		System.out.println("aList.size() >>>> " + aList.size());
		
		//기초자료형 숫자 가능
		aList.add(1);
		System.out.println("aList >>>> " + aList);
		
		//객체인 숫자 가능
		aList.add(new Integer("100"));
		System.out.println("aList >>>> " + aList);
		
		//기초자료형 문자가능
		aList.add("동민");
		System.out.println("aList >>>> " + aList);
		
		//객체인 문자열 가능
		aList.add(new String("배동민"));
		System.out.println("aList >>>> " + aList);
		
		//기초자료형 문자 가능
		aList.add('a');
		System.out.println("aList >>>> " + aList);
		
		//boolean 가능
		aList.add(false);
		System.out.println("aList >>>> " + aList);
		
		//ArrayList 자기 자신도 가능
		//배열에서는 this Collection으로 나옴
		//구성요소로서는 배열 전체가 나옴
		//ex) [1, 100, 동민, 배동민, a, false, (this Collection), a.b.c.TestVO@15db9742]
	
		aList.add(aList);
		System.out.println("aList >>>> " + aList);
		
		//다른 패키지에 있는 것도 가능
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>>> " + aList);
		
		//10개가 넘어도 ArrayList는 ArrayList.add를 만들어 증가 시킨다
		System.out.println("aList.size() >>>> " + aList.size());
		
		//구성요소 뽑기
		//length 대신에 size를 사용함
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(">>>> "+ aList.get(i));
		}//end of for문
	}//end of main method

}//end of Ex_ArrayList
