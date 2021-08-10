package a.b.c.ch5;

//Scanner 클래스 사용을 위해 import
import java.util.Scanner;

public class Ex_String_4_1 {

	//생성자
	//Ex_String_4_1의 함수를 사용하기 위해 생성자 만듬
	
	Ex_String_4_1(){
		
	}
	
	//함수
	//더하기 함수
	public int addM(int x, int y) {
		return x + y;
	}
	
	//빼기 함수
	public int subM(int x, int y) {
		return x - y;
	}
	
	//곱하기 함수
	public int mulM(int x, int y) {
		return x*y;
	}
	
	//나누기 함수
	public int divM(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Scanner 클래스를 사용하기 위해 인스턴스
		Scanner sc = new Scanner(System.in);
		
		//변수 선언 및 초기화
		char oper = '\u0000'; //null 값임
		int x = 0;
		int y = 0;
		
		
		System.out.println("사칙연산 프로그램 실행 >>>>");
		System.out.println("연산자를 입력해주세요 '+', '-','*','/'");
		System.out.println("시스템을 종료시키고 싶다면 Q 혹은 q를 눌러주세요");
		
		//계속해서 사용 할 수 있도록 while 문을 사용함
		while(true) {
			
			//oper를 통해 무슨 연산을 하려는지 받음
			//sc.next().charAt : System.in으로 받은 값의 첫 문자를 가져옴
			//sc.next() : System.in으로 받은 값
			//charAt(0) : 받은 값의 첫번째 문자를 가져옴
			//. 링크연산자
			oper = sc.next().charAt(0);
			
			//숫자 2개를 받아서 값을 초기화함
			//nextInt() : 값을 받아 정수형으로 줌
			if(0x2b == oper) {
				
				//첫번째 값을 받음
				System.out.println("첫번째 숫자를 입력해주세요");
				x = sc.nextInt();
				
				//두번째 값을 받음
				System.out.println("두번째 숫자를 입력해주세요");
				y = sc.nextInt();
				
				//함수를 이용하기 위해 참조변수 선언
				//매번 새로 해주는 것이 좋음 -> 만약 종료를 선택했다면 메모리를 낭비하는 꼴
				Ex_Math_1 exm = new Ex_Math_1();
				int addSum = exm.addM(x,y);
				System.out.println(x+"+"+y+"="+addSum);
			}//end of + if 문
			
			if (0x2D == oper) {
				
				System.out.println("첫번째 숫자를 입력해주세요");
				x = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int subSum = exm.subM(x,y);
				System.out.println(x+"+"+y+"="+subSum);
			}//end of - if 문
			
			if (0x2A == oper) {
				
				System.out.println("첫번째 숫자를 입력해주세요");
				x = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int mulSum = exm.mulM(x,y);
				System.out.println(x+"+"+y+"="+mulSum);
			}//end of * if 문
			
			if (0x2F == oper) {
				
				System.out.println("첫번째 숫자를 입력해주세요");
				x = sc.nextInt();
				System.out.println("두번째 숫자를 입력해주세요");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int divSum = exm.divM(x,y);
				System.out.println(x+"+"+y+"="+divSum);
			}//end of / if 문
			
			//0x71 = Q 0x51 = q
			//System.exit(int) : int에 따라 JVM을 종료시킴 
			if (0x71 == oper || 0x51 == oper){
				
				System.out.println("oper >>> : " + oper);
				System.out.println("시스템이 종료 됩니다.");
				System.exit(0);
				
			}//end of 종료 if 문 
			
		}
	}//end of main () method
}//end of Ex_String_4_1 class
