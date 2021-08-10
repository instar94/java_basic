package a.b.c.ch6;
// 함수의 호출


public class Ex_Invoke {

	public Ex_Invoke() {
		System.out.println("Ex_Invoke 생성자 시작 >>>>");
	}
	public void aM() {
		System.out.println("aM()함수 시작>>>> ");
		System.out.println("aM() 함수");
		//aM함수 블럭에서 bM()함수를 호출
		bM();
		System.out.println("aM() 함수 끝 >>> ");
	
	}
	
	public void bM() {
		System.out.println("bM()함수 시작>>>> ");
		System.out.println("bM() 함수");
		//bM함수 블럭에서 cM()함수 호출
		cM();
		System.out.println("bM() 함수 끝 >>> ");
		
	}
	
	public void cM() {
		System.out.println("cM()함수 시작>>>> ");
		System.out.println("cM() 함수");
		//cM함수 블럭에서 dM함수 호출
		dM();
		System.out.println("cM() 함수 끝 >>> ");
		
	}
	
	public void dM() {
		System.out.println("dM()함수 시작>>>> ");
		System.out.println("dM() 함수");
		//aM(); <- 에러가 발생함
		System.out.println("dM() 함수 끝 >>> ");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Ex_Invoke main ()함수 시작>>>> ");
			
			//사용자 정의 클래스 참조변수 사용
			Ex_Invoke exi = new Ex_Invoke();
			System.out.println("exi >>>>> " + exi);
			exi.aM();
			//메인함수 블럭에서 참조변수 exi로 aM()을 호출함 = invoke함 dispatch함
						
			System.out.println("Ex_Invoke main() 함수 끝 >>> ");
		}
	}


