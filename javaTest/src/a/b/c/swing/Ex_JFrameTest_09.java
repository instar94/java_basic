package a.b.c.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//��ӹ޾Ƽ� �ϱ�
public class Ex_JFrameTest_09 extends JFrame implements ActionListener{

		//�̺�Ʈ ���� ���α׷���(Event driven programming)
		//event, event source, event listener
	
		//�̺�Ʈó������
		//1. �̺�Ʈ �߻� ������Ʈ ����
	
		//2. �̺�Ʈ ������ Ŭ���� ���
//		�ܺ� Ŭ����
//		���� Ŭ����
//		���� ��ü : ����ϴ� ���
//		���� Ŭ���� : �͸� Ŭ���� : Anonymous class
		
//		//3. �̺�Ʈ �����ʸ� �̺�Ʈ �ҽ��� ���
//		�ܺ� Ŭ���� : addXxxListener(new �ܺ�Ŭ����())
//		���� Ŭ���� : addXxxListener(new ����Ŭ����())
//		���� ��ü : ����ϴ� ��� : addXxxListener(this)
//		���� Ŭ���� : �͸� Ŭ���� : Anonymous class :  : addXxxListener(new �̺�Ʈ������Ŭ����(){
//												............
//											})
	
		//��ư�� private�� ����
		private JButton jbt;
		
		//������
		public Ex_JFrameTest_09() {
		
		//this => JFrame�� Ex_JFrameTest_7()
		//Ex_JFrameTest_7()�� setTitle�� �ҷ�����
		//FlowLayout���� ������
		this.setTitle("�̺�Ʈ �غ���");
		this.setLayout(new FlowLayout());
		
		//1.�̺�Ʈ �߻� ������Ʈ ����
		//jbt�� ��ư�� ������� �ؽ�Ʈ�� �ִ� ������Ʈ�� ����
		//jbt�� ������ �̺�Ʈ�� �߻��Ǵ� ����
		//�̺�Ʈ�� ���� ������ �ܺ�Ŭ������ MyListener��
		jbt = new JButton("��ư�� �������� >>");
		
		//3. �̺�Ʈ �����ʸ� �̺�Ʈ �ҽ��� ���
		//2���� ����  MyListner�� jbt�� ������
		//addActionListener�� �̿��� ���� ���� ��Ŵ
		//���� ���� ��ü������ ��������� ������ this ��� ����
		jbt.addActionListener(this);
		
		//JFrame�� ��ư�� ����ϰ�, ����� ��������
		this.add(jbt);
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}

		//2. �̺�Ʈ ������ Ŭ���� ��� -> �ܺ� Ŭ���� �̿�
		//jbt�� ������ �߻��� �̺�Ʈ��
		//ActionListner��� �������̽��� �����
		//�ȿ� �ִ� actionPerformed��� �Լ��� �������̵��ؼ� ��

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("e >>>> " + e);
			JButton jbt = (JButton)e.getSource();
			jbt.setText("��ħ�� ��ư�� �������ϴ�. >>> : ");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_9.main ����>>> ");
			
			//���õ� ��ư�� ���ο��� ���� ��Ŵ
			new Ex_JFrameTest_09();
			
			System.out.println("Ex_JFrameTest_9.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class

