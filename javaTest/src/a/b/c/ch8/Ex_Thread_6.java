package a.b.c.ch8;

//������ ���¿��� ���� ������ �Ҷ�
//Syncronized�� �̿����� ������ Thread1�� Thread2���� ���� �Ͼ ���ε���
//���� ���¿��� ���� ��������
public class Ex_Thread_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new�� �̿��� Thread�� ��ӹ��� Runnable�� ������ Thread�� ����
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
			System.out.println("�ܾ� >>>> " +ac.balance);
		}
	}
}	
