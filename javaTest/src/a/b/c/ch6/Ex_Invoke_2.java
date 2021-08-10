package a.b.c.ch6;
/*
Exception : 예외클래스
try() catch() finally () 구문 : 예외 처리하기
throws : 예외처리 미루기 -> 호출함수의 예외 던지기 -> main에서 throws를 사용 할 수 없다
throw 키워드 : 사용자 정의 예외

checked Exception : 컴파일시 오류 -> 반드시 예외처리 해야함 => 롤백이 필수는 아님
IOExcetption, ClassNotFoundExceptio 등등
Unchecked Exception : 실행시 오류 -> 명시적으로 하지 않아도됨 -=> 롤백 필수
ex) NullPointerException, ClasscaseException 등등

*/
public class Ex_Invoke_2 {

	public Ex_Invoke_2() {
		System.out.println("Ex_Invoke_1() 생성자 >>> : ");	
	}
	
	public int aM() {
		System.out.println("aM() 함수 시작 >>> : ");
		
		System.out.println("aM() 함수 ");
		// aM()함수 블럭에서 bM() 함수를 호출한다. invoke 한다. 
		int sum = bM();
		System.out.println("aM() sum >>> : " + sum);
		System.out.println("aM() 함수 끝 >>> : ");
		
		return sum;
	}

	public int bM() {
		System.out.println("bM() 함수 시작 >>> : ");
		
		System.out.println("bM() 함수 ");
		// bM()함수 블럭에서 cM() 함수를 호출한다. invoke 한다. 
		int sum = cM();
		System.out.println("bM() sum >>> : " + sum);
		System.out.println("bM() 함수 끝 >>> : ");
		
		return sum;
	}

	public int cM() {
		System.out.println("cM() 함수 시작 >>> : ");
		
		System.out.println("cM() 함수 ");
		// cM()함수 블럭에서 dM() 함수를 호출한다. invoke 한다. 
		int sum = dM();
		System.out.println("cM() sum >>> : " + sum);
		System.out.println("cM() 함수 끝 >>> : ");
		
		return sum;
	}

	//예외 처리 : 오류가 나도 그냥 진행되도록 함
	public int dM() {
		System.out.println("dM() 함수 시작 >>> : ");
		
		System.out.println("dM() 함수 ");
		int sum = 0;
		
		try {
		sum = 1 / 0;
		
		System.out.println("dM() sum >>> : " + sum);
		}catch(ArithmeticException a) {
			System.out.println("에러가 >>> "+a);
			System.out.println("에러가 a.getMessage() >>> "+a.getMessage());
			a.printStackTrace();
		}
		
		System.out.println("dM() 함수 끝 >>> : ");
		
		return sum;
	}
	
	// main() 함수가 있으면 콘솔 어플리케이션이라고 부른다. 
	// 콘솔 어플리케이션에서 함수의 시작점은  main() 함수 이다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 :: main() 함수 시작 >>> : ");
		System.out.println("Ex_Invoke_1 :: main() 함수 첫 라인 부터 인터프리트 방식으로 수행 된다. >>> : ");
		
		// 사용자 정의 클래스 참조변수 사용하기
		Ex_Invoke_2 exi = new Ex_Invoke_2();
		System.out.println("exi 주소값 >>> : " + exi);
		
		// 메인함수 블럭에서 참조변수 exi 로 aM()를 호출한다. invoke 한다. 
		int sum = exi.aM();
		System.out.println("main sum >>> : " + sum);
	}
}

//main() -> aM() -> bM() -> cM() -> dM() 순서대로 함수가 진행
/*Ex_Invoke_1 :: main() 함수 시작 >>> : 
Ex_Invoke_1 :: main() 함수 첫 라인 부터 인터프리트 방식으로 수행 된다. >>> : 
Ex_Invoke_1() 생성자 >>> : 
exi 주소값 >>> : a.b.c.ch6.Ex_Invoke_2@15db9742
aM() 함수 시작 >>> : 
aM() 함수 
bM() 함수 시작 >>> : 
bM() 함수 
cM() 함수 시작 >>> : 
cM() 함수 
dM() 함수 시작 >>> : 
dM() 함수 

에러가 >>> java.lang.ArithmeticException: / by zero
에러가 a.getMessage() >>> / by zero
java.lang.ArithmeticException: / by zero
	at a.b.c.ch6.Ex_Invoke_2.dM(Ex_Invoke_2.java:53)
	at a.b.c.ch6.Ex_Invoke_2.cM(Ex_Invoke_2.java:38)
	at a.b.c.ch6.Ex_Invoke_2.bM(Ex_Invoke_2.java:26)
	at a.b.c.ch6.Ex_Invoke_2.aM(Ex_Invoke_2.java:14)
	at a.b.c.ch6.Ex_Invoke_2.main(Ex_Invoke_2.java:79)
dM() 함수 끝 >>> : 
cM() sum >>> : 0
cM() 함수 끝 >>> : 
bM() sum >>> : 0
bM() 함수 끝 >>> : 
aM() sum >>> : 0
aM() 함수 끝 >>> : 
main sum >>> : 0

프로그램 전체가 멈추는 것이 아니라 
->에러 메세지가 나오면 아래와 같이 변경됨 
*/