package a.b.c.ch5;
/*
 ����� �μ��� �޾�
 ������ ��Ģ����
 �ܼ� ���ø����̼�
 
 + addM
 - subM
 * mulM
 / divM
 �� �ƱԸ�Ʈ�� �޾Ƽ� 
 ���ϰ��� �޾Ƽ� �ֿܼ� ��� ����ϱ�
  */

/*
 �����ڵ�? �����ڵ�? 
1. �Լ��� ���� �� �˾ƾ� �Ѵ� 
	�Ű������� �������� ��� ������ �ϴ��� ���

2. ���α׷��� ������ in �Ķ����
  ������ �Ķ����

3. �Լ����� �� 
 static / �Ϲ��Լ�
 
4. ����� �μ� : String �迭 �̶��� �˾ƾ���
 */

//Ex_Math class ����
public class Ex_Math {
	
	//������
	public Ex_Math() {
		
	}
	
	//�Լ� : ���� �Ϲ��Լ� + return�� �ִ� �Լ� ����
	// ���� ���� �� sum�� �����ϰ�
	//sum�� return�� 

	
	//���ϱ� �Լ�
	public int addM (int x, int y) {
		int sum = x + y;
		return sum;
	}
	
	//���� �Լ�
	public int subM(int x, int y) {
		int sum = x - y;
		return sum;
	}
	
	//���ϱ� �Լ�
	public int mulM(int x, int y) {
		int sum = x*y;
		return sum;
	}
	
	//������ �Լ�
	public int divM(int x, int y) {
		int sum = x/y;
		return sum;
	}

	//�����Լ� : �ܼ־��ø����̼��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		int x = 0;
		int y = 0;
	
		if(2==args.length) {
			
		//���� ����
		//����� �μ� args[]���� ���� �޾� �ʱ�ȭ��
		//args[]�� ���� ���ڿ��̰�, ������ int���̹Ƿ� args[]���� ��ġ ���Ѿ���
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		//�Լ� ����� ���� new Ű���带 ���� ������ �ν��Ͻ�
		Ex_Math em = new Ex_Math();
		
		//���� �Լ��� �ƱԸ�Ʈ�� ����ְ� sum���� ����
		int sum1 = em.addM(x, y);
		int sum2 = em.subM(x, y);
		int sum3 = em.mulM(x, y);
		int sum4 = em.divM(x, y);
		
		//�Լ��� ���� ���
		System.out.println("���ϱ� >>>>> : " + sum1);
		System.out.println("���� >>>>> : " + sum2);
		System.out.println("���ϱ� >>>>> : " + sum3);
		System.out.println("������ >>>>> : " + sum4);
		
		}else{
			
		System.out.println("���ڸ� Ȯ�����ּ���");
		
		}
		
	}//end of main method

}//end of Ex_Math class
