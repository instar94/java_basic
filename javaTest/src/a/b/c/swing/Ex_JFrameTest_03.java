package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_JFrameTest_03 extends JFrame{


		//JFrame ������
		public Ex_JFrameTest_03(String title) {
		//����ؼ� �����
		super(title);

		//getLayout() LayoutManager - Container
		//JFrame�� default�� �������̾ƿ�
		//java.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println("getLayOut >>>> " + getLayout());

		//��ư ������ �Ʒ��� ���� �����ڷ� ������ ��
		JButton jb1 = new JButton("Center :: CENTER");
		JButton jb2 = new JButton("Line Start :: WEST");
		JButton jb3 = new JButton("Line End :: EAST");
		JButton jb4 = new JButton("Page Start :: NORTH");
		JButton jb5 = new JButton("Page End :: SOUTH");

		//add() : void + java.awt.Container 
		//add() �� ������Ʈ�� JFrame�� ���̴� ����
		//default ������ Center�� ����
		//Center�� �̴� �͵��� ���� �������� ������
		add(jb1, BorderLayout.CENTER); //�߾�
		add(jb2, BorderLayout.LINE_START); // ����
		add(jb3, BorderLayout.LINE_END); //����
		add(jb4, BorderLayout.PAGE_START); //���
		add(jb5, BorderLayout.PAGE_END);//�ϴ�
		
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main ����>>> ");
			
			new Ex_JFrameTest_03("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("Ex_JFrameTest_2.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
