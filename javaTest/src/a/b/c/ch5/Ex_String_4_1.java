package a.b.c.ch5;

//Scanner Ŭ���� ����� ���� import
import java.util.Scanner;

public class Ex_String_4_1 {

	//������
	//Ex_String_4_1�� �Լ��� ����ϱ� ���� ������ ����
	
	Ex_String_4_1(){
		
	}
	
	//�Լ�
	//���ϱ� �Լ�
	public int addM(int x, int y) {
		return x + y;
	}
	
	//���� �Լ�
	public int subM(int x, int y) {
		return x - y;
	}
	
	//���ϱ� �Լ�
	public int mulM(int x, int y) {
		return x*y;
	}
	
	//������ �Լ�
	public int divM(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Scanner Ŭ������ ����ϱ� ���� �ν��Ͻ�
		Scanner sc = new Scanner(System.in);
		
		//���� ���� �� �ʱ�ȭ
		char oper = '\u0000'; //null ����
		int x = 0;
		int y = 0;
		
		
		System.out.println("��Ģ���� ���α׷� ���� >>>>");
		System.out.println("�����ڸ� �Է����ּ��� '+', '-','*','/'");
		System.out.println("�ý����� �����Ű�� �ʹٸ� Q Ȥ�� q�� �����ּ���");
		
		//����ؼ� ��� �� �� �ֵ��� while ���� �����
		while(true) {
			
			//oper�� ���� ���� ������ �Ϸ����� ����
			//sc.next().charAt : System.in���� ���� ���� ù ���ڸ� ������
			//sc.next() : System.in���� ���� ��
			//charAt(0) : ���� ���� ù��° ���ڸ� ������
			//. ��ũ������
			oper = sc.next().charAt(0);
			
			//���� 2���� �޾Ƽ� ���� �ʱ�ȭ��
			//nextInt() : ���� �޾� ���������� ��
			if(0x2b == oper) {
				
				//ù��° ���� ����
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				x = sc.nextInt();
				
				//�ι�° ���� ����
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				y = sc.nextInt();
				
				//�Լ��� �̿��ϱ� ���� �������� ����
				//�Ź� ���� ���ִ� ���� ���� -> ���� ���Ḧ �����ߴٸ� �޸𸮸� �����ϴ� ��
				Ex_Math_1 exm = new Ex_Math_1();
				int addSum = exm.addM(x,y);
				System.out.println(x+"+"+y+"="+addSum);
			}//end of + if ��
			
			if (0x2D == oper) {
				
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				x = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int subSum = exm.subM(x,y);
				System.out.println(x+"+"+y+"="+subSum);
			}//end of - if ��
			
			if (0x2A == oper) {
				
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				x = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int mulSum = exm.mulM(x,y);
				System.out.println(x+"+"+y+"="+mulSum);
			}//end of * if ��
			
			if (0x2F == oper) {
				
				System.out.println("ù��° ���ڸ� �Է����ּ���");
				x = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է����ּ���");
				y = sc.nextInt();
				
				Ex_Math_1 exm = new Ex_Math_1();
				int divSum = exm.divM(x,y);
				System.out.println(x+"+"+y+"="+divSum);
			}//end of / if ��
			
			//0x71 = Q 0x51 = q
			//System.exit(int) : int�� ���� JVM�� �����Ŵ 
			if (0x71 == oper || 0x51 == oper){
				
				System.out.println("oper >>> : " + oper);
				System.out.println("�ý����� ���� �˴ϴ�.");
				System.exit(0);
				
			}//end of ���� if �� 
			
		}
	}//end of main () method
}//end of Ex_String_4_1 class
