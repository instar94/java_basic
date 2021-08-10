package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileWriter;
import java.io.BufferedWriter;

import a.b.c.common.FilePath;

//네이버 HTML 긁어오기

public class Ex_URL_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용할 객체 초기화
		String filePath = FilePath.FILE_PATH_CH8;
		String path = filePath + "/"+"index.html";
		String urlStr = "https://www.naver.com";
		
		try {
			//URL에 urlStr을 넣고 , ur로 선언함
			URL ur = new URL(urlStr);
			System.out.println("ur>>>> "+ur);
			//openStream " 외부에서 내용을 받아 옴 
			System.out.println("ur.openStream() >>>> "+ur.openStream());
			
			//버퍼리더로 선언함 -> 객체열음
			//버퍼리더의 아규먼트로 InputStreamReader로 openStrema 읽온 것 사용
			BufferedReader br = new BufferedReader(
								new InputStreamReader(ur.openStream()));
			
			//버퍼라이터의 아규먼트로 path에 파일라이터로
			//파일라이터는 새로만들 파일 이름을 아규먼트로 가짐
			BufferedWriter bw = new BufferedWriter(
								new FileWriter(path));
		
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
			bw.write(inLine);
		}
		//버퍼 수동 작동
		bw.flush();
		
		//객체닫기
		bw.close();
		br.close();
		
		}catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
		
	}

}
