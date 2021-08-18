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

public class Ex_JFrameTest_05 extends JFrame{


		//JFrame ������
		public Ex_JFrameTest_05(String title) {
		//����ؼ� �����
		super(title);

		//setLayout : ���̾ƿ� �Ŵ����� ����
		//BorderLayout -> GridLayout(3�� 2��) �Ŵ����� ����
		System.out.println("getLayOut >>>> " + getLayout());
		setLayout(null);
		setLayout(new GridLayout(3,2)); //row * column (��*��)

		
		//JLabel : ���� ����
		//JTextField : �ؽ�Ʈ ���ڸ� ����
		JLabel jb1 = new JLabel("��1");
		JTextField jt1 = new JTextField();
		
		JLabel jb2 = new JLabel("��2");
		JTextField jt2 = new JTextField();
		
		JLabel jb3 = new JLabel("��3");
		JTextField jt3 = new JTextField();
		
		//JLabel�� JTextField�� ����
		add(jb1); //1�� 1��
		add(jt1); //1�� 2��
		add(jb2); //2�� 1��
		add(jt2); //2�� 2��
		add(jb3); //3�� 1��
		add(jt3); //3�� 2��
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_5.main ����>>> ");
			
			new Ex_JFrameTest_05("JFrame ����ؼ� ����ϱ�");
			
			System.out.println("Ex_JFrameTest_5.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class
