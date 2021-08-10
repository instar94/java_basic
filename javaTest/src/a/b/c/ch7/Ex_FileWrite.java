package a.b.c.ch7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;

public class Ex_FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//상수화 시킨 저장 경로를 불러옴
		String filePath = FilePath.FILE_PATH;
		//경로를 읽는용과 쓰는 용에 맞게 변환
		String inFile = filePath + "/" + "Ex_FileWrite.java";
		String outFile = filePath + "/" + "Ex_FileWrite.bak";
		
		//지역변수 디폴트 값 초기화
		FileReader fr = null;
		FileWriter fw = null;
		File f = null;
		int data = 0;
		
		try {
			
			//inFile에 있는 파일을 지역변수 f에 인스턴스
			f = new File(inFile);
			//inFile의 파일이 있는지 boolean으로 보여줌
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			//파일이 있다면
			if(bFile){
				//FileReader 객체 오픈
				//FileReader가 inFile의 파일을 읽어들임
				fr = new FileReader(f);
				System.out.println("fr >>> " + fr);
				
				//FileWriter 객체 오픈
				//FileWriter가 outFile에 명시한 것처럼 파일을 씀
				//false : 덮어쓰기
				fw = new FileWriter(outFile, false);
				System.out.println("fw >>> " + fw);
				
				//덮어쓰기 진행
				//읽은 것들을 문자 하나하나 열거하고
				//이걸 작성시킴
				while ((data=fr.read())!=-1) {
					System.out.print((char)data);
					fw.write(data);
				}
				//파일이 없다면 동작 x
				//객체가 작동한거 없음
			}else {
				System.out.println("파일확인 요청");
			}
			//객체 닫기 
			fw.close(); fw=null;
			fr.close(); fr=null;
			
		}catch (Exception e){
			System.out.println("에러 발생 e.getMessage()"+e.getMessage());
			
		}finally {
			//try 비정상 작동시 닫 지 못한 객체 닫기
			if (fw !=null){
				try{fw.close(); fw=null;}catch (Exception e){}
			}
			if (fr !=null){
				try{fr.close(); fr=null;}catch (Exception e){}
			}//end of if문
		}//end of finally문
	}//end of main method
}//end of Ex_FileWriter class
