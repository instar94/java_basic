package a.b.c.ch7;

import java.io.FileInputStream;
//다른 패키지 임으로 사용을 위해 import
import a.b.c.common.FilePath;
import java.io.File;

public class Ex_FileInputStream {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
/*
	자바 프로그램과 메모리
	자바에서 메모리를 소스에서 개발자가 메모리를 지우지 못함
	-> 자바에서 메모리를 지우는 역할은 GC가 함
	GC(Garbage Collector)에 자바가 메모리를 지우는 것을 요청함
	-> 프로그램에서 메모리에서 지워지는것은 언제 지워질 지 모름
	
	자바에서 null
	null 키워드는 데이터를 가르키지 않음
	이 참조변수에는 데이터가 없다
	
	지역변수를 사용하는 방법
	- 지역변수는 함수에서 시작해서 함수에서 끝남
		-> 단 끝을 내는것은 가비지 컬랙터가 수행
	- 지역변수를 끝내라고 명령 할 수 없음
	- 지역변수는 가비지 컬랙터가 그 프로그램의 
	메모리상황, 우선도를 보고 스캐쥴링에 의해 끝냄
	
	지역변수 사용 규칙
	- 선언과 동시에 디폴트 값으로 초기화
		객체 :  null
		기초자료형 : 0.0, 0 , false
	- 통신관련 혹은 I/O가 발생하는 경우 close(), null, flush() 해야함
	- rt.jar : java.io, java.sql java.lang이 해당됨
*/	
		
		//지역변수 선언 및 디폴트값 초기화
		FileInputStream fis = null;
		int data =0;
		
		try {
		//common 클래스를 이용하여 주소 입력 간편화
		String path = FilePath.FILE_PATH;
		System.out.println("path >>> : "+path);
	
		path = path + "/" + "Ex_FileInputStream.java";
		System.out.println("path >>> : "+path);
		
		//file 클래스를 new 인스턴스함
		File f = new File(path);
		//exists: 해당 파일이 존재하는지 확인함
		boolean bFile = f.exists();
		
		if(bFile) {
			//FileInputStream의 객체 오픈
			//fis에 FileInputStream(f)를 집어 넣음
			fis = new FileInputStream(f);
			
			//주소값 출력
			System.out.println("fis >>> : "+fis);
			
			//data는 fis를 읽어온 값으로함
			data = fis.read();
			System.out.println("data >>> : " + data);
			System.out.println("(byte)data >>> : " + (byte)data);
			System.out.println("(char)data >>> : " + (char)data);

			//while 반복문을 통해 read로 
			//읽어온 값이 -1(=끝이 될때까지)뽑아냄
			//바이트 단위로 읽을 땐 맨 끝을 -1 로 표현
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
			}
			
			//정상 수행시를 위한 FileInputStream I/O 객체 닫기
			fis.close();
			//null처리를 통해 해당 객체가 가비지컬랙터에의해
			//메모리에서 내려가지 않았을때를 대비함
			//해당 값은 데이터가 없음
			fis = null;
			
		//f.exists 가 F라면 해당 파일이 없는 것임
		}else {
			System.out.println("파일 없음");
		}
		//오류시 메세지를 뽑음 : 참조변수 e + getMessage()
		//IOException에서 Exception으로 변경
		//더 많은 예외처리가 필요해짐
		}catch(Exception e) {
			System.out.println("에러 e.getMessage() >>> :"+ e.getMessage());
		//finally는 정상작동/비정상작동 언제든 작동
		//따라서 비정상 종료를 대비하여 루틴을 만듬
			//fis가 null값이 아니라면 종료시킴
		}finally {
			if(fis!=null) {
				try {
					fis.close();
					fis = null;
				}catch(Exception e) {
					
				}//end of catch문
			}//end of if문
		}//end of fianlly 문
	}//end of main method
}//end of Ex_FileinputStream class

