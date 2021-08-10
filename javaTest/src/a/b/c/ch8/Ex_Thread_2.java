package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{
	
	public static void a() {
		System.out.println("a() 함수 시작 >>> 2초뒤 자동으로 어웨이크");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException i){
		}
	}//end of a method

	
	public void run() {
		System.out.println("run() 함수 시작 >>> 3초 동안 슬립 ");
		System.out.println("run() start()로 호출 >>> ");
		System.out.println("run() 블럭에 내가 하고자 하는걸 쓴다 >>> ");
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException i){
		}
		
		System.out.println("3초 동안 슬립모드");
		
		//깨어나는 함수 호출
		Ex_Thread_2.a();
		
		System.out.println("Ex_Thread_2.a()호출 >>>");
	}//end of run method

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread_2().start();
	}//end of main method
}//end of Ex_Thread_2 class 
