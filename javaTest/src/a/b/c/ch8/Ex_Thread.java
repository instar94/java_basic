package a.b.c.ch8;

//Thread를 상속함
public class Ex_Thread extends Thread{
	
	//오버라이드 하여
	//러너블을 고침
	@Override
	public void run() {
		System.out.println("run() 함수");
		System.out.println("Thread 클래스의 start()를 시작하면");
		System.out.println("바로 run 호출");
		System.out.println("Thread에 있는 start(),  nun함수는 링크가 걸려있음");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread().start();
		
		Ex_Thread ex = new Ex_Thread();
		Thread t = new Thread(ex);
		t.start();
	}

}
