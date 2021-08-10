package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int = 4byte, 32bit
		//자바는 숫자에서 int만 존재함
		//int가 아닌 것은 모두 double로 인식함 -> 나머지는 형변환
		//그래서 int를 넘어가는 것들은 표시를 한다. ex) 1l,100f
		//byte char short int long float double : 기초자료형
		//기초자료형에 대응하는 Wrapper Class가 존재함
		//Wrapper 클래스에 상수로 존재함
		
		//숫자 100을 출력하는 방법
		
		//1. new Integer(100);
		//참조변수를 출력해도 주소값이 나오지 않음
		//주소값 대신 숫자가 나온다		

		//Integer 클래스에서 생성자 초기화시 <중요>
		
		//초기화 데이터 타입을 기초 자료형 일때
		//초기화 데이터 타입을 '문자숫자'로 할 때 <- 이럴때만 사용함
		//이유 : 형변환을 못하게 하기 위해서
		Integer i0 = new Integer(100);
		Integer i1 = new Integer("100");
		
		System.out.println("i0>>>>"+ i0);
		System.out.println("i1>>>>"+ i1);
		//주소값
		System.out.println("System.identityHashCode(i0)"+System.identityHashCode(i0));
		System.out.println("System.identityHashCode(i1)"+System.identityHashCode(i1));
		
		//intValue : Integer 를 int로 바꿈
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		
		System.out.println("i0Val>>>>"+ i0Val);
		System.out.println("i1Val>>>>"+ i1Val);
		
		//주소값
		System.out.println("System.identityHashCode(i0Val)"+System.identityHashCode(i0Val));
		System.out.println("System.identityHashCode(i1Val)"+System.identityHashCode(i1Val));
		
		//2. 문자형 숫자를 숫자로 바꿈 <중요>
		//문자형 숫자 : 숫자에 더블쿼테이션 ("")로 묶은 문자열
		//parseInt : 문자형 숫자를 숫자로 바꿈
		//Integer 형을 int 형 숫자로 변경하는 것 "12234" -> 숫자로 된 문자열"1", "12"
		int i2 = Integer.parseInt("100"); //문자숫자 ->  기초자료형 숫자 -> 객체숫자
		System.out.println("i2>>>>"+ i2);
		
		//3. new Integer() 를 생략함 - 기초자료 선언
		int i3 = 100;
		System.out.println("i3>>>>"+ i3);
		
		//Integer.valueOf : int형을 Integer형으로 변환
		//모든  Wrapper 클래스에 있음		
		//왜 필요한가 ? : 좌우 동치를 하기 위해서
				//기초자료형 = 참조자료형 이라면
				//기초자료형 = 기초자료형(참조자료형)으로 형변환 (상속)
				Integer i4 = Integer.valueOf(i3);
				System.out.println("i4>>>>>" + i4);
				
		//JDK 1.5 부터 이렇게 함(알고만 있을 것)
		//오토박싱(Autoboxing) : 기본형을 객체로 바꾸는것
		//언박싱(Unboxing) : 객체를 기본형으로 바꾸는 것
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; //언박싱
		// int sum = num1.intValue() + num2; 를 생략한 것임
		Integer num3 = num2; //오토박싱
		// Integer num3 = Integer.valueOf(num2); 를 생략한 것임
				
		}//end of main method

	
}//end of Ex_Integer class
