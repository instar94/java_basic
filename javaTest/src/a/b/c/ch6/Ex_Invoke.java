package a.b.c.ch6;
// �Լ��� ȣ��


public class Ex_Invoke {

	public Ex_Invoke() {
		System.out.println("Ex_Invoke ������ ���� >>>>");
	}
	public void aM() {
		System.out.println("aM()�Լ� ����>>>> ");
		System.out.println("aM() �Լ�");
		//aM�Լ� ������ bM()�Լ��� ȣ��
		bM();
		System.out.println("aM() �Լ� �� >>> ");
	
	}
	
	public void bM() {
		System.out.println("bM()�Լ� ����>>>> ");
		System.out.println("bM() �Լ�");
		//bM�Լ� ������ cM()�Լ� ȣ��
		cM();
		System.out.println("bM() �Լ� �� >>> ");
		
	}
	
	public void cM() {
		System.out.println("cM()�Լ� ����>>>> ");
		System.out.println("cM() �Լ�");
		//cM�Լ� ������ dM�Լ� ȣ��
		dM();
		System.out.println("cM() �Լ� �� >>> ");
		
	}
	
	public void dM() {
		System.out.println("dM()�Լ� ����>>>> ");
		System.out.println("dM() �Լ�");
		//aM(); <- ������ �߻���
		System.out.println("dM() �Լ� �� >>> ");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Ex_Invoke main ()�Լ� ����>>>> ");
			
			//����� ���� Ŭ���� �������� ���
			Ex_Invoke exi = new Ex_Invoke();
			System.out.println("exi >>>>> " + exi);
			exi.aM();
			//�����Լ� ������ �������� exi�� aM()�� ȣ���� = invoke�� dispatch��
						
			System.out.println("Ex_Invoke main() �Լ� �� >>> ");
		}
	}


