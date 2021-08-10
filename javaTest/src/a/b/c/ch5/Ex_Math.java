package a.b.c.ch5;
/*
 명령행 인수를 받아
 정수의 사칙연산
 콘솔 어플리케이션
 
 + addM
 - subM
 * mulM
 / divM
 로 아규먼트를 받아서 
 리턴값을 받아서 콘솔에 결과 출력하기
  */

/*
 어퍼핸드? 오프핸드? 
1. 함수를 만들 줄 알아야 한다 
	매개변수와 리턴형을 어떻게 만들어야 하는지 고민

2. 프로그램에 들어오는 in 파라미터
  정수형 파라미터

3. 함수만들 때 
 static / 일반함수
 
4. 명령형 인수 : String 배열 이란걸 알아야함
 */

//Ex_Math class 시작
public class Ex_Math {
	
	//생성자
	public Ex_Math() {
		
	}
	
	//함수 : 전부 일반함수 + return이 있는 함수 선언
	// 둘을 더한 뒤 sum에 대입하고
	//sum을 return함 

	
	//더하기 함수
	public int addM (int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	//빼기 함수
	public int subM(int x, int y) {
		int sum = x - y;
		return sum;
	}
	
	//곱하기 함수
	public int mulM(int x, int y) {
		int sum = x*y;
		return sum;
	}
	
	//나누기 함수
	public int divM(int x, int y) {
		int sum = x/y;
		return sum;
	}

	//메인함수 : 콘솔어플리케이션의 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지역변수 선언 후 디폴트 값으로 초기화
		int x = 0;
		int y = 0;
	
		if(2==args.length) {
			
		//변수 선언
		//명령형 인수 args[]에서 값을 받아 초기화함
		//args[]의 값은 문자열이고, 변수는 int형이므로 args[]값을 동치 시켜야함
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		//함수 사용을 위해 new 키워드를 통해 생성자 인스턴스
		Ex_Math em = new Ex_Math();
		
		//각각 함수에 아규먼트를 집어넣고 sum으로 받음
		int sum1 = em.addM(x, y);
		int sum2 = em.subM(x, y);
		int sum3 = em.mulM(x, y);
		int sum4 = em.divM(x, y);
		
		//함수의 값을 출력
		System.out.println("더하기 >>>>> : " + sum1);
		System.out.println("빼기 >>>>> : " + sum2);
		System.out.println("곱하기 >>>>> : " + sum3);
		System.out.println("나누기 >>>>> : " + sum4);
		
		}else{
			
		System.out.println("숫자를 확인해주세요");
		
		}
		
	}//end of main method

}//end of Ex_Math class
