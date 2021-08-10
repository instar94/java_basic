package a.b.c.ch7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import a.b.c.common.FilePath;

public class Ex_InOutStrReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String filePath = FilePath.FILE_PATH;
		String inFile = filePath+"/"+"Ex_InStrReadTest.java";
		String outFile = filePath+"/"+"Ex_InStrReadTest.bak";
		
		File f = null;
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader bis = null;
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		int data = 0;
		boolean bFile = false;
		
		try {
			f = new File(inFile);
			bFile = f.exists();
			
			if(bFile) {
				//읽기 객체 오픈
				fis = new FileInputStream(f);
				isr = new InputStreamReader(fis);
				
				bis = new BufferedReader(isr);
				
				
				//쓰기 객체 오픈
				fos = new FileOutputStream(outFile);
				osw = new OutputStreamWriter(fos);
				
				bw = new BufferedWriter(osw);
				
				while ((data=bis.read())!=-1) {
					System.out.print((char)data);
					bw.write(data);
				}
				
				bw.flush();
				
				bw.close(); bw=null;
				osw.close(); osw=null;
				fos.close(); fos=null;
				isr.close(); isr=null;
				bis.close(); bis=null;
				fis.close(); fis=null;
				
			} else {
				System.out.println("데이터 확인");
			}
		}catch(Exception e){
			System.out.println("에러 발생 "+e.getMessage());
		}finally {
			if(bw!=null) {
				try {bw.close(); bw=null;}
				catch(Exception e) {}
			}
			if(osw!=null) {
				try {osw.close(); osw=null;}
				catch(Exception e) {}
			}
			if(fos!=null) {
				try {fos.close(); fos=null;}
				catch(Exception e) {}
			}
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
