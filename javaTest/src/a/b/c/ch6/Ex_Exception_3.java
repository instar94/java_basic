package a.b.c.ch6;

public class Ex_Exception_3 {
	
	//iVal�� aM�Լ��� �Ű�����
	//int iVal = iArr
	//iArr�� iVal�� �ּҰ��� ������
	
	//main�Լ��� �ƴѰ������� try-catch���������� 
	//��� ������ ������ �� ���� �ִ�
	//main�Լ��� throws�� �����
	//�� main�Լ������� throw�� ����� �� ����
	//public void aM(int[] iVal)throws java.lang.ArrayIndexOutOfBoundsException
	//�� ���� ����� �ֻ����� Exception�� ����
	//throw Exception
	public void aM(int[] iVal)throws Exception{
		System.out.println("aM() ���� >>>> ");
		System.out.println("iVal >>>> "+iVal);
		System.out.println("iVal.length"+iVal.length);
	
		//for���� �̿��� iVal�� ������Ҹ� ������
		//<=������ ������ �߻���
		for (int i =0 ; i <=iVal.length;i++) {
			iVal[i]=i;
			System.out.println("iVal["+i+"] >>> " + iVal[i]);
		}
		//throws�� �߱⶧���� aM�� 
		System.out.println("aM() �� >>>> ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iArr = ���������̸鼭 ����������
		System.out.println("Ex_Exception_2.main() ���� >>>> ");
		int[] iArr = new int[5];
		System.out.println("iArr >>>> " + iArr);
		
		// java.lang.ArrayIndexOutOfBoundsException
		try {
		Ex_Exception_3 ex3 = new Ex_Exception_3();
		//iArr�� �ƱԸ�Ʈ�� ������ : aM�Լ���
		ex3.aM(iArr);
		
		}catch (Exception e) {
			System.out.println("e>>>> " + e);
		}//end of try-catch ����
		System.out.println("Ex_Exception_2.main() �� >>>> ");
	}//end of main method
}//end of Ex_Exception_2 class
