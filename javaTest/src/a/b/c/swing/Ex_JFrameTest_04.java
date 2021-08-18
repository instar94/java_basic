package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex_JFrameTest_04 extends JFrame{

	//JFrame�� ����Ʈ : �������̾ƿ� �Ŵ���
	//JPaneldml ����Ʈ : �÷ο� ���̾ƿ� �Ŵ���

		//JFrame ������
		public Ex_JFrameTest_04(String title) {
		//����ؼ� �����
		super(title);

		//getLayout() LayoutManager - Container
		//JFrame�� default�� �������̾ƿ�
		//java.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println("getLayOut >>>> " + getLayout());

		//JPanel ����Ʈ�� : flow ���̾ƿ�
		//�߾ӿ��� �ϳ��� �ٿ���
		JPanel jp = new JPanel();
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		jp.setBackground(Color.DARK_GRAY);

		//��ư ������ �Ʒ��� ���� �����ڷ� ������ ��
		JButton jp1 = new JButton("Button1");
		JButton jp2 = new JButton("Button2");
		JButton jp3 = new JButton("Button3");
		JButton jp4 = new JButton("Button4");
		JButton jp5 = new JButton("Button5");

		//add() : void + java.awt.Container 
		//add() �� ������Ʈ�� JPanel�� ������Ʈ�� ����
		jp.add(jp1);
		jp.add(jp2);
		jp.add(jp3);
		jp.add(jp4);
		jp.add(jp5);
		
		//JFrame�� JPanel�� ����
		//JFrame�� ����Ʈ ���̾ƿ� �Ŵ����� BorderLayout�� CENTER ������ �����
		add(jp);
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main ����>>> ");
			
			new Ex_JFrameTest_04("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("Ex_JFrameTest_2.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
