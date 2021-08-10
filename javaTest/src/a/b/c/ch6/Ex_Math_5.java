package a.b.c.ch6;

//대소비교

public class Ex_Math_5 {

	//return형 static함수 선언
	//static 함수 = 클래스이름.함수명 으로 사용
	//max() 는 사용자 정의 함수
	//매개변수는 int a, int b, int c
	//return형이 필요하기 때문에 return 만듬
	// a와 b 비교 => b가 클 경우 
	public static int max(int a, int b, int c) {
		//기초자료형 + 지역변수 max 선언
		int max = a;
		
		//왜 if else가 아닐까? 
		//조건문이 true일때 : b로 max 값이 초기화됨
		//조건문이 false일때 : 다음 if로 넘어감
		if(b>=max) {
			max = b;
		}
		if (c>=max) {
			max = c;
		}
		return max;
	}
	
	public static int min(int a, int b, int c) {
		int min = a;
		
		if(b<=min) {
			min = b;
		}
		if(c<=min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//return값을 함수안에 넣어줌
		//매개변수에 아규먼트를 넣어줌
		//아규먼트랑 매개변수는 알겠는데 언제 쓰는지 모르겠다
		int max = Ex_Math_5.max(11, 2, 3);
		System.out.println("max>>> : "+max);
		
		int min = Ex_Math_5.min(11, 2, 3);
		System.out.println("min>>> : "+min);
	}

}
