package a.b.c.ch5;

public class Ex_String_4 {

	//java.a.b.c.ch5.Ex_String_4 11 22
	//String[] args = {"11", "22"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		//�ְܼ� : 1122 
		//���ڿ��μ� �߱⶧����
		System.out.println("x+y ="+ x + y);
		
		//�ְܼ� : 3
		//( )�� ���� �����Ѿ���
		System.out.println("x+y= "+(x+y));
		System.out.println("x-y= "+(x-y));
		System.out.println("x*y= "+(x*y));
		System.out.println("x/y= "+(x/y));
	}//end of main method

}//end of Ex_String_4 class
