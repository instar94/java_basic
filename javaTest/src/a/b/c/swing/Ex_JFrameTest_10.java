package a.b.c.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex_JFrameTest_10 extends JFrame{

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
	
		//��ư�� ���� private�� ����
		private JButton jbt;
		private JLabel jlb;
		
		//������
		public Ex_JFrameTest_10() {
		
		//this => JFrame�� Ex_JFrameTest_7()
		//Ex_JFrameTest_7()�� setTitle�� �ҷ�����
		this.setTitle("�̺�Ʈ �غ���");
		
		//�󺧰� ��ư�� ���� JPanel�� �ν��Ͻ�
		JPanel jp = new JPanel();
		
		//1.�̺�Ʈ �߻� ������Ʈ ����
		//jbt�� ��ư�� ������� �ؽ�Ʈ�� �ִ� ������Ʈ�� ����
		//jbt�� ������ �̺�Ʈ�� �߻��Ǵ� ����
		//���� JLabel�� ���뵵 �����
		//�̺�Ʈ�� ���� ������ ����Ŭ������ MyListener��
		jbt = new JButton("��ư�� �������� >>");
		jlb = new JLabel("���� ��ư�� ������ ����");
		
		//3. �̺�Ʈ �����ʸ� �̺�Ʈ �ҽ��� ���
		//2���� ����  MyListner�� jbt/jlb�� ������
		//����Ŭ������ �̿���
		//addActionListener�� �̿��� ���� ���� ��Ŵ
		jbt.addActionListener(new ActionListener() {
			
			//2. �̺�Ʈ ������ Ŭ���� ��� -> ���� Ŭ���� �̿�
			//jbt�� ������ �߻��� �̺�Ʈ��
			//ActionListner��� �������̽��� �����
			//�ȿ� �ִ� actionPerformed��� �Լ��� �������̵��ؼ� ��
			//�׼��̺�Ʈ
			//����ڰ� ��ư�� ������
			//����ڰ� �޴� �׸��� �����Ҷ�
			//����ڰ� �ؽ�Ʈ �ʵ忡�� ����Ű�� ������
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbt) {
				jlb.setText("��ħ�� ��ư�� �������ϴ�. >>> : ");
				}
			}
		});
		
		jp.add(jbt);
		jp.add(jlb);
		
		//JFrame�� �г��� ����ϰ�, ����� ��������
		this.add(jp);
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		}

			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Ex_JFrameTest_8.main ����>>> ");
			
			//���õ� ��ư�� ���ο��� ���� ��Ŵ
			new Ex_JFrameTest_10();
			
			System.out.println("Ex_JFrameTest_8.main ��>>> ");
		
	}//end of main method

}//end of JFrameTest class

