package a.b.c.ch6;
// 함수의 호출


public class Ex_Invoke_1 {

	public Ex_Invoke_1() {
		System.out.println("Ex_Invoke 생성자 시작 >>>>");
	}
	public int aM() {
		System.out.println("aM()함수 시작>>>> ");
		System.out.println("aM() 함수");
		//aM함수 블럭에서 bM()함수를 호출
		int sum = bM();
		System.out.println("aM() 함수 끝 >>> ");
		return sum;
	}
	
	public int bM() {
		System.out.println("bM()함수 시작>>>> ");
		System.out.println("bM() 함수");
		//bM함수 블럭에서 cM()함수 호출
		int sum = cM();
		System.out.println("bM() 함수 끝 >>> ");
		return sum;
	}
	
	public int cM() {
		System.out.println("cM()함수 시작>>>> ");
		System.out.println("cM() 함수");
		//cM함수 블럭에서 dM함수 호출
		int sum = dM();
		System.out.println("cM() 함수 끝 >>> ");
		return sum;
	}
	
	public int dM() {
		System.out.println("dM()함수 시작>>>> ");
		System.out.println("dM() 함수");
		//int sum = 1/0;
		int sum = 1/0;
		System.out.println("dM() 함수 끝 >>> ");
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Ex_Invoke main ()함수 시작>>>> ");
			
			//사용자 정의 클래스 참조변수 사용
			Ex_Invoke_1 exi = new Ex_Invoke_1();
			System.out.println("exi >>>>> " + exi);
			int sum = exi.aM();
			//메인함수 블럭에서 참조변수 exi로 aM()을 호출함 = invoke함 dispatch함
						
			System.out.println("main sum >>>> " + sum);
			System.out.println("Ex_Invoke main() 함수 끝 >>> ");
		}
	}

//main() -> aM() -> bM() -> cM() -> dM()

/* 오류가 발생함
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at a.b.c.ch6.Ex_Invoke_1.dM(Ex_Invoke_1.java:47)
        at a.b.c.ch6.Ex_Invoke_1.cM(Ex_Invoke_1.java:37)
        at a.b.c.ch6.Ex_Invoke_1.bM(Ex_Invoke_1.java:25)
        at a.b.c.ch6.Ex_Invoke_1.aM(Ex_Invoke_1.java:14)
        at a.b.c.ch6.Ex_Invoke_1.main(Ex_Invoke_1.java:65)
        */
