package a.b.c.ch5;

public class Ex_String_2 extends java.lang.Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Class 문자열 비교하기
		//비교함수 : equals ();
		String s1 = "abc";
		String s2 = "abc";
		//new String()를 생략할 경우 상등연산자를 사용은 가능
		//그러나 new String()을 사용할 경우 상등연산자 사용 불가능
		//문자열비교에 상등연산자는 사용 안 하는게 좋음
		boolean b0 = s1.equals(s2);
		boolean b0_1 = s1==s1;
		System.out.println("b0>>>>>>"+b0);
		System.out.println("b0_1>>>>>"+b0_1);
		System.out.println("System.identyHashCode(s1)>>>> : " + System.identityHashCode(s1));
		System.out.println("System.identyHashCode(s2)>>>> : " + System.identityHashCode(s2));
		
		//s1이랑 s2가 동일한지 비교
		//s1.equals(s2);
		boolean b = s1.equals(s2);
		System.out.println(b);
		// b가 true 인지 확인하는 절차가 필요하다
		if(b) {
			System.out.println("s1.equals(s2) >>> :  "+b);
		}
		
		//문자끼리만 비교가 가능하다.
		String ss1 = "abcd";
		String ss2 = "abcde";
		// == : 상등연산자 = 자바에서는 기초자료형에서 사용 (숫자 비교)
		//자바에서 ==와 java.lang.Object.equals() 와 동일함
		//단 자바스크립트에서는 데이터 타입을 연산 할 때, 데이터 타입선언X
		//데이터 타입은 var하나만 있음 
		//문자열 == 문자열 / 문자 == 문자
		//But, 자바에서 문자열을 비교할때는 상등연산자 사용하면 안 됨
		boolean b1 = ss1.equals(ss2);
		System.out.println(b1);
		
		/*
		*equals 는 String 과 Object 클래스에 둘 다 있음
			java.lang.Object.equals(); : 객체의 주소 값을 비교
				'=='(상등연산자)와 동일함
				연산자 : == 임
			java.lang.String.equals(); : 문자열만 비교하는 함수
		
		equals 함수를 사용 할때는 비교하는 객체를 보고  jvm이 판단함
			- 내가 판단하는 것이 아님
			- JVM이 String으로 판단하면 String클래스에서 사용하고
			- 문자열이 아니라고 생각하면 주소값을 비교함
		*/
		
		//콘솔값 b2 >>>> true ->주소값은 다르지만 문자열로서는 동일함
		//b2_1 >>> false -> 문자열은 같지만 주소값이 다름
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println("s3>>>> : " + s3);
		System.out.println("s4>>>> : " + s4);
		System.out.println("System.identyHashCode(s3)>>>> : " + System.identityHashCode(s3));
		System.out.println("System.identyHashCode(s4)>>>> : " + System.identityHashCode(s4));
		
		boolean b2 = s3.equals(s4);
		boolean b2_1 = s3 ==s4;
		System.out.println("b2>>>>>" + b2);
		System.out.println("b2_1>>>>"+b2_1);
	}

}
