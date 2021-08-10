package a.b.c.ch8;

//Thread�� ������
//��ĭ		String name		Runnable target
//��ĭ : �׳� �÷�����
//String name: ���ο� Thread�� �̸��� ��
//Runnable target : �� Thread�� ���۵Ǹ� �۵��� �޼ҵ带 �������
public class Ex_Thread_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("Runnable �������̽��� �������̵� �� run�Լ�");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread�� ����ϱ� ���� new�� �ν��Ͻ���
		Ex_Thread_1 ex1 = new Ex_Thread_1();

		//�����1 : �̸� new�� ex1�� ���������� ����
		//�������� ex1�� �ƱԸ�Ʈ�� ��������
		Thread t = new Thread(ex1);
		t.start();
		System.out.println("t>>> " + t);
		System.out.println("t.getId()>>> "+t.getId());
		System.out.println("t.getName()>>> "+t.getName());
		System.out.println("t.getPriority()>>> "+t.getPriority());
		
		//�����2 : ������������ new�� �ϸ鼭 ��
		//new�� �ν��Ͻ� �� �� Runnable target�� ����
		//Runnable target -> ��ü��
		//Ex_Thread_1�� ��ü�� ����� ���� new Ex_Thread_1�� ��
		Thread t1 = new Thread(new Ex_Thread_1());
		t1.start();
		System.out.println("t1 >>> " + t1);
		System.out.println("t1.getId()>>> "+t1.getId());
		System.out.println("t1.getName()>>> "+t1.getName());
		System.out.println("t1.getPriority()>>> "+t1.getPriority());
	}

}

/*
 * �������̵� ���ϸ� �� �� ����
 package a.b.c.ch8;

public class Ex_Thread_11 {

	public static void main (String[] args) {
		Ex_Thread_11 ex11 = new Ex_Thread_11()
			
		//�������� ����
		
		//Thread t = new Thread(ex11);
		//t.start();
	}
}
 */
