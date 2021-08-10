package a.b.c.ch8;

//Thread의 생성자
//빈칸		String name		Runnable target
//빈칸 : 그냥 올려버림
//String name: 새로운 Thread의 이름을 씀
//Runnable target : 이 Thread가 시작되면 작동될 메소드를 적어놓음
public class Ex_Thread_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Runnable 인터페이스가 오버라이딩 된 run함수");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread를 사용하기 위해 new로 인스턴스함
		Ex_Thread_1 ex1 = new Ex_Thread_1();

		//사용방법1 : 미리 new로 ex1의 참조변수를 선언
		//참조변수 ex1을 아규먼트로 참조선언
		Thread t = new Thread(ex1);
		t.start();
		System.out.println("t>>> " + t);
		System.out.println("t.getId()>>> "+t.getId());
		System.out.println("t.getName()>>> "+t.getName());
		System.out.println("t.getPriority()>>> "+t.getPriority());
		
		//사용방법2 : 참조변수에서 new를 하면서 들어감
		//new로 인스턴스 할 때 Runnable target을 적음
		//Runnable target -> 객체임
		//Ex_Thread_1를 객체로 만들기 위해 new Ex_Thread_1로 씀
		Thread t1 = new Thread(new Ex_Thread_1());
		t1.start();
		System.out.println("t1 >>> " + t1);
		System.out.println("t1.getId()>>> "+t1.getId());
		System.out.println("t1.getName()>>> "+t1.getName());
		System.out.println("t1.getPriority()>>> "+t1.getPriority());
	}

}

/*
 * 오버라이딩 안하면 쓸 수 없음
 package a.b.c.ch8;

public class Ex_Thread_11 {

	public static void main (String[] args) {
		Ex_Thread_11 ex11 = new Ex_Thread_11()
			
		//성립되지 않음
		
		//Thread t = new Thread(ex11);
		//t.start();
	}
}
 */
