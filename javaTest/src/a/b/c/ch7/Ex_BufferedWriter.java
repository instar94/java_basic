package a.b.c.ch7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;

public class Ex_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� �ʱ�ȭ
		String filePath = FilePath.FILE_PATH;
		
		String inFile = filePath + "/" + "Ex_BufferedWriter.java";
		String outFile = filePath + "/" + "Ex_BufferedWriter.bak";
		
		//�������� ���� �� �ʱ�ȭ
		BufferedReader inbuf = null;
		BufferedWriter outbuf = null;
		FileReader fr = null;
		FileWriter fw = null;
		File f= null;
		int data = 0;
		
		//try-catch����
		try {
			f = new File(inFile);
			boolean bFile = f.exists();
			
			if(bFile) {
				//��ü����
				fr = new FileReader(f);
				inbuf = new BufferedReader(fr);
				
				fw = new FileWriter(outFile,false);
				outbuf = new BufferedWriter(fw);
				
				while((data=inbuf.read())!=-1) {
					System.out.print((char)data);
					outbuf.write(data);
				}
				//������ flush �ؾ���
				outbuf.flush();
				
				//��ü close
				outbuf.close(); outbuf=null;
				fw.close(); fw=null;
				inbuf.close(); inbuf=null;
				fr.close(); fr=null;
				
			}else {
				System.out.println("������Ȯ��");
			}//end of if - else ��
			
		}catch(Exception e){
			System.out.println("���� �߻�"+e.getMessage());
		}finally {
			//������ ����� ��ü close
			if(outbuf!=null) {
				try {outbuf.close(); outbuf=null;} catch(Exception e){}
			}
			if(fw!=null) {
				try {fw.close(); fw=null;} catch(Exception e){}
			}
			if(inbuf!=null) {
				try {inbuf.close(); inbuf=null;} catch(Exception e){}
			}
			if(fr!=null) {
				try {fr.close(); fr=null;} catch(Exception e){}
			}
		}
	}
}
