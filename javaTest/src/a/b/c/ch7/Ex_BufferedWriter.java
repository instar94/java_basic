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

		//변수 초기화
		String filePath = FilePath.FILE_PATH;
		
		String inFile = filePath + "/" + "Ex_BufferedWriter.java";
		String outFile = filePath + "/" + "Ex_BufferedWriter.bak";
		
		//지역번수 선언 및 초기화
		BufferedReader inbuf = null;
		BufferedWriter outbuf = null;
		FileReader fr = null;
		FileWriter fw = null;
		File f= null;
		int data = 0;
		
		//try-catch구문
		try {
			f = new File(inFile);
			boolean bFile = f.exists();
			
			if(bFile) {
				//객체오픈
				fr = new FileReader(f);
				inbuf = new BufferedReader(fr);
				
				fw = new FileWriter(outFile,false);
				outbuf = new BufferedWriter(fw);
				
				while((data=inbuf.read())!=-1) {
					System.out.print((char)data);
					outbuf.write(data);
				}
				//무조건 flush 해야함
				outbuf.flush();
				
				//객체 close
				outbuf.close(); outbuf=null;
				fw.close(); fw=null;
				inbuf.close(); inbuf=null;
				fr.close(); fr=null;
				
			}else {
				System.out.println("데이터확인");
			}//end of if - else 문
			
		}catch(Exception e){
			System.out.println("에러 발생"+e.getMessage());
		}finally {
			//비정상 시행시 객체 close
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
