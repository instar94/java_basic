package a.b.c.ch7;

import java.io.File;
//FileReadr : FileInpuStream 2byte ����
import java.io.FileReader;

import a.b.c.common.FilePath;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;
		String inFile= filePath + "/" + "FileReader";
		
		//�������� �� �������� ����
		FileReader fr = null;
		int data = 0;
		
		
		try {
		File f = new File(inFile);
		boolean bFile = f.exists();
		
		if(bFile) {
		//FileReader I/O ��ü ����
		fr = new FileReader(f);
		System.out.println("fr >>>> " + fr);
		
		data = fr.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

		//char ������ ���� ��, �� ���� -1����
		while ((data=fr.read())!=-1) {
			System.out.print((char)data);
		}
		fr.close();
		fr = null;
		}else {
			System.out.println("���� ����");
		}
		}catch(Exception e) {
			System.out.println("���� �߻� e.getMessage()"+e.getMessage());
		}finally {
			try {
			if(fr!=null) {
				fr.close(); 
				fr=null;
				}
			}catch(Exception e) {
			}
		}
	}
}
