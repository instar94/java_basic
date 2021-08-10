package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_String_1 {
	
	public static String mNum(String nCnt) {
		int nn = nCnt.length();
		
		//0을 넣어주는 for문
		//1자리수면 3개 - 2자리수면 2개 - 1자리수면 1개
		for(int i= nn; i<4; i++) {
			nCnt="0"+nCnt;
		}//end of for문
		
		return nCnt;
	}//end of mNum 함수 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_String_1. main 함수 시작>>>" );
		
		//회원번호 만들기
		//규칙 : 년월일 + 시퀀스(####)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d>>>> : " + d);
		
		String mnum = "";
		String nCnt = "";
		
		for (int i = 1 ; i<10; i++) {
			nCnt = String.valueOf(i);
			
			mnum = d + Ex_String_1.mNum(nCnt);
			
			System.out.println("mnum >>> : " + mnum);
		}//end of 회원만들기 for 문
		System.out.println("Ex_String_1. main 함수 끝>>>" );
	}//end of main method
}//end of Ex_String_1
