package a.b.c.ch6;
// �Լ��� ȣ��


public class Ex_Invoke_1 {

	public Ex_Invoke_1() {
		System.out.println("Ex_Invoke ������ ���� >>>>");
	}
	public int aM() {
		System.out.println("aM()�Լ� ����>>>> ");
		System.out.println("aM() �Լ�");
		//aM�Լ� ������ bM()�Լ��� ȣ��
		int sum = bM();
		System.out.println("aM() �Լ� �� >>> ");
		return sum;
	}
	
	public int bM() {
		System.out.println("bM()�Լ� ����>>>> ");
		System.out.println("bM() �Լ�");
		//bM�Լ� ������ cM()�Լ� ȣ��
		int sum = cM();
		System.out.println("bM() �Լ� �� >>> ");
		return sum;
	}
	
	public int cM() {
		System.out.println("cM()�Լ� ����>>>> ");
		System.out.println("cM() �Լ�");
		//cM�Լ� ������ dM�Լ� ȣ��
		int sum = dM();
		System.out.println("cM() �Լ� �� >>> ");
		return sum;
	}
	
	public int dM() {
		System.out.println("dM()�Լ� ����>>>> ");
		System.out.println("dM() �Լ�");
		//int sum = 1/0;
		int sum = 1/0;
		System.out.println("dM() �Լ� �� >>> ");
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Ex_Invoke main ()�Լ� ����>>>> ");
			
			//����� ���� Ŭ���� �������� ���
			Ex_Invoke_1 exi = new Ex_Invoke_1();
			System.out.println("exi >>>>> " + exi);
			int sum = exi.aM();
			//�����Լ� ������ �������� exi�� aM()�� ȣ���� = invoke�� dispatch��
						
			System.out.println("main sum >>>> " + sum);
			System.out.println("Ex_Invoke main() �Լ� �� >>> ");
		}
	}

//main() -> aM() -> bM() -> cM() -> dM()

/* ������ �߻���
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at a.b.c.ch6.Ex_Invoke_1.dM(Ex_Invoke_1.java:47)
        at a.b.c.ch6.Ex_Invoke_1.cM(Ex_Invoke_1.java:37)
        at a.b.c.ch6.Ex_Invoke_1.bM(Ex_Invoke_1.java:25)
        at a.b.c.ch6.Ex_Invoke_1.aM(Ex_Invoke_1.java:14)
        at a.b.c.ch6.Ex_Invoke_1.main(Ex_Invoke_1.java:65)
        */
