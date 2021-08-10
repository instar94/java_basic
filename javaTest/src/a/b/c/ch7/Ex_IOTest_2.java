package a.b.c.ch7;

import java.io.FileInputStream;
//input ���� ���� output�ϴ� ��Ű��
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_IOTest_2 {

	public static void main(String[] args){
	// TODO Auto-generated method stub

	//FileInputStream�� ��� throws IOException�� �ʿ�� �ϳ�
	//main�Լ����� throws�� ��븦 ����ϴ� ���� �����ؾ� ������
	//try-catch������ �ٲ㼭 �ۼ�
	String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
	//ó���� ���� \\�� /�� ����
	path = path.replace("\\", "/");
	System.out.println("path >>> : " + path);
	
	
	try {
	//�ּҰ� ���
		FileInputStream fis = new FileInputStream (path +"/" + "Ex_IOTest_2.java");
		FileOutputStream fos = new FileOutputStream(path + "/" + "Ex_IOTest_2.bak");
		System.out.println("fis >>> : "+fis);
		System.out.println("fos >>> : "+fos);
		
		//�����ڷ��� + �������� data ���� �� ����Ʈ������ �ʱ�ȭ
		int data = 0;
		

		//ó������ ������ �ݺ���
		while ((data=fis.read())!= -1) {
			//�ܼ�â������ �̰�
			System.out.print((char)data);
			//������ �����Ѱ�ó�� bak������ ����
			fos.write(data);
		}
		
	
	//������ �޼����� ���� : �������� e + getMessage()
	}catch(IOException e) {
		System.out.println("���� e.getMessage() >>> :"+ e.getMessage());
		}
	}
}