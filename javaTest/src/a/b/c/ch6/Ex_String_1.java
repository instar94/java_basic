package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_String_1 {
	
	public static String mNum(String nCnt) {
		int nn = nCnt.length();
		
		//0�� �־��ִ� for��
		//1�ڸ����� 3�� - 2�ڸ����� 2�� - 1�ڸ����� 1��
		for(int i= nn; i<4; i++) {
			nCnt="0"+nCnt;
		}//end of for��
		
		return nCnt;
	}//end of mNum �Լ� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_String_1. main �Լ� ����>>>" );
		
		//ȸ����ȣ �����
		//��Ģ : ����� + ������(####)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d>>>> : " + d);
		
		String mnum = "";
		String nCnt = "";
		
		for (int i = 1 ; i<10; i++) {
			nCnt = String.valueOf(i);
			
			mnum = d + Ex_String_1.mNum(nCnt);
			
			System.out.println("mnum >>> : " + mnum);
		}//end of ȸ������� for ��
		System.out.println("Ex_String_1. main �Լ� ��>>>" );
	}//end of main method
}//end of Ex_String_1
