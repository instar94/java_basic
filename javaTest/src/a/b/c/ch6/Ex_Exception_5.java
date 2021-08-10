package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Exception_5.main() 시작 >>>>");
		System.out.println("콘솔 데이터를 입력해주세요 >>>");
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			System.out.println("x 입력값은 >>>>" + x);
			
			int y = sc.nextInt();
			System.out.println("y 입력값은 >>>>" + y);
			
			int z = x / y;
			System.out.println(x+"/"+"y"+"연산 결과 >>>> " + z);
		
			}catch (Exception e){
				System.out.println("e.getMessage ()>> "+e.getMessage ());
			}finally {
				System.out.println("finally 블럭");
			}//end of try-catch-finally 문
		
		
		
		System.out.println("try-catch-final 블럭 이후"
				+ "Ex_Exception_5.main() 끝 >>>>");
	}//end of main method
}//end of Ex_Exception_5 class
