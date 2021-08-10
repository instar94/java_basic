package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//randomOP : 0.0~1.0사이
		System.out.println("Math.random() >>>> " + Math.random());
		System.out.println("Math.random()*100>>>"+Math.random()*100);
		//int로 형변환
		System.out.println("(int)Math.random()*100>>>"+(int)Math.random()*100+1);
		int answer = (int)(Math.random()*100)+1;
		
		System.out.println("answer >>> "+answer);
		
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			System.out.println("1~100 사이 숫자를 넣으세요");
			count++;
			input = sc.nextInt();
			
			if(answer == input) {
				System.out.println("정답");
				break;
			}else if(answer < input){
				System.out.println("다운 다운");
			}else if(answer > input){
				System.out.println("업");
			}
			if(count == 10) {
				System.out.println("게임 오버");
				break;
			}
		}
	}	
}

