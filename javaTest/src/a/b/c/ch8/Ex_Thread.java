package a.b.c.ch8;

//Thread�� �����
public class Ex_Thread extends Thread{
	
	//�������̵� �Ͽ�
	//���ʺ��� ��ħ
	@Override
	public void run() {
		System.out.println("run() �Լ�");
		System.out.println("Thread Ŭ������ start()�� �����ϸ�");
		System.out.println("�ٷ� run ȣ��");
		System.out.println("Thread�� �ִ� start(),  nun�Լ��� ��ũ�� �ɷ�����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread().start();
		
		Ex_Thread ex = new Ex_Thread();
		Thread t = new Thread(ex);
		t.start();
	}

}
