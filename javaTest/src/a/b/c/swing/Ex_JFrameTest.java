package a.b.c.swing;

import javax.swing.JFrame;

public class Ex_JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JFrameTest.main ����>>> ");
		
		//JFrame ������ ����
		//()�ȿ� String Title�� �ۼ��ؼ� �̸����μ� �۵� ��ų �� ����
		JFrame jf = new JFrame("ù��° JFrame");
		System.out.println("jf �������� >>>"+jf);
		
		//Jf.setSize(����, ����); void, Window
		//J�������� ũ��
		jf.setSize(600, 400);	
		
		
		//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) - void, JFrame
		//J������ �ݱ� ���
		//jframe ���� ����� x ��ư���� �ݱ� ����
		//EXIT_ON_CLOSE : �ݱ� ���
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//jf.setVisible(true) - void = Window Ŭ����
		//true�̸� JFrame�� ������ -�޸𸮿� �ִ� ���·�
		//false�̸� JFrame�� ���� - �޸𸮿� �ִ� ���·�
		//������ �ʾƵ� ����Ǳ��� -> �۾������� �� ��������
		jf.setVisible(true);
		
		System.out.println("JFrameTest.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
