package a.b.c.ch8;

//��� 1~20���� ������� ������ ���� -> �̰��� �����ϱ� ���� 
//synchronized ��� Ű���带 �����
//Thread ��ӹ���
public class Ex_Thread_5 extends Thread {

	//�����������
	int seqNum;
	
	//������ ����
	public Ex_Thread_5(int seqNum) {
		//this�� �̿��� ���������� ������ 
		//seqNum���� ��������� �ű�
		this.seqNum = seqNum;
	}
	
	@Override
	public void run() {
		synchronized(this) {
		System.out.println(this.seqNum+"Thread Start >>>");
		//3�ʰ� ����
		try {
			Thread.sleep(3000);
		}catch(Exception e){}
		System.out.println(this.seqNum+"Thread end >>>");
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() ���� >> ");
		
		//tt2�� i�� �ƱԸ�Ʈ�� ��� �������� �� ������ ����
		//20�� �ݺ���
		//�׸��� start ��Ŵ
		
		for(int i =0; i < 20; i++) {
		Ex_Thread_4 tt2 = new Ex_Thread_4(i);
		
		tt2.start();
		}
		System.out.println("main() �� >> ");
	}

}
