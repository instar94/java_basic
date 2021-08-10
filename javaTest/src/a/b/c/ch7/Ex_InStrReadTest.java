package a.b.c.ch7;

import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;

import a.b.c.common.FilePath;

public class Ex_InStrReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	
		InputStreamReader isr = 
			new InputStreamReader(
			new FileInputStream("Ex_InStrReadTest.java"));
		while ((data=isr.read()) !=-1)
		{
			// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
			System.out.print((char)data);
		}
	*/
	
		String filePath = FilePath.FILE_PATH;
		String inFile = filePath+"/"+"Ex_InStrReadTest.java";
		
		File f = null;
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bis = null;
		int data = 0;
		boolean bFile = false;
		
		try {
			f = new File(inFile);
			bFile = f.exists();
			
			if(bFile) {
				fis = new FileInputStream(inFile);
				isr = new InputStreamReader(fis);
				bis = new BufferedReader(isr);
				
				
				while ((data=bis.read())!=-1) {
					System.out.print((char)data);
				}
				
				isr.close(); isr=null;
				bis.close(); bis=null;
				fis.close(); fis=null;
				
			} else {
				System.out.println("������ Ȯ��");
			}
		}catch(Exception e){
			System.out.println("���� �߻� "+e.getMessage());
		}finally {
			if(isr!=null) {
				try {isr.close(); isr=null;}
				catch(Exception e) {}
			}
			if(bis!=null) {
				try {bis.close(); bis=null;}
				catch(Exception e) {}
			}
			if(fis!=null) {
				try {fis.close(); fis=null;}
				catch(Exception e) {}
			}
		}	
	}

}
