package a.b.c.ch7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;

public class Ex_FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ȭ ��Ų ���� ��θ� �ҷ���
		String filePath = FilePath.FILE_PATH;
		//��θ� �д¿�� ���� �뿡 �°� ��ȯ
		String inFile = filePath + "/" + "Ex_FileWrite.java";
		String outFile = filePath + "/" + "Ex_FileWrite.bak";
		
		//�������� ����Ʈ �� �ʱ�ȭ
		FileReader fr = null;
		FileWriter fw = null;
		File f = null;
		int data = 0;
		
		try {
			
			//inFile�� �ִ� ������ �������� f�� �ν��Ͻ�
			f = new File(inFile);
			//inFile�� ������ �ִ��� boolean���� ������
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			//������ �ִٸ�
			if(bFile){
				//FileReader ��ü ����
				//FileReader�� inFile�� ������ �о����
				fr = new FileReader(f);
				System.out.println("fr >>> " + fr);
				
				//FileWriter ��ü ����
				//FileWriter�� outFile�� ����� ��ó�� ������ ��
				//false : �����
				fw = new FileWriter(outFile, false);
				System.out.println("fw >>> " + fw);
				
				//����� ����
				//���� �͵��� ���� �ϳ��ϳ� �����ϰ�
				//�̰� �ۼ���Ŵ
				while ((data=fr.read())!=-1) {
					System.out.print((char)data);
					fw.write(data);
				}
				//������ ���ٸ� ���� x
				//��ü�� �۵��Ѱ� ����
			}else {
				System.out.println("����Ȯ�� ��û");
			}
			//��ü �ݱ� 
			fw.close(); fw=null;
			fr.close(); fr=null;
			
		}catch (Exception e){
			System.out.println("���� �߻� e.getMessage()"+e.getMessage());
			
		}finally {
			//try ������ �۵��� �� �� ���� ��ü �ݱ�
			if (fw !=null){
				try{fw.close(); fw=null;}catch (Exception e){}
			}
			if (fr !=null){
				try{fr.close(); fr=null;}catch (Exception e){}
			}//end of if��
		}//end of finally��
	}//end of main method
}//end of Ex_FileWriter class
