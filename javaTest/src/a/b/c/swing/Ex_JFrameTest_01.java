package a.b.c.swing;

import javax.swing.JFrame;

public class Ex_JFrameTest_01 extends JFrame{

		
		//JFrame ������
		public Ex_JFrameTest_01(String title) {
		//����ؼ� �����
		super(title);
		
		//GUI ���ø����̼ǿ��� ȭ���� �׸��� ������ ���� ���� �Ͼ����
		//�����ڿ��� ȭ�� �׸��⸦ ������
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("JFrameTest.main ����>>> ");
			
			new Ex_JFrameTest_01("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("JFrameTest.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
