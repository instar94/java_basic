package a.b.c.swing;

import javax.swing.JFrame;

public class Ex_JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JFrameTest.main 시작>>> ");
		
		//JFrame 생성자 만듬
		//()안에 String Title을 작성해서 이름으로서 작동 시킬 수 있음
		JFrame jf = new JFrame("첫번째 JFrame");
		System.out.println("jf 참조변수 >>>"+jf);
		
		//Jf.setSize(가로, 세로); void, Window
		//J프레임의 크기
		jf.setSize(600, 400);	
		
		
		//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) - void, JFrame
		//J프레임 닫기 기능
		//jframe 우측 상단의 x 버튼으로 닫기 가능
		//EXIT_ON_CLOSE : 닫기 상수
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//jf.setVisible(true) - void = Window 클래스
		//true이면 JFrame을 보여줌 -메모리에 있는 형태로
		//false이면 JFrame은 숨김 - 메모리에 있는 형태로
		//보이지 않아도 실행되긴함 -> 작업관리자 상에 남아있음
		jf.setVisible(true);
		
		System.out.println("JFrameTest.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class
