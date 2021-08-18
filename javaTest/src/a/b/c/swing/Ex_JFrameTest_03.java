package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex_JFrameTest_03 extends JFrame{


		//JFrame 생성자
		public Ex_JFrameTest_03(String title) {
		//상속해서 사용함
		super(title);

		//getLayout() LayoutManager - Container
		//JFrame의 default값 보더레이아웃
		//java.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println("getLayOut >>>> " + getLayout());

		//버튼 생성시 아래와 같이 생성자로 만들어야 함
		JButton jb1 = new JButton("Center :: CENTER");
		JButton jb2 = new JButton("Line Start :: WEST");
		JButton jb3 = new JButton("Line End :: EAST");
		JButton jb4 = new JButton("Page Start :: NORTH");
		JButton jb5 = new JButton("Page End :: SOUTH");

		//add() : void + java.awt.Container 
		//add() 는 컴포넌트를 JFrame에 붙이는 역할
		//default 값으로 Center에 붙임
		//Center가 이닌 것들은 일정 범위만을 차지함
		add(jb1, BorderLayout.CENTER); //중앙
		add(jb2, BorderLayout.LINE_START); // 좌측
		add(jb3, BorderLayout.LINE_END); //우측
		add(jb4, BorderLayout.PAGE_START); //상단
		add(jb5, BorderLayout.PAGE_END);//하단
		
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main 시작>>> ");
			
			new Ex_JFrameTest_03("JFrame 상속해서 사용하기");
			
			System.out.println("Ex_JFrameTest_2.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
