package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//네이버 HTML 긁어오기

public class Ex_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용할 객체 초기화
		String urlStr = "https://www.naver.com";
		
		try {
			//URL에 urlStr을 넣고 , ur로 선언함
			URL ur = new URL(urlStr);
			System.out.println("ur>>>> "+ur);
			//openStream " 외부에서 내용을 받아 옴 
			System.out.println("ur.openStream() >>>> "+ur.openStream());
			
			//버퍼리더로 선언함 -> 객체열음
			BufferedReader br = new BufferedReader(new InputStreamReader(ur.openStream()));
			
		//인코딩 타입
			// UTF-8
			//EUC-KR
			//IOS - 8859-1
		System.out.println("br >>> "+br);
		
		//지역변수 초기화
		String inLine = "";
		//read를 통해 읽어들이고 콘솔에 프린트 해줌
		while((inLine=br.readLine())!=null) {
			System.out.println(inLine);
		}
		//객체닫기
		br.close();
		}catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
		
	}

}
