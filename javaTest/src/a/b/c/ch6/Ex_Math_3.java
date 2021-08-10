package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Math_3.main() 시작>>>>>");
		//answer 라는 지역변수를 선언
		//random에서 나온 수를 100곱하여 1~100사이 수를 내게 할 것임
		int answer = (int)(Math.random()*100)+1;
		System.out.println("answer >>> " + answer);
		
		//입력값과 카운트 값 선언 및 디폴트값 초기화
		int input = 0;
		int count = 0;
		
		//Scanner class를 통해서 값을 받아옴
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//do-while문 while문과 다르게 최소 1회 이상 진행됨
		do {
			//카운트는 매번 1씩 증가함
			count++;
			System.out.println("1~100사이 값을 입력하세요");
			
			//받아온 값을  int형으로 만들고 input에 초기화
			input = sc.nextInt();
			
			//정답일 경우 -> break를 통해 while문 종료
			if(answer == input) {
				System.out.println("정답 : "+ count+ "번만에 맞췄습니다.");
				break;
			}else if (answer < input) {
				System.out.println("다운");
			}else if (answer > input){
				System.out.println("업");
				}//end of if-else 구문
			}//end of do문
		while(true);
		System.out.println("Ex_Math_3.main() 끝>>>>>");
	}//end of main Method
}//end of Ex_Math_3 class
