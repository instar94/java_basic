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

	//������� ����
	private JLabel		la1, la2, la3, la4, la5, la6, la7;
	private JTextField	tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton		bt1, bt2, bt3, bt4;
	private JPanel		pa1, pa2;
	
	//GUI ����� ���� ������ ����
	public SwingMember() {
		
		//this -> JFram �� SwingMember �ҷ���
		//���α׷� �̸� - SwingMember
		//���̾ƿ� �Ŵ��� :�������̾ƿ�
		this.setTitle("SwingMember");
		this.setLayout(new BorderLayout());
		
		//JPanel ����� ���� �ν��Ͻ�
		//pa1 : �Է�â
		//pa2 : ��� ����â
		pa1 = new JPanel();
		pa2 = new JPanel();
		
		//���� ����
		pa1.setBackground(Color.cyan);
		pa2.setBackground(Color.blue);
		
		//�г� ���̾ƿ�
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);
		
		//�г�1 -> ���� �Է�â
		//�� 7�� + �ؽ�Ʈ �ʵ� 7�� -> 7�� 2�� �׸���
		pa1.setLayout(new GridLayout(7,2));
		la1 = new JLabel("����ȣ", JLabel.CENTER);
		la2 = new JLabel("���̸�", JLabel.CENTER);
		la3 = new JLabel("���̵�", JLabel.CENTER);
		la4 = new JLabel("�н�����", JLabel.CENTER);
		la5 = new JLabel("��������", JLabel.CENTER);
		la6 = new JLabel("�������", JLabel.CENTER);
		la7 = new JLabel("��������", JLabel.CENTER);
		
		//�ؽ�Ʈ�ʵ带 �ν��Ͻ���
		//(10) : 10���� ����
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);
		
		//�гο� �ؽ�Ʈ�ʵ�� ���� �����ư��� ����
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
		
		//��� ����â ��ư ����� -> ����� �߽����� ��ư ��ġ
		//flowlayout�� ����
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//��ư���� �̸��� ����
		bt1 = new JButton("��ȸ");
		bt2 = new JButton("����");
		bt3 = new JButton("����");
		bt4 = new JButton("����");
		
		//�� ��ư���� �гο� ����
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		
		//�Է����� ���ϵ��� ���ƹ���
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);
		
		//�̺�Ʈ ����
		//�� ��ư���� � �̺�Ʈ�� ������� ����
		//� ��ư�� ������ EventHandler�� ���� ��Ŵ
		//EventHandler ���� �޾ƿ� ���� ���� if������ �б��� ����
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		bt3.addActionListener(new EventHandler());
		bt4.addActionListener(new EventHandler());
		
		//â ������
		this.setSize(300, 250);
		this.setLocation(400, 200);
		this.setVisible(true);
		
		//JFrame�� �ݴ� ��ɾ�
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
	
	//���� Ŭ������ �̿��Ͽ� �׼Ǹ����ʸ� ���� 
	class EventHandler implements ActionListener{
		
		//ActionListener�� ������ �ڿ��� 
		//actionperformed �� �������̵���
		
		public void actionperformed(ActionEvent e) {
		
			//��ư�� ������ ������ �ش�Ǵ� String ����
			//btncmd�� ����
			//�� ���� String���� ��
			String btnCmd = String.valueOf(e.getActionCommand());
			
			//ȸ����ȣ�� �޾Ƽ� ������ ��ȸ��
			if("��ȸ".equals(btnCmd)) {
				System.out.println("btnCmd >>>> " + btnCmd);
				
				//������ ���� swnum ���� �� �ʱ�ȭ
				String swnum = "";
				
				//swnum�� tf1 �ؽ�Ʈ �ʵ忡�� �޾ƿ�
				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("����".equals(btnCmd)) {
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("����".equals(btnCmd)) {
				
				try {}
				catch(Exception e1) {}
				finally {}
			}
			
			if("����".equals(btnCmd)) {
				
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
