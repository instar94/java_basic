package a.b.c.ch6;

public class Ex_Exception_4 {

	public void aM() throws Exception{
		System.out.println("aM�Լ� ���� >>> ");
		System.out.println("aM()");
		bM();
		System.out.println("aM�Լ� �� >>> ");
	}//end of aM()method
	
	public void bM() throws Exception{
		System.out.println("bM�Լ� ���� >>> ");
		System.out.println("bM()");
		
		//������ �߻���
		//ArrayIndexOutOfBoundsException
		int[] iVal = new int[5];
		
		for (int i =0; i<= iVal.length; i++) {
			iVal[i]=i;
			System.out.println("iVal["+i+"] >>> "+iVal);
		}//end of for��
		
		String msg = cM();
		System.out.println("bM�Լ� �� >>> ");
	}//end of bM() metohd
	
	public String cM() throws Exception{
		System.out.println("cM�Լ� ���� >>> ");
		System.out.println("cM()");
		
		String msg = dM();
		System.out.println("cM() msg >>>> : " + msg);
		
		System.out.println("cM�Լ� �� >>> ");
		
		return "cM() �Լ����� ���� �׽�Ʈ�� ";
	}
	
	public String dM() throws Exception {
		System.out.println("dM�Լ� ���� >>> ");
		System.out.println("dM()");
		
		int x = 1;
		int y = 0;
		//���� �߻��� : ArithmeticException a
		int z = x/y;
		
		System.out.println("z>>> :" + z);
		System.out.println("dM�Լ� �� >>> ");
		
		return "dM() �Լ����� ���� �׽�Ʈ��";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main �Լ� ���� >>>> ");
		
		try {
			Ex_Exception_4 ex4 = new Ex_Exception_4();
			System.out.println("ex4 �������� >>> "+ex4);
			ex4.aM();
		}catch (Exception e) {
			System.out.println("e>>> : "+e);
		}
		
		System.out.print("main �Լ� �� ");
	}

}
