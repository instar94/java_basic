package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Exception_5.main() ���� >>>>");
		System.out.println("�ܼ� �����͸� �Է����ּ��� >>>");
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			System.out.println("x �Է°��� >>>>" + x);
			
			int y = sc.nextInt();
			System.out.println("y �Է°��� >>>>" + y);
			
			int z = x / y;
			System.out.println(x+"/"+"y"+"���� ��� >>>> " + z);
		
			}catch (Exception e){
				System.out.println("e.getMessage ()>> "+e.getMessage ());
			}finally {
				System.out.println("finally ��");
			}//end of try-catch-finally ��
		
		
		
		System.out.println("try-catch-final �� ����"
				+ "Ex_Exception_5.main() �� >>>>");
	}//end of main method
}//end of Ex_Exception_5 class
