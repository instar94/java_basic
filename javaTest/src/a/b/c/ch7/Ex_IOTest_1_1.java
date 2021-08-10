package a.b.c.ch7;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOTest_1_1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		//FileInputStream의 경우 throws IOException이 필요로 하나
		//main함수에서 throws를 사용를 사용하는 것을 지양해야 함으로
		//try-catch문으로 바꿔서 작성
		try {
		String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		//주소값 출력
		System.out.println("fis >>> : "+fis);
		
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

//			while ((data=fis.read())!= -1) {
//				System.out.print((char)data);
//			}
			
		while ((data=fis.read()) != -1){
			System.out.println(  " : " + data
				               + " : " + (char)data
							   + " : " + Integer.toBinaryString(data));
			}
		//오류시 메세지를 뽑음 : 참조변수 e + getMessage()
		}catch(IOException e) {
			System.out.println("에러 e.getMessage() >>> :"+ e.getMessage());
		}
	}
}