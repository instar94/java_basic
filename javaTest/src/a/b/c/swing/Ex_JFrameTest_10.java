package a.b.c.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex_JFrameTest_10 extends JFrame{

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
	
		//버튼과 라벨을 private로 선언
		private JButton jbt;
		private JLabel jlb;
		
		//생성자
		public Ex_JFrameTest_10() {
		
		//this => JFrame과 Ex_JFrameTest_7()
		//Ex_JFrameTest_7()의 setTitle을 불러오고
		this.setTitle("이벤트 해보기");
		
		//라벨과 버튼을 붙일 JPanel을 인스턴스
		JPanel jp = new JPanel();
		
		//1.이벤트 발생 컴포넌트 생성
		//jbt를 버튼을 누르라는 텍스트가 있는 컴포넌트로 만듬
		//jbt를 누르면 이벤트가 발생되는 것임
		//또한 JLabel의 내용도 변경됨
		//이벤트에 대한 내용은 내부클래스인 MyListener에
		jbt = new JButton("버튼을 누르세요 >>");
		jlb = new JLabel("아직 버튼을 누르지 않음");
		
		//3. 이벤트 리스너를 이벤트 소스에 등록
		//2에서 만든  MyListner를 jbt/jlb와 연결함
		//무명클래스를 이용함
		//addActionListener를 이용해 둘을 연결 시킴
		jbt.addActionListener(new ActionListener() {
			
			//2. 이벤트 리스너 클래스 등록 -> 내부 클래스 이용
			//jbt를 누르면 발생할 이벤트임
			//ActionListner라는 인터페이스를 상속함
			//안에 있는 actionPerformed라는 함수를 오버라이딩해서 씀
			//액션이벤트
			//사용자가 버튼을 누를때
			//사용자가 메뉴 항목을 선택할때
			//사용자가 텍스트 필드에서 엔터키를 누를때
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbt) {
				jlb.setText("마침내 버튼을 눌렀습니다. >>> : ");
				}
			}
		});
		
		jp.add(jbt);
		jp.add(jlb);
		
		//JFrame에 패널을 등록하고, 모양을 세팅해줌
		this.add(jp);
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}

			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_8.main 시작>>> ");
			
			//세팅된 버튼을 메인에서 구동 시킴
			new Ex_JFrameTest_10();
			
			System.out.println("Ex_JFrameTest_8.main 끝>>> ");
		
	}//end of main method

}//end of JFrameTest class

