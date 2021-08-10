package a.b.c.ch7;

import java.io.FileInputStream;
//�ٸ� ��Ű�� ������ ����� ���� import
import a.b.c.common.FilePath;
import java.io.File;

public class Ex_FileInputStream {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
/*
	�ڹ� ���α׷��� �޸�
	�ڹٿ��� �޸𸮸� �ҽ����� �����ڰ� �޸𸮸� ������ ����
	-> �ڹٿ��� �޸𸮸� ����� ������ GC�� ��
	GC(Garbage Collector)�� �ڹٰ� �޸𸮸� ����� ���� ��û��
	-> ���α׷����� �޸𸮿��� �������°��� ���� ������ �� ��
	
	�ڹٿ��� null
	null Ű����� �����͸� ����Ű�� ����
	�� ������������ �����Ͱ� ����
	
	���������� ����ϴ� ���
	- ���������� �Լ����� �����ؼ� �Լ����� ����
		-> �� ���� ���°��� ������ �÷��Ͱ� ����
	- ���������� ������� ��� �� �� ����
	- ���������� ������ �÷��Ͱ� �� ���α׷��� 
	�޸𸮻�Ȳ, �켱���� ���� ��ĳ�층�� ���� ����
	
	�������� ��� ��Ģ
	- ����� ���ÿ� ����Ʈ ������ �ʱ�ȭ
		��ü :  null
		�����ڷ��� : 0.0, 0 , false
	- ��Ű��� Ȥ�� I/O�� �߻��ϴ� ��� close(), null, flush() �ؾ���
	- rt.jar : java.io, java.sql java.lang�� �ش��
*/	
		
		//�������� ���� �� ����Ʈ�� �ʱ�ȭ
		FileInputStream fis = null;
		int data =0;
		
		try {
		//common Ŭ������ �̿��Ͽ� �ּ� �Է� ����ȭ
		String path = FilePath.FILE_PATH;
		System.out.println("path >>> : "+path);
	
		path = path + "/" + "Ex_FileInputStream.java";
		System.out.println("path >>> : "+path);
		
		//file Ŭ������ new �ν��Ͻ���
		File f = new File(path);
		//exists: �ش� ������ �����ϴ��� Ȯ����
		boolean bFile = f.exists();
		
		if(bFile) {
			//FileInputStream�� ��ü ����
			//fis�� FileInputStream(f)�� ���� ����
			fis = new FileInputStream(f);
			
			//�ּҰ� ���
			System.out.println("fis >>> : "+fis);
			
			//data�� fis�� �о�� ��������
			data = fis.read();
			System.out.println("data >>> : " + data);
			System.out.println("(byte)data >>> : " + (byte)data);
			System.out.println("(char)data >>> : " + (char)data);

			//while �ݺ����� ���� read�� 
			//�о�� ���� -1(=���� �ɶ�����)�̾Ƴ�
			//����Ʈ ������ ���� �� �� ���� -1 �� ǥ��
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
			}
			
			//���� ����ø� ���� FileInputStream I/O ��ü �ݱ�
			fis.close();
			//nulló���� ���� �ش� ��ü�� �������÷��Ϳ�����
			//�޸𸮿��� �������� �ʾ������� �����
			//�ش� ���� �����Ͱ� ����
			fis = null;
			
		//f.exists �� F��� �ش� ������ ���� ����
		}else {
			System.out.println("���� ����");
		}
		//������ �޼����� ���� : �������� e + getMessage()
		//IOException���� Exception���� ����
		//�� ���� ����ó���� �ʿ�����
		}catch(Exception e) {
			System.out.println("���� e.getMessage() >>> :"+ e.getMessage());
		//finally�� �����۵�/�������۵� ������ �۵�
		//���� ������ ���Ḧ ����Ͽ� ��ƾ�� ����
			//fis�� null���� �ƴ϶�� �����Ŵ
		}finally {
			if(fis!=null) {
				try {
					fis.close();
					fis = null;
				}catch(Exception e) {
					
				}//end of catch��
			}//end of if��
		}//end of fianlly ��
	}//end of main method
}//end of Ex_FileinputStream class

