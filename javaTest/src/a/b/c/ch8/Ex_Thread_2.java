package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{
	
	public static void a() {
		System.out.println("a() �Լ� ���� >>> 2�ʵ� �ڵ����� �����ũ");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException i){
		}
	}//end of a method

	
	public void run() {
		System.out.println("run() �Լ� ���� >>> 3�� ���� ���� ");
		System.out.println("run() start()�� ȣ�� >>> ");
		System.out.println("run() ���� ���� �ϰ��� �ϴ°� ���� >>> ");
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException i){
		}
		
		System.out.println("3�� ���� �������");
		
		//����� �Լ� ȣ��
		Ex_Thread_2.a();
		
		System.out.println("Ex_Thread_2.a()ȣ�� >>>");
	}//end of run method

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread_2().start();
	}//end of main method
}//end of Ex_Thread_2 class 
