package a.b.c.ch8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ex_Thread_3 extends JFrame implements Runnable {

	//상수 선언
	//상수를 선언해서 get(상수)로 불러올 수 있게 함
	private static final long serialVersionUID = 1L;
	
	//시간대
	public static final int Time_Zone_0 = 0;
	public static final int Time_Zone_1 = 1;
	public static final int Time_Zone_2 = 2;
	public static final int Time_Zone_3 = 3;
	
	//도시
	public static final int Time_CITY_0 = 0;
	public static final int Time_CITY_1 = 1;
	public static final int Time_CITY_2 = 2;
	public static final int Time_CITY_3 = 3;
	
	//상수배열 선언
	//timezone에 각 시간대를 넣어줌
	public static final String timeZone[] = {"Asia/Seoul"
											,"America/New_York"
											,"Europe/Paris"
											,"Europe/London"};
	//timecity에대가 각 도시를 넣어줌
	public static final String timeCity[] = {"서울"
											,"뉴욕"
											,"파리"
											,"런던"};
	//프로그램의 경우 함부로 데이터를 못바꾸도록 은닉화함
	//멤버변수 은닉화 eucapsulation
	private Thread thread;
	private JLabel label;
	private String timeZoneID;
	
	//생성자
	//Ex_Thread는 String 형 변수 2개를 가짐
	public Ex_Thread_3(String timeZoneID, String timeCity){
		//상속받은 Runnable에서 timeCity를 받고 현재시간을 표시
		//받은 시간을 멤버변수로 정보 옮김
		super(timeCity + ":: 현재시간");
		this.timeZoneID = timeZoneID;
		
		//GUI 구현
		setLayout(new FlowLayout()); //중앙정렬
		label = new JLabel();
		label.setFont(new Font("Default",Font.PLAIN,20));
		
		//thread가 null값이 채로 있다면
		//Thread의 아규먼트로 해당 생성자를 넣어 초기화시키고
		//시작함 -> GUI 구현 + 상속받은 거에서 timeCity + ":: 현재시간" 함
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
		//Runnable에서 상속받은 것
		//getTimeZone을 통해서 시간대를 가져옴
		//Calendar를 겟인스턴스 하고
	 	//표시할 것들을 보여줌
		//추가로 1초정도  잠
	@Override
		public void run() {
			TimeZone tz = TimeZone.getTimeZone(this.timeZoneID);
			while(true) {
				Calendar cal = Calendar.getInstance(tz);
				
				String now = cal.get(Calendar.YEAR)+"년"+
							(cal.get(Calendar.MONTH)+1)+"월"+
							cal.get(Calendar.DATE)+"일"+
							cal.get(Calendar.HOUR)+"시" + 
				             cal.get(Calendar.MINUTE) + "분" + 
					         cal.get(Calendar.SECOND)+ "초";
				
				label.setText(":::" + now);
				//1초마다 시간 갱신함
				try {
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		//객체 오픈
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "도시시간을 선택 하시오 \n"
                +"00 : 서울 \n"
				   +"01 : 뉴욕 \n"
				   +"02 : 파리 \n"
				   +"03 : 런던 \n");
		
		String zoneID = sc.next();
		
		if("00".equals(zoneID)) {
			System.out.println("서울 시간 >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_0]
												,Ex_Thread_3.timeCity[0]);
		}
		
		if("01".equals(zoneID)) {
			System.out.println("뉴욕 시간 >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_1]
												,Ex_Thread_3.timeCity[1]);
		}
		
		if("02".equals(zoneID)) {
			System.out.println("파리 시간 >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_2]
												,Ex_Thread_3.timeCity[2]);
		}
		
		if("03".equals(zoneID)) {
			System.out.println("런던 시간 >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_3]
												,Ex_Thread_3.timeCity[3]);
		}
		//객체닫음
		sc.close();	
	}
}
