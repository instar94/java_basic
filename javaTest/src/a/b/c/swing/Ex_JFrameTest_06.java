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


		//JFrame 생성자
		public Ex_JFrameTest_06(String title) {
		//상속해서 사용함
		super(title);

		//setLayout : 레이아웃 매니저를 세팅
		System.out.println("getLayOut >>>> " + getLayout());
		
		//JPanel을 인스턴스함
		//플로우매니저 였다가 null로 변경됨
		JPanel jp = new JPanel();
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		jp.setLayout(null);
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		
		
		//버튼 생성시 아래와 같이 생성자로 만들어야 함
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");


		//add() : void + java.awt.Container 
		//add() 는 컴포넌트를 JPanel에 컴포넌트를 붙임
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		
		//jb1.setBound(x,y,width, height)
		//setBounds = setLocation + setSize 
		jb1.setBounds( 20,  5,  95, 30);
		jb2.setBounds( 55, 45, 105, 70);
		jb3.setBounds(180, 15, 105, 90);
		
		//setBounds = setLocation + setSize 둘을 합친 것
		//jb4.setLocation(x축, y축);
		//jb4.setSize(너비, 높이);
		jb4.setLocation(300, 200);
		jb4.setSize(100, 50);
		
		//JPanel을 JFrame에 붙임
		add(jp);
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_6.main 시작>>> ");
			
			new Ex_JFrameTest_06("JFrame 상속해서 사용하기");
			
			System.out.println("Ex_JFrameTest_6.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
