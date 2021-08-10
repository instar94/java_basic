package a.b.c.ch7;

import java.util.Scanner;

public class Ex_IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("IO 숫자 테스트 >>> ");
		
		//Scanner로 input 받기 시작
		Scanner sc = new Scanner(System.in);
		
		//nextInt() : 받아온 것을 int형으로 바꿔놓음
		int data = sc.nextInt();
		System.out.println("data >>>> : " + data);
		//Integer.toBinaryString = 이진법으로 바꿈
		System.out.println("binary >>> :" + Integer.toBinaryString(data));
		
		
		System.out.println("IO 문자 테스트 >>> ");
		
		Scanner sc1 = new Scanner(System.in);
		
		String dataS = sc1.nextLine();
		System.out.println("문자 >>>> : " + dataS);
		
		//입력한 문자열의 문자를 하나하나씩 숫자/이진수로 만들어줌
		for (int i=0; i< dataS.length(); i++) {
			char c = dataS.charAt(i);
			System.out.println("binary >>> : "
								+ " :" + c
								+ " :" + (byte)c
								+ " :" + Integer.toBinaryString((byte)c));
		
		//in/out이 종료되면 무조건 닫아 주어야함
		sc.close();
		sc1.close();
		
		}
		
	}

}
