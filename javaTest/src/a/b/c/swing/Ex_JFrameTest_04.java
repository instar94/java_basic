package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex_JFrameTest_04 extends JFrame{

	//JFrame의 디폴트 : 보더레이아웃 매니저
	//JPaneldml 디폴트 : 플로우 레이아웃 매니저

		//JFrame 생성자
		public Ex_JFrameTest_04(String title) {
		//상속해서 사용함
		super(title);

		//getLayout() LayoutManager - Container
		//JFrame의 default값 보더레이아웃
		//java.awt.BorderLayout[hgap=0,vgap=0]
		System.out.println("getLayOut >>>> " + getLayout());

		//JPanel 디폴트값 : flow 레이아웃
		//중앙에서 하나씩 붙여감
		JPanel jp = new JPanel();
		System.out.println("jp.getLayOut >>>> " + jp.getLayout());
		jp.setBackground(Color.DARK_GRAY);

		//버튼 생성시 아래와 같이 생성자로 만들어야 함
		JButton jp1 = new JButton("Button1");
		JButton jp2 = new JButton("Button2");
		JButton jp3 = new JButton("Button3");
		JButton jp4 = new JButton("Button4");
		JButton jp5 = new JButton("Button5");

		//add() : void + java.awt.Container 
		//add() 는 컴포넌트를 JPanel에 컴포넌트를 붙임
		jp.add(jp1);
		jp.add(jp2);
		jp.add(jp3);
		jp.add(jp4);
		jp.add(jp5);
		
		//JFrame에 JPanel을 붙임
		//JFrame의 디폴트 레이아웃 매니저인 BorderLayout의 CENTER 영역이 적용됨
		add(jp);
		
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main 시작>>> ");
			
			new Ex_JFrameTest_04("JFrame 상속해서 사용하기");
			
			System.out.println("Ex_JFrameTest_2.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
