package a.b.c.ch8;

//결과 1~20까지 순서대로 나오지 않음 -> 이것을 보정하기 위해 
//synchronized 라는 키워드를 사용함
//Thread 상속받음
public class Ex_Thread_5 extends Thread {

	//멤버변수선언
	int seqNum;
	
	//생성자 선언
	public Ex_Thread_5(int seqNum) {
		//this를 이용해 지역변수로 선언한 
		//seqNum값을 멤버변수로 옮김
		this.seqNum = seqNum;
	}
	
	@Override
	public void run() {
		synchronized(this) {
		System.out.println(this.seqNum+"Thread Start >>>");
		//3초간 멈춤
		try {
			Thread.sleep(3000);
		}catch(Exception e){}
		System.out.println(this.seqNum+"Thread end >>>");
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 시작 >> ");
		
		//tt2에 i를 아규먼트로 삼는 참조변수 및 생성자 선언
		//20번 반복함
		//그리고 start 시킴
		
		for(int i =0; i < 20; i++) {
		Ex_Thread_4 tt2 = new Ex_Thread_4(i);
		
		tt2.start();
		}
		System.out.println("main() 끝 >> ");
	}

}
