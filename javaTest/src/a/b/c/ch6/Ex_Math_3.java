package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Math_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Math_3.main() ����>>>>>");
		//answer ��� ���������� ����
		//random���� ���� ���� 100���Ͽ� 1~100���� ���� ���� �� ����
		int answer = (int)(Math.random()*100)+1;
		System.out.println("answer >>> " + answer);
		
		//�Է°��� ī��Ʈ �� ���� �� ����Ʈ�� �ʱ�ȭ
		int input = 0;
		int count = 0;
		
		//Scanner class�� ���ؼ� ���� �޾ƿ�
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//do-while�� while���� �ٸ��� �ּ� 1ȸ �̻� �����
		do {
			//ī��Ʈ�� �Ź� 1�� ������
			count++;
			System.out.println("1~100���� ���� �Է��ϼ���");
			
			//�޾ƿ� ����  int������ ����� input�� �ʱ�ȭ
			input = sc.nextInt();
			
			//������ ��� -> break�� ���� while�� ����
			if(answer == input) {
				System.out.println("���� : "+ count+ "������ ������ϴ�.");
				break;
			}else if (answer < input) {
				System.out.println("�ٿ�");
			}else if (answer > input){
				System.out.println("��");
				}//end of if-else ����
			}//end of do��
		while(true);
		System.out.println("Ex_Math_3.main() ��>>>>>");
	}//end of main Method
}//end of Ex_Math_3 class
