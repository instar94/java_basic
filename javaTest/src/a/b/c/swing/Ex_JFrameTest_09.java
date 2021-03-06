package a.b.c.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//상속받아서 하기
public class Ex_JFrameTest_09 extends JFrame implements ActionListener{

		//이벤트 구동 프로그래밍(Event driven programming)
		//event, event source, event listener
	
		//이벤트처리과정
		//1. 이벤트 발생 컴포넌트 생성
	
		//2. 이벤트 리스너 클래스 등록
//		외부 클래스
//		내부 클래스
//		현재 객체 : 상속하는 경우
//		무명 클래스 : 익명 클래스 : Anonymous class
		
//		//3. 이벤트 리스너를 이벤트 소스에 등록
//		외부 클래스 : addXxxListener(new 외부클래스())
//		내부 클래스 : addXxxListener(new 내부클래스())
//		현재 객체 : 상속하는 경우 : addXxxListener(this)
//		무명 클래스 : 익명 클래스 : Anonymous class :  : addXxxListener(new 이벤트리스너클래스(){
//												............
//											})
	
		//버튼을 private로 선언
		private JButton jbt;
		
		//생성자
		public Ex_JFrameTest_09() {
		
		//this => JFrame과 Ex_JFrameTest_7()
		//Ex_JFrameTest_7()의 setTitle을 불러오고
		//FlowLayout으로 세팅함
		this.setTitle("이벤트 해보기");
		this.setLayout(new FlowLayout());
		
		//1.이벤트 발생 컴포넌트 생성
		//jbt를 버튼을 누르라는 텍스트가 있는 컴포넌트로 만듬
		//jbt를 누르면 이벤트가 발생되는 것임
		//이벤트에 대한 내용은 외부클래스인 MyListener에
		jbt = new JButton("버튼을 누르세요 >>");
		
		//3. 이벤트 리스너를 이벤트 소스에 등록
		//2에서 만든  MyListner를 jbt와 연결함
		//addActionListener를 이용해 둘을 연결 시킴
		//현재 같은 객체내에서 만들어지기 때문에 this 사용 가능
		jbt.addActionListener(this);
		
		//JFrame에 버튼을 등록하고, 모양을 세팅해줌
		this.add(jbt);
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}

		//2. 이벤트 리스너 클래스 등록 -> 외부 클래스 이용
		//jbt를 누르면 발생할 이벤트임
		//ActionListner라는 인터페이스를 상속함
		//안에 있는 actionPerformed라는 함수를 오버라이딩해서 씀

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("e >>>> " + e);
			JButton jbt = (JButton)e.getSource();
			jbt.setText("마침내 버튼을 눌렀습니다. >>> : ");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_9.main 시작>>> ");
			
			//세팅된 버튼을 메인에서 구동 시킴
			new Ex_JFrameTest_09();
			
			System.out.println("Ex_JFrameTest_9.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class

