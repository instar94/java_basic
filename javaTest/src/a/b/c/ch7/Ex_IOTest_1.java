package a.b.c.ch7;

//FileInputStream은 바이트 단위이기 때문에 2byte짜리는 깨질 예정
/*
파일을 바이트 단위로 읽어옴
파일을 읽기위한 조건
	1. 파일 위치를 알아야함
	2. 파일 이름을 알아야함
	3. 파일에 있는 내용을 메모리에 올려야함
	4. 파일을 읽을 때 byte단위로 메모리에 올려 놓음
	5. 파일을 잘 찾아서 메모리에 올려 놓으면 
	6. read()함수가 바이트 단위로 읽어옴
	7. 바이트단위의 끝은 -1dla
 */
import java.io.FileInputStream;
//IOException
//io패키지의 최상위 클래스이며, checked Exception이다.
//소스파일을 구성 할 때/컴파일할때 예외처리를 해줘야함
import java.io.IOException;

//파일 = 디렉토리(파일패스) + 파일이름 + 파일 덩어리(파일 바이너리)

public class Ex_IOTest_1 {

	//throws는 일반적으로 main에서 사용되지 않는다
	//따라서 Ex_IOTest_1 과 같이 try catch를 통해 잡는게 좋다
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//디렉토리 구분자/파일구분자(file sperator)
		//윈도우 \ , 이클립스 //
		//리눅스 유닉스 : /
		//FileInputStream의 경우 생성자로 쓸때 String name, File file 등을 매개변수로 가짐
		//String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		//FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		//주소값을 뱉어냄
		FileInputStream fis = new FileInputStream("Ex_IOTest_1.java)");
		System.out.println("fis >>> : "+fis);
		
		//read() : 인풋된 스트림의 정보들을 바이트로 읽어들인다
		//몇 바이트인지 확인함?
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

			//바이트 단위로 읽을 때, 맨 끝을 -1로 표시함
			// 맨끝이 아닐때 까지 반복함
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
		}//end of while문
	}//end of main method
}//end of Ex_IOTest_1 class

/*
 * 1byte 이기 때문에
 * 한글로 작성된 것들은 깨짐
fis >>> : java.io.FileInputStream@15db9742
data >>> : 112
(byte)data >>> : 112
(char)data >>> : p
ackage a.b.c.ch7;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOTest_1 {

	//throws´? ??¹????¸·? main¿¡¼­ ??¿????? ¾?´?´?
	//??¶?¼­ Ex_IOTest_1 °? °°?? try catch¸? ???Ø ??´?°? ??´?
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//?ð·º??¸® ±¸ºÐ??/Æ???±¸ºÐ??(file sperator)
		//????¿? \ , ????¸³½º //
		//¸®´ª½º ??´Ð½º : /
		//FileInputStream?? °æ¿? ??¼º??·? ¾?¶§ String name, File file ???? ¸?°³º?¼?·? °¡??
		String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		FileInputStream fis = new FileInputStream (path +"\\" + "Ex_IOTest_1.java");
		System.out.println("fis >>> : "+fis);
		
		//read() : ???²?? ½ºÆ®¸²?? ?¤º¸???? ¹???Æ®·? ?Ð¾?????´?
		int data = fis.read();
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

			//¹???Æ® ´??§·? ?Ð?? ¶§, ¸? ³¡?? -1·? ??½???
			// ¸?³¡?? ¾Æ´?¶§ ±??? ¹?º¹??
			while ((data=fis.read())!= -1) {
				System.out.print((char)data);
			}//end of while¹®
	}

}
*/
