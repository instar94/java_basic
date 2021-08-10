package a.b.c.ch8;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ex_Thread_3 extends JFrame implements Runnable {

	//��� ����
	//����� �����ؼ� get(���)�� �ҷ��� �� �ְ� ��
	private static final long serialVersionUID = 1L;
	
	//�ð���
	public static final int Time_Zone_0 = 0;
	public static final int Time_Zone_1 = 1;
	public static final int Time_Zone_2 = 2;
	public static final int Time_Zone_3 = 3;
	
	//����
	public static final int Time_CITY_0 = 0;
	public static final int Time_CITY_1 = 1;
	public static final int Time_CITY_2 = 2;
	public static final int Time_CITY_3 = 3;
	
	//����迭 ����
	//timezone�� �� �ð��븦 �־���
	public static final String timeZone[] = {"Asia/Seoul"
											,"America/New_York"
											,"Europe/Paris"
											,"Europe/London"};
	//timecity���밡 �� ���ø� �־���
	public static final String timeCity[] = {"����"
											,"����"
											,"�ĸ�"
											,"����"};
	//���α׷��� ��� �Ժη� �����͸� ���ٲٵ��� ����ȭ��
	//������� ����ȭ eucapsulation
	private Thread thread;
	private JLabel label;
	private String timeZoneID;
	
	//������
	//Ex_Thread�� String �� ���� 2���� ����
	public Ex_Thread_3(String timeZoneID, String timeCity){
		//��ӹ��� Runnable���� timeCity�� �ް� ����ð��� ǥ��
		//���� �ð��� ��������� ���� �ű�
		super(timeCity + ":: ����ð�");
		this.timeZoneID = timeZoneID;
		
		//GUI ����
		setLayout(new FlowLayout()); //�߾�����
		label = new JLabel();
		label.setFont(new Font("Default",Font.PLAIN,20));
		
		//thread�� null���� ä�� �ִٸ�
		//Thread�� �ƱԸ�Ʈ�� �ش� �����ڸ� �־� �ʱ�ȭ��Ű��
		//������ -> GUI ���� + ��ӹ��� �ſ��� timeCity + ":: ����ð�" ��
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	
		//Runnable���� ��ӹ��� ��
		//getTimeZone�� ���ؼ� �ð��븦 ������
		//Calendar�� ���ν��Ͻ� �ϰ�
	 	//ǥ���� �͵��� ������
		//�߰��� 1������  ��
	@Override
		public void run() {
			TimeZone tz = TimeZone.getTimeZone(this.timeZoneID);
			while(true) {
				Calendar cal = Calendar.getInstance(tz);
				
				String now = cal.get(Calendar.YEAR)+"��"+
							(cal.get(Calendar.MONTH)+1)+"��"+
							cal.get(Calendar.DATE)+"��"+
							cal.get(Calendar.HOUR)+"��" + 
				             cal.get(Calendar.MINUTE) + "��" + 
					         cal.get(Calendar.SECOND)+ "��";
				
				label.setText(":::" + now);
				//1�ʸ��� �ð� ������
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
		//��ü ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "���ýð��� ���� �Ͻÿ� \n"
                +"00 : ���� \n"
				   +"01 : ���� \n"
				   +"02 : �ĸ� \n"
				   +"03 : ���� \n");
		
		String zoneID = sc.next();
		
		if("00".equals(zoneID)) {
			System.out.println("���� �ð� >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_0]
												,Ex_Thread_3.timeCity[0]);
		}
		
		if("01".equals(zoneID)) {
			System.out.println("���� �ð� >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_1]
												,Ex_Thread_3.timeCity[1]);
		}
		
		if("02".equals(zoneID)) {
			System.out.println("�ĸ� �ð� >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_2]
												,Ex_Thread_3.timeCity[2]);
		}
		
		if("03".equals(zoneID)) {
			System.out.println("���� �ð� >>>");
			new Ex_Thread_3(Ex_Thread_3.timeZone[Ex_Thread_3.Time_Zone_3]
												,Ex_Thread_3.timeCity[3]);
		}
		//��ü����
		sc.close();	
	}
}
