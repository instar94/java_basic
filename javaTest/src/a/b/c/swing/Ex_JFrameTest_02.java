package a.b.c.swing;

import javax.swing.JFrame;

public class Ex_JFrameTest_02 extends JFrame{

		
		//JFrame ������
		public Ex_JFrameTest_02(String title) {
		//����ؼ� �����
		super(title);
		
		//GUI ���ø����̼ǿ��� ȭ���� �׸��� ������ ���� ���� �Ͼ����
		//�����ڿ��� ȭ�� �׸��⸦ ������
		//ȭ���� �����ϰ�, �ҽ��� ��� �Լ� �Ǵ� Ŭ������ �и���
		display();
		
		}
		
		//���÷��̸� ���� �и��س��� �Լ�
		public void display(){
			
		//ȭ���� ������ ��� Ŭ���� Ȥ�� �Լ��� �и��ؼ� �����
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main ����>>> ");
			
			new Ex_JFrameTest_02("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("Ex_JFrameTest_2.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
