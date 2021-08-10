package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int = 4byte, 32bit
		//�ڹٴ� ���ڿ��� int�� ������
		//int�� �ƴ� ���� ��� double�� �ν��� -> �������� ����ȯ
		//�׷��� int�� �Ѿ�� �͵��� ǥ�ø� �Ѵ�. ex) 1l,100f
		//byte char short int long float double : �����ڷ���
		//�����ڷ����� �����ϴ� Wrapper Class�� ������
		//Wrapper Ŭ������ ����� ������
		
		//���� 100�� ����ϴ� ���
		
		//1. new Integer(100);
		//���������� ����ص� �ּҰ��� ������ ����
		//�ּҰ� ��� ���ڰ� ���´�		

		//Integer Ŭ�������� ������ �ʱ�ȭ�� <�߿�>
		
		//�ʱ�ȭ ������ Ÿ���� ���� �ڷ��� �϶�
		//�ʱ�ȭ ������ Ÿ���� '���ڼ���'�� �� �� <- �̷����� �����
		//���� : ����ȯ�� ���ϰ� �ϱ� ���ؼ�
		Integer i0 = new Integer(100);
		Integer i1 = new Integer("100");
		
		System.out.println("i0>>>>"+ i0);
		System.out.println("i1>>>>"+ i1);
		//�ּҰ�
		System.out.println("System.identityHashCode(i0)"+System.identityHashCode(i0));
		System.out.println("System.identityHashCode(i1)"+System.identityHashCode(i1));
		
		//intValue : Integer �� int�� �ٲ�
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		
		System.out.println("i0Val>>>>"+ i0Val);
		System.out.println("i1Val>>>>"+ i1Val);
		
		//�ּҰ�
		System.out.println("System.identityHashCode(i0Val)"+System.identityHashCode(i0Val));
		System.out.println("System.identityHashCode(i1Val)"+System.identityHashCode(i1Val));
		
		//2. ������ ���ڸ� ���ڷ� �ٲ� <�߿�>
		//������ ���� : ���ڿ� ���������̼� ("")�� ���� ���ڿ�
		//parseInt : ������ ���ڸ� ���ڷ� �ٲ�
		//Integer ���� int �� ���ڷ� �����ϴ� �� "12234" -> ���ڷ� �� ���ڿ�"1", "12"
		int i2 = Integer.parseInt("100"); //���ڼ��� ->  �����ڷ��� ���� -> ��ü����
		System.out.println("i2>>>>"+ i2);
		
		//3. new Integer() �� ������ - �����ڷ� ����
		int i3 = 100;
		System.out.println("i3>>>>"+ i3);
		
		//Integer.valueOf : int���� Integer������ ��ȯ
		//���  Wrapper Ŭ������ ����		
		//�� �ʿ��Ѱ� ? : �¿� ��ġ�� �ϱ� ���ؼ�
				//�����ڷ��� = �����ڷ��� �̶��
				//�����ڷ��� = �����ڷ���(�����ڷ���)���� ����ȯ (���)
				Integer i4 = Integer.valueOf(i3);
				System.out.println("i4>>>>>" + i4);
				
		//JDK 1.5 ���� �̷��� ��(�˰� ���� ��)
		//����ڽ�(Autoboxing) : �⺻���� ��ü�� �ٲٴ°�
		//��ڽ�(Unboxing) : ��ü�� �⺻������ �ٲٴ� ��
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; //��ڽ�
		// int sum = num1.intValue() + num2; �� ������ ����
		Integer num3 = num2; //����ڽ�
		// Integer num3 = Integer.valueOf(num2); �� ������ ����
				
		}//end of main method

	
}//end of Ex_Integer class
