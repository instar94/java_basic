package a.b.c.ch7;

import java.util.Scanner;

//재귀 : recursive
//팩토리얼 : factorial

public class Ex_File_4 {

	public static int factorial(int n) {
		if (n>0) {
			System.out.println(n-1);
			//자기자신을 호출해옴
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 ");
		int i = sc.nextInt();
		
		System.out.println(i+"의 팩토리얼은" + Ex_File_4.factorial(i));
		
	}

}
