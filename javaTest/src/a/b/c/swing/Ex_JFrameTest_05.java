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


		//JFrame 생성자
		public Ex_JFrameTest_05(String title) {
		//상속해서 사용함
		super(title);

		//setLayout : 레이아웃 매니저를 세팅
		//BorderLayout -> GridLayout(3행 2열) 매니저로 변경
		System.out.println("getLayOut >>>> " + getLayout());
		setLayout(null);
		setLayout(new GridLayout(3,2)); //row * column (행*열)

		
		//JLabel : 라벨을 만듬
		//JTextField : 텍스트 상자를 만듬
		JLabel jb1 = new JLabel("라벨1");
		JTextField jt1 = new JTextField();
		
		JLabel jb2 = new JLabel("라벨2");
		JTextField jt2 = new JTextField();
		
		JLabel jb3 = new JLabel("라벨3");
		JTextField jt3 = new JTextField();
		
		//JLabel과 JTextField를 붙임
		add(jb1); //1행 1열
		add(jt1); //1행 2열
		add(jb2); //2행 1열
		add(jt2); //2행 2열
		add(jb3); //3행 1열
		add(jt3); //3행 2열
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_5.main 시작>>> ");
			
			new Ex_JFrameTest_05("JFrame 상속해서 사용하기");
			
			System.out.println("Ex_JFrameTest_5.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
