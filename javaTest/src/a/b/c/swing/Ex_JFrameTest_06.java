package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex_JFrameTest_06 extends JFrame{


		//JFrame ������
		public Ex_JFrameTest_06(String title) {
		//����ؼ� �����
		super(title);

		//setLayout : ���̾ƿ� �Ŵ����� ����
		System.out.println("getLayOut >>>> " + getLayout());
		
		//JPanel�� �ν��Ͻ���
		//�÷ο�Ŵ��� ���ٰ� null�� �����
		JPanel jp = new JPanel();
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		jp.setLayout(null);
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		
		
		//��ư ������ �Ʒ��� ���� �����ڷ� ������ ��
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");


		//add() : void + java.awt.Container 
		//add() �� ������Ʈ�� JPanel�� ������Ʈ�� ����
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		
		//jb1.setBound(x,y,width, height)
		//setBounds = setLocation + setSize 
		jb1.setBounds( 20,  5,  95, 30);
		jb2.setBounds( 55, 45, 105, 70);
		jb3.setBounds(180, 15, 105, 90);
		
		//setBounds = setLocation + setSize ���� ��ģ ��
		//jb4.setLocation(x��, y��);
		//jb4.setSize(�ʺ�, ����);
		jb4.setLocation(300, 200);
		jb4.setSize(100, 50);
		
		//JPanel�� JFrame�� ����
		add(jp);
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_6.main ����>>> ");
			
			new Ex_JFrameTest_06("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("Ex_JFrameTest_6.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
