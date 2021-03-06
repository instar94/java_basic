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

		//FILE_PATH를 불러옴
		String filePath =FilePath.FILE_PATH;
		
		//filePath의 파일명을 읽고 쓰는 용르 ㅗ바꿈
		String inFile = filePath + "/" +"Ex_BufferedStream.java";
		String outFile = filePath + "/" + "Ex_BufferedStream.bak";
		
		//지역변수를 선언 + 디폴트 값으로 초기화
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		int data = 0;
		
		try {
			
			//파일이 있는지 없는지를 확인하는 bFile 선언
			f = new File(inFile);
			boolean bFile = f.exists();
			
			if(bFile) {
			//객체 오픈
			fis = new FileInputStream(f);
			inbuf = new BufferedInputStream(fis);
			fos = new FileOutputStream(outFile,false);
			outbuf = new BufferedOutputStream(fos);
			
			System.out.println("fis >>>> " + fis);
			System.out.println("inbuf >>> "+ inbuf);
			System.out.println("fos >>>> " + fos);
			System.out.println("outbuf >>> "+ outbuf);
			
			//while을 이용해서 콘솔에도 쓰고
			//outbuf로도 write함
			while((data=inbuf.read())!=-1) {
				System.out.print((char)data);
				outbuf.write(data);
			}//end of while문
			
			//buffer의 경우 실행될지 안될지 모름
			//flush를 써줘서 수동으로 실행시키게함
			outbuf.flush();
			
			//객체 close
			//닫을때는 거꾸로 닫아야함
			outbuf.close(); outbuf=null;
			fos.close(); fos=null;
			inbuf.close(); inbuf=null;
			fis.close(); fis=null;
			
			//파일이 없다면 
			}else {
				System.out.println("데이터 확인 필요");
			}//end of if- else 문
	
		}catch (Exception e){
			System.out.println("에러 get.Message()"+ e.getMessage());
		//비정상 가동시 객체를 close 해줘야함
		// 닫을때는 거꾸로 해야함
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
			}//end of if문
		}//end of finally 문
	}//end of main method
}//end of Ex_BufferedStream class
