package a.b.c.ch7;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOTest_1_1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		//FileInputStream�� ��� throws IOException�� �ʿ�� �ϳ�
		//main�Լ����� throws�� ��븦 ����ϴ� ���� �����ؾ� ������
		//try-catch������ �ٲ㼭 �ۼ�
		try {
		String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		//�ּҰ� ���
		System.out.println("fis >>> : "+fis);
		
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

//			while ((data=fis.read())!= -1) {
//				System.out.print((char)data);
//			}
			
		while ((data=fis.read()) != -1){
			System.out.println(  " : " + data
				               + " : " + (char)data
							   + " : " + Integer.toBinaryString(data));
			}
		//������ �޼����� ���� : �������� e + getMessage()
		}catch(IOException e) {
			System.out.println("���� e.getMessage() >>> :"+ e.getMessage());
		}
	}
}