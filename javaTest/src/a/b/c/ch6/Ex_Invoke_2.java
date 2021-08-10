package a.b.c.ch6;
/*
Exception : ����Ŭ����
try() catch() finally () ���� : ���� ó���ϱ�
throws : ����ó�� �̷�� -> ȣ���Լ��� ���� ������ -> main���� throws�� ��� �� �� ����
throw Ű���� : ����� ���� ����

checked Exception : �����Ͻ� ���� -> �ݵ�� ����ó�� �ؾ��� => �ѹ��� �ʼ��� �ƴ�
IOExcetption, ClassNotFoundExceptio ���
Unchecked Exception : ����� ���� -> ��������� ���� �ʾƵ��� -=> �ѹ� �ʼ�
ex) NullPointerException, ClasscaseException ���

*/
public class Ex_Invoke_2 {

	public Ex_Invoke_2() {
		System.out.println("Ex_Invoke_1() ������ >>> : ");	
	}
	
	public int aM() {
		System.out.println("aM() �Լ� ���� >>> : ");
		
		System.out.println("aM() �Լ� ");
		// aM()�Լ� ������ bM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = bM();
		System.out.println("aM() sum >>> : " + sum);
		System.out.println("aM() �Լ� �� >>> : ");
		
		return sum;
	}

	public int bM() {
		System.out.println("bM() �Լ� ���� >>> : ");
		
		System.out.println("bM() �Լ� ");
		// bM()�Լ� ������ cM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = cM();
		System.out.println("bM() sum >>> : " + sum);
		System.out.println("bM() �Լ� �� >>> : ");
		
		return sum;
	}

	public int cM() {
		System.out.println("cM() �Լ� ���� >>> : ");
		
		System.out.println("cM() �Լ� ");
		// cM()�Լ� ������ dM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = dM();
		System.out.println("cM() sum >>> : " + sum);
		System.out.println("cM() �Լ� �� >>> : ");
		
		return sum;
	}

	//���� ó�� : ������ ���� �׳� ����ǵ��� ��
	public int dM() {
		System.out.println("dM() �Լ� ���� >>> : ");
		
		System.out.println("dM() �Լ� ");
		int sum = 0;
		
		try {
		sum = 1 / 0;
		
		System.out.println("dM() sum >>> : " + sum);
		}catch(ArithmeticException a) {
			System.out.println("������ >>> "+a);
			System.out.println("������ a.getMessage() >>> "+a.getMessage());
			a.printStackTrace();
		}
		
		System.out.println("dM() �Լ� �� >>> : ");
		
		return sum;
	}
	
	// main() �Լ��� ������ �ܼ� ���ø����̼��̶�� �θ���. 
	// �ܼ� ���ø����̼ǿ��� �Լ��� ��������  main() �Լ� �̴�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 :: main() �Լ� ���� >>> : ");
		System.out.println("Ex_Invoke_1 :: main() �Լ� ù ���� ���� ��������Ʈ ������� ���� �ȴ�. >>> : ");
		
		// ����� ���� Ŭ���� �������� ����ϱ�
		Ex_Invoke_2 exi = new Ex_Invoke_2();
		System.out.println("exi �ּҰ� >>> : " + exi);
		
		// �����Լ� ������ �������� exi �� aM()�� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = exi.aM();
		System.out.println("main sum >>> : " + sum);
	}
}

//main() -> aM() -> bM() -> cM() -> dM() ������� �Լ��� ����
/*Ex_Invoke_1 :: main() �Լ� ���� >>> : 
Ex_Invoke_1 :: main() �Լ� ù ���� ���� ��������Ʈ ������� ���� �ȴ�. >>> : 
Ex_Invoke_1() ������ >>> : 
exi �ּҰ� >>> : a.b.c.ch6.Ex_Invoke_2@15db9742
aM() �Լ� ���� >>> : 
aM() �Լ� 
bM() �Լ� ���� >>> : 
bM() �Լ� 
cM() �Լ� ���� >>> : 
cM() �Լ� 
dM() �Լ� ���� >>> : 
dM() �Լ� 

������ >>> java.lang.ArithmeticException: / by zero
������ a.getMessage() >>> / by zero
java.lang.ArithmeticException: / by zero
	at a.b.c.ch6.Ex_Invoke_2.dM(Ex_Invoke_2.java:53)
	at a.b.c.ch6.Ex_Invoke_2.cM(Ex_Invoke_2.java:38)
	at a.b.c.ch6.Ex_Invoke_2.bM(Ex_Invoke_2.java:26)
	at a.b.c.ch6.Ex_Invoke_2.aM(Ex_Invoke_2.java:14)
	at a.b.c.ch6.Ex_Invoke_2.main(Ex_Invoke_2.java:79)
dM() �Լ� �� >>> : 
cM() sum >>> : 0
cM() �Լ� �� >>> : 
bM() sum >>> : 0
bM() �Լ� �� >>> : 
aM() sum >>> : 0
aM() �Լ� �� >>> : 
main sum >>> : 0

���α׷� ��ü�� ���ߴ� ���� �ƴ϶� 
->���� �޼����� ������ �Ʒ��� ���� ����� 
*/