package a.b.c.ch6;

//��Һ�

public class Ex_Math_5 {

	//return�� static�Լ� ����
	//static �Լ� = Ŭ�����̸�.�Լ��� ���� ���
	//max() �� ����� ���� �Լ�
	//�Ű������� int a, int b, int c
	//return���� �ʿ��ϱ� ������ return ����
	// a�� b �� => b�� Ŭ ��� 
	public static int max(int a, int b, int c) {
		//�����ڷ��� + �������� max ����
		int max = a;
		
		//�� if else�� �ƴұ�? 
		//���ǹ��� true�϶� : b�� max ���� �ʱ�ȭ��
		//���ǹ��� false�϶� : ���� if�� �Ѿ
		if(b>=max) {
			max = b;
		}
		if (c>=max) {
			max = c;
		}
		return max;
	}
	
	public static int min(int a, int b, int c) {
		int min = a;
		
		if(b<=min) {
			min = b;
		}
		if(c<=min) {
			min = c;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//return���� �Լ��ȿ� �־���
		//�Ű������� �ƱԸ�Ʈ�� �־���
		//�ƱԸ�Ʈ�� �Ű������� �˰ڴµ� ���� ������ �𸣰ڴ�
		int max = Ex_Math_5.max(11, 2, 3);
		System.out.println("max>>> : "+max);
		
		int min = Ex_Math_5.min(11, 2, 3);
		System.out.println("min>>> : "+min);
	}

}
