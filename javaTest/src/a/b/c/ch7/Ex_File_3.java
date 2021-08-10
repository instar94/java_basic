package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3 {
	
	//������� ����
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	//printFileList : ����� ���� �Լ�
	//�Ű����� File�� dir
	public static void printFileList(File dir) {
		//�����ּҸ� ����
		System.out.println(""+dir.getAbsolutePath());
		
		//File������ �迭���� ��
		//�� ���� ���ϸ���Ʈ�� ä��
		File[] files =dir.listFiles();
		
		//ArrayList�� subDir�� ������
		ArrayList subDir = new ArrayList();
		
		//file �迭�� �ִ� ������ ArrayList�� �迭�ӿ� �־����
		for(int i=0; i<files.length;i++) {
			String fileName = files[i].getName();
			
			if(files[i].isDirectory()) {
				fileName = "["+fileName+"]";
				subDir.add(i+"");
			}
			System.out.println(""+fileName);
		}
		
		//�������� ����
		//dirNum�� ���ϵ��� ��� arrayList ������<-���丮
		//filenum�� ���ϵ��� ���� - dirNum<-���ϼ�
		int dirNum=subDir.size();
		int fileNum = files.length - dirNum;
		
		//��Ż File�� Dir�� ���� ���� ����
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "���� ����."+dirNum+"���� ���丮");
		System.out.println();
		
		//subDir�� ����� �ε����� ���ϰ� �װ� int������ �ٲ۵� Integer������ �ٲ�
		for(int i=0; i<subDir.size();i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			//����Լ� : �ڱ� �ڽ��� �ٽ� �ҷ���
			//file�� �ε����� �����
			printFileList(files[index]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �Է����ּ���");
		//��ĳ�ʸ� ����ϱ� ���� ����
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		File dir = new File(str);
		System.out.println("dir >>> "+ dir);
	
		//�޼ҵ� printFileList�� dir ���� ����
		printFileList(dir);
		System.out.println(" �� : " + totalFiles + " ���� ����");
		System.out.println(" �� : " + totalDirs + " ���� ���丮");
	}

}
