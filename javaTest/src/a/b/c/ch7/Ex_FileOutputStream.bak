package a.b.c.ch7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Ex_FileOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FILE_PATH를 지역함수에 넣기
		String filePath = FilePath.FILE_PATH;
		
		//filepPath 및 사용할 파일 명으로 초기화
		//read용dls inFile과 write용인 outFile로 나눔 
		String inFile = filePath +"/" +"Ex_FileOutputStream.java";
		String outFile = filePath +"/" +"Ex_FileOutputStream.bak";
	
		//지역변수를 디폴트 값으로 초기화
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;
		int data = 0;
		
		//원하는 행동 시작
		try {
			//inFile에 있는 파일을 인스턴스하고 f에 대입
			//그 파일이 있는지 exists을 통해 확인
			//있다면 true 없다면 false가 리턴될 것임
			f= new File(inFile);
			boolean bFile = f.exists();
			System.out.println("bFile >>> "+bFile);
			
			//bFile이 true라면
			if (bFile) {
				//fis 객체 사용 시작
				//파일을 읽기 위함
				//FileInputStream에 주소를 넣고 인스턴스함
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);
				
				//fos 객체 사용 시작 
				//파일 쓰기
				//FileOutputStream에 쓸 타입을 집어넣음
				//false : 덮어쓰기 // true : 덧붙여 쓰기
				fos = new FileOutputStream(outFile, false);
				System.out.println("fos >>> : " + fos);
				
				//java 파일을 읽고, bak파일 쓰기
				//fis의 데이터를 끝까지 읽도록 반복하고
				//읽어낸 데이터들을 write를 통해 새로 작성함
				while ((data=fis.read())!=-1) {
					//콘솔에 찍힐 수 있도록 만듬
					System.out.print((char)data);
					fos.write(data);
				}//end of 읽고 쓰기 while문
			
				//bFile이 false 일 시,
			}else {
				System.out.println("파일을 확인해주세요");
				
				//io 객체 종료
				//단 닫을 땐 열 때와 반대 순서로
				fos.close(); fos=null;
				fis.close(); fis=null;
			}
		}catch (Exception e){
			System.out.println("에러 e.getMessage()"+e.getMessage());
		}finally {
			//try절에서 예외 발생시 사용한 io 객체 닫기
			//io가 null 이지 않은 경우에만 수행
			//닫을때는 연 순서와 반대로
			if(fos !=null) {
				try {fos.close(); fos=null;}catch(Exception e) {}
				}
				if(fis !=null) {
					try {fis.close(); fis=null;}catch(Exception e) {}		
			}//end of if문
		}//end of finally 문
	}//end of main method
}//end of Ex_FileOutput class
