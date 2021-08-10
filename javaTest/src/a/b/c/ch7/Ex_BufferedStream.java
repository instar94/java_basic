package a.b.c.ch7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Ex_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FILE_PATH�� �ҷ���
		String filePath =FilePath.FILE_PATH;
		
		//filePath�� ���ϸ��� �а� ���� �븣 �ǹٲ�
		String inFile = filePath + "/" +"Ex_BufferedStream.java";
		String outFile = filePath + "/" + "Ex_BufferedStream.bak";
		
		//���������� ���� + ����Ʈ ������ �ʱ�ȭ
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		int data = 0;
		
		try {
			
			//������ �ִ��� �������� Ȯ���ϴ� bFile ����
			f = new File(inFile);
			boolean bFile = f.exists();
			
			if(bFile) {
			//��ü ����
			fis = new FileInputStream(f);
			inbuf = new BufferedInputStream(fis);
			fos = new FileOutputStream(outFile,false);
			outbuf = new BufferedOutputStream(fos);
			
			System.out.println("fis >>>> " + fis);
			System.out.println("inbuf >>> "+ inbuf);
			System.out.println("fos >>>> " + fos);
			System.out.println("outbuf >>> "+ outbuf);
			
			//while�� �̿��ؼ� �ֿܼ��� ����
			//outbuf�ε� write��
			while((data=inbuf.read())!=-1) {
				System.out.print((char)data);
				outbuf.write(data);
			}//end of while��
			
			//buffer�� ��� ������� �ȵ��� ��
			//flush�� ���༭ �������� �����Ű����
			outbuf.flush();
			
			//��ü close
			//�������� �Ųٷ� �ݾƾ���
			outbuf.close(); outbuf=null;
			fos.close(); fos=null;
			inbuf.close(); inbuf=null;
			fis.close(); fis=null;
			
			//������ ���ٸ� 
			}else {
				System.out.println("������ Ȯ�� �ʿ�");
			}//end of if- else ��
	
		}catch (Exception e){
			System.out.println("���� get.Message()"+ e.getMessage());
		//������ ������ ��ü�� close �������
		// �������� �Ųٷ� �ؾ���
		}finally {
			if(outbuf != null) {
				try{outbuf.close(); outbuf=null;}catch(Exception e){}
			}
			if (fos != null) {
				try{fos.close(); fos=null;}catch(Exception e){}
			}
			if (inbuf != null) {
				try{inbuf.close(); inbuf=null;}catch(Exception e){}
			}
			if (fis != null) {
				try{fis.close(); fis=null;}catch(Exception e){}
			}//end of if��
		}//end of finally ��
	}//end of main method
}//end of Ex_BufferedStream class