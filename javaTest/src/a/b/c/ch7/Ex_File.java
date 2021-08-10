package a.b.c.ch7;

import java.io.File;
import java.io.IOException;

import a.b.c.common.FilePath;

public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;
		try {
			//File Ŭ������ �ڹٿ��� ���� �� ���� ��ü�� �ٷ�
			//�Ű����� ���� ��� �Ұ���
			//new File : FileŬ������ �ν��Ͻ� �Ѱ���
			//-> ���� �����丮�� ������ ���� �ƴϴ�.
			File f = new File("new");
			System.out.println("f>>>: " + f);
			System.out.println("f.getName()>>> " + f.getName());
			//���� ������ ����� ���ؼ��� createNewFile �Լ�
			//���� �̿��ؾ���
			//���ο� ������ ����
			//��Ŭ�������� ����� ���� ������Ʈ
			//cmd ����� ���� ���丮
			// createNewFile(), mkdir(), mkdirs()
			boolean bf = f.createNewFile();
			System.out.println("bf >>>  "+bf);
			
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> :" + bdir);
			
			boolean bfile = f.isFile();
			System.out.println("bfile >>> :" + bfile);
			
			//�ּ�
			String getPath = f.getPath();
			//�����ּ�
			String geAbsolutePath = f.getAbsolutePath();
			//�����ּҿ� . ��
			String getCanonicalPath = f.getCanonicalPath();
			
			File f1 = new File(filePath + "/"+"aaa.txt");
			System.out.println("f1 >>> " + f1);
			System.out.println("f1.getName() >>> "+ f1.getName());
			boolean bf1 = f1.createNewFile();
			System.out.println("bf1>>>> "+ bf1);
			
			String getPath1 = f1.getPath(); // File�� �Էµ� ��� ��� 
			System.out.println("getPath1 >>> : " + getPath1);
			String getAbsolutePath1 = f1.getAbsolutePath(); // ������ + �Էµ� ���(������� ���� ���)
			System.out.println("getAbsolutePath1 >>> : " + getAbsolutePath1);
			String getCanonicalPath1 = f1.getCanonicalPath(); // ������ + �Էµ� ���(����� ���)
			System.out.println("getCanonicalPath1 >>> : " + getCanonicalPath1);
			
			
			
					
		}catch(Exception io){
			
		}
	}
}
