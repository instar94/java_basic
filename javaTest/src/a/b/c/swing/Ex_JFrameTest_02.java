package a.b.c.swing;

import javax.swing.JFrame;

public class Ex_JFrameTest_02 extends JFrame{

		
		//JFrame 생성자
		public Ex_JFrameTest_02(String title) {
		//상속해서 사용함
		super(title);
		
		//GUI 어플리케이션에서 화면을 그리는 행위는 제일 먼저 일어나야함
		//생성자에서 화면 그리기를 시행함
		//화면이 복잡하고, 소스가 길면 함수 또는 클래스로 분리함
		display();
		
		}
		
		//디스플레이를 위해 분리해놓은 함수
		public void display(){
			
		//화면이 복잡할 경우 클래스 혹은 함수로 분리해서 사용함
		setSize(600, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_2.main 시작>>> ");
			
			new Ex_JFrameTest_02("JFrame 상속해서 사용하기");
			
			System.out.println("Ex_JFrameTest_2.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
