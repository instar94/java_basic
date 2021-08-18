package a.b.c.swing.member.scr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingMember extends JFrame{

	private static final long serialVersionUID = -8064735690097915129L;

	//멤버변수 선언
	private JLabel		la1, la2, la3, la4, la5, la6, la7;
	private JTextField	tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton		bt1, bt2, bt3, bt4;
	private JPanel		pa1, pa2;
	
	//GUI 사용을 위한 생성자 선언
	public SwingMember() {
		
		//this -> JFram 및 SwingMember 불러옴
		//프로그램 이름 - SwingMember
		//레이아웃 매니저 :보더레이아웃
		this.setTitle("SwingMember");
		this.setLayout(new BorderLayout());
		
		//JPanel 사용을 위한 인스턴스
		//pa1 : 입력창
		//pa2 : 기능 선택창
		pa1 = new JPanel();
		pa2 = new JPanel();
		
		//색상 설정
		pa1.setBackground(Color.cyan);
		pa2.setBackground(Color.blue);
		
		//패널 레이아웃
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);
		
		//패널1 -> 정보 입력창
		//라벨 7개 + 텍스트 필드 7개 -> 7행 2열 그리드
		pa1.setLayout(new GridLayout(7,2));
		la1 = new JLabel("고객번호", JLabel.CENTER);
		la2 = new JLabel("고객이름", JLabel.CENTER);
		la3 = new JLabel("아이디", JLabel.CENTER);
		la4 = new JLabel("패스워드", JLabel.CENTER);
		la5 = new JLabel("삭제여부", JLabel.CENTER);
		la6 = new JLabel("등록일자", JLabel.CENTER);
		la7 = new JLabel("수정일자", JLabel.CENTER);
		
		//텍스트필드를 인스턴스함
		//(10) : 10글자 제한
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);
		
		//패널에 텍스트필드와 라벨을 번갈아가며 붙임
		pa1.add(la1);
		pa1.add(tf1);
		pa1.add(la2);
		pa1.add(tf2);
		pa1.add(la3);
		pa1.add(tf3);
		pa1.add(la4);
		pa1.add(tf4);
		pa1.add(la5);
		pa1.add(tf5);
		pa1.add(la6);
		pa1.add(tf6);
		pa1.add(la7);
		pa1.add(tf7);
		
		//기능 선택창 버튼 만들기 -> 가운데를 중심으로 버튼 위치
		//flowlayout을 따라감
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//버튼별로 이름을 붙임
		bt1 = new JButton("조회");
		bt2 = new JButton("저장");
		bt3 = new JButton("수정");
		bt4 = new JButton("삭제");
		
		//각 버튼들을 패널에 붙임
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		
		//입력하지 못하도록 막아버림
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);
		
		//이벤트 전달
		//각 버튼별로 어떤 이벤트와 연결될지 만듬
		//어떤 버튼을 눌러도 EventHandler와 연결 시킴
		//EventHandler 에서 받아온 값에 따라 if문으로 분기할 것임
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		bt3.addActionListener(new EventHandler());
		bt4.addActionListener(new EventHandler());
		
		//창 프레임
		this.setSize(300, 250);
		this.setLocation(400, 200);
		this.setVisible(true);
		
		//JFrame을 닫는 명령어
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
	
	//내부 클래스를 이용하여 액션리스너를 만듬 
	class EventHandler implements ActionListener{
		
		//ActionListener의 유일한 자원인 
		//actionperformed 을 오버라이딩함
		
		public void actionperformed(ActionEvent e) {
		
			//버튼을 누르면 각각에 해당되는 String 값이
			//btncmd에 들어옴
			//그 값을 String으로 함
			String btnCmd = String.valueOf(e.getActionCommand());
			
			//회원번호를 받아서 정보를 조회함
			if("조회".equals(btnCmd)) {
				System.out.println("btnCmd >>>> " + btnCmd);
				
				//정보를 받을 swnum 선언 및 초기화
				String swnum = "";
				
				//swnum은 tf1 텍스트 필드에서 받아옴
				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("저장".equals(btnCmd)) {
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("수정".equals(btnCmd)) {
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("삭제".equals(btnCmd)) {
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
		}
	}
	
	public void jtexFileClear() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingMember();
	}

}
