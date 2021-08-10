package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_2 {
	/*
	url : Uniform Resource Locator : web address : 파일식별자, 유일자원지시기				 
	uri : Uniform Resource Identifier : 인터넷에 있는 자원을 나타내는 유일한 자원

	uri > url : 

	http://도메인:포트/경로/패스?key=value&page=12

	url : http://도메인:포트/경로/패스 
	uri : http://도메인:포트/경로/패스?key=value&page=12

	http 프로토콜이 url을 요청하는 방법
	- post 방식 : http://도메인:포트/경로/파일명.확장자
	- get 방식 :  http://도메인:포트/경로/파일명.확장자?key=value&key&value
					url에 ?꼬리표가 있는 것

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용할 변수 선언
		String urlStr = "https"		//프로토콜
				+"://"				//프로코콜과 경로구분자
				+"nid.naver.com"	//ip 혹은 도메인
			  //+":"				//ip 혹은 도메일 구분자
			  //+"8080"				//포트
				+"/nidlogin.login"	//웹서버 경로 
									//nidlogin.login : 요청한 실제 파일명
				+"?"				//웹서버 경로 혹은 Query String : key=value
				+"&"				//쿼리스트링 구분자
				+"url=https%3A%2F%2Fwww.naver.com"; // Query String : key=value
		//try-catch 구문
		 try {
			 //URL을 참조변수로 선언하고 아규먼트로 urlStr로 씀
			 URL ur = new URL(urlStr);
			 //ur : 전체 주소
			 System.out.println("ur >>> "+ ur);
			 //프로토콜 : https
			 System.out.println("ur.getProtocol >>> "+ ur.getProtocol());
			 //도메인 or ip : nid.naver.com
			 System.out.println("ur.getHost >>> "+ ur.getHost());
			 //포트
			 System.out.println("ur.getPort >>> "+ ur.getPort());
			 //경로 :  /nidlogin.login
			 System.out.println("ur.getPath >>> "+ ur.getPath());
			 //쿼리스트링 : &url=https%3A%2F%2Fwww.naver.com
			 System.out.println("ur.getQuery() >>> "+ ur.getQuery());
			 //파일명을 가져옴 : /nidlogin.login?&url=https%3A%2F%2Fwww.naver.com
			 System.out.println("ur.getFile >>> "+ ur.getFile());
			 
			 //오픈스트림: sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@4566e5bd
			 System.out.println("ur.openStrema() >>> "+ur.openStream());

			 //객체오픈
			 //웹크롤링을 위해 버퍼로 in해야함
			 //in을 위한  BuffeReader new로 인스턴스
			 //아규먼트로 inputStreamReader로 만든 url 로함
			 BufferedReader br = new BufferedReader(
					 			 new InputStreamReader(ur.openStream(),"UTF-8"));
			 //주소값 한번 찍음
			 System.out.println("br>>>> "+br);
			 
			 //지역변수 선언 및 초기화
			 String inLine="";
			 
			 //읽는 과정 시작
			 //while을 이용해 읽기 시작하고
			 //println 함수를 통해 콘솔에 출력함 
			 while ((inLine=br.readLine())!=null) {
				 System.out.println(inLine);
			 }
			 //객체 닫기
			 br.close();
			 
			 //오류시 Exception 잡아줌
		 }catch(Exception e){
			 System.out.println("에러 발생 "+ e.getMessage());
		}
	}
}
