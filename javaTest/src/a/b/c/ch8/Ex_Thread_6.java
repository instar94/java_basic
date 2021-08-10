package a.b.c.ch8;

//각각의 계좌에서 돈을 빼려고 할때
//Syncronized를 이용하지 않으면 Thread1과 Thread2에서 각각 일어난 일인데도
//같은 계좌에서 돈이 나가버림
public class Ex_Thread_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new를 이용해 Thread를 상속받은 Runnable과 각각의 Thread를 받음
		Runnable r = new SyncTest();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
	
		t1.start();
		t2.start();
	}

}

class BankAccount{
	int balance = 1000;
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			balance -= money;
		}
	}
}

class SyncTest implements Runnable {
	BankAccount ac = new BankAccount();
	
	public void run() {
		while(ac.balance>0) {
			int money=(int)(Math.random()*3+1)*100;
			ac.withdraw(money);
			System.out.println("잔액 >>>> " +ac.balance);
		}
	}
}	
