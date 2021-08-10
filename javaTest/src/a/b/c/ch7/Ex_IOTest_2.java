package a.b.c.ch7;

import java.io.FileInputStream;
//input 받은 것을 output하는 패키지
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_IOTest_2 {

	public static void main(String[] args){
	// TODO Auto-generated method stub

	//FileInputStream의 경우 throws IOException이 필요로 하나
	//main함수에서 throws를 사용를 사용하는 것을 지양해야 함으로
	//try-catch문으로 바꿔서 작성
	String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
	//처리를 위해 \\를 /로 변경
	path = path.replace("\\", "/");
	System.out.println("path >>> : " + path);
	
	
	try {
	//주소값 출력
		FileInputStream fis = new FileInputStream (path +"/" + "Ex_IOTest_2.java");
		FileOutputStream fos = new FileOutputStream(path + "/" + "Ex_IOTest_2.bak");
		System.out.println("fis >>> : "+fis);
		System.out.println("fos >>> : "+fos);
		
		//기초자료형 + 지역변수 data 선언 및 디폴트값으로 초기화
		int data = 0;
		

		//처음부터 끝까지 반복함
		while ((data=fis.read())!= -1) {
			//콘솔창에서도 뽑고
			System.out.print((char)data);
			//위에서 선언한거처럼 bak파일을 만듬
			fos.write(data);
		}
		
	
	//오류시 메세지를 뽑음 : 참조변수 e + getMessage()
	}catch(IOException e) {
		System.out.println("에러 e.getMessage() >>> :"+ e.getMessage());
		}
	}
}