package a.b.c.ch7;

//FileInputStream�� ����Ʈ �����̱� ������ 2byte¥���� ���� ����
/*
������ ����Ʈ ������ �о��
������ �б����� ����
	1. ���� ��ġ�� �˾ƾ���
	2. ���� �̸��� �˾ƾ���
	3. ���Ͽ� �ִ� ������ �޸𸮿� �÷�����
	4. ������ ���� �� byte������ �޸𸮿� �÷� ����
	5. ������ �� ã�Ƽ� �޸𸮿� �÷� ������ 
	6. read()�Լ��� ����Ʈ ������ �о��
	7. ����Ʈ������ ���� -1dla
 */
import java.io.FileInputStream;
//IOException
//io��Ű���� �ֻ��� Ŭ�����̸�, checked Exception�̴�.
//�ҽ������� ���� �� ��/�������Ҷ� ����ó���� �������
import java.io.IOException;

//���� = ���丮(�����н�) + �����̸� + ���� ���(���� ���̳ʸ�)

public class Ex_IOTest_1 {

	//throws�� �Ϲ������� main���� ������ �ʴ´�
	//���� Ex_IOTest_1 �� ���� try catch�� ���� ��°� ����
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//���丮 ������/���ϱ�����(file sperator)
		//������ \ , ��Ŭ���� //
		//������ ���н� : /
		//FileInputStream�� ��� �����ڷ� ���� String name, File file ���� �Ű������� ����
		//String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		//FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		//�ּҰ��� ��
		FileInputStream fis = new FileInputStream("Ex_IOTest_1.java)");
		System.out.println("fis >>> : "+fis);
		
		//read() : ��ǲ�� ��Ʈ���� �������� ����Ʈ�� �о���δ�
		//�� ����Ʈ���� Ȯ����?
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

			//����Ʈ ������ ���� ��, �� ���� -1�� ǥ����
			// �ǳ��� �ƴҶ� ���� �ݺ���
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
		}//end of while��
	}//end of main method
}//end of Ex_IOTest_1 class

/*
 * 1byte �̱� ������
 * �ѱ۷� �ۼ��� �͵��� ����
fis >>> : java.io.FileInputStream@15db9742
data >>> : 112
(byte)data >>> : 112
(char)data >>> : p
ackage a.b.c.ch7;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOTest_1 {

	//throws��? ??��????����? main�������� ??��????? ��?��?��?
	//??��?���� Ex_IOTest_1 ��? �ơ�?? try catch��? ???�� ??��?��? ??��?
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//?������??���� ��������??/��???��������??(file sperator)
		//????��? \ , ????�������� //
		//���碥������ ??�������� : /
		//FileInputStream?? �Ʃ���? ??����??��? ��?�ҡ� String name, File file ???? ��?�Ʃ���?��?��? �Ƣ�??
		String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		System.out.println("fis >>> : "+fis);
		
		//read() : ???��?? �������碬��?? ?������???? ��???���硤? ?����?????��?
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

			//��???���� ��??�ס�? ?��?? �ҡ�, ��? ����?? -1��? ??��???
			// ��?����?? ������?�ҡ� ��??? ��?����??
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
			}//end of while����
	}

}
*/
