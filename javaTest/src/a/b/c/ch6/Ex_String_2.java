package a.b.c.ch6;

import java.util.StringTokenizer;
//split�� Tokenizer : ���ڿ� �迭�� ������
//�Է��� ���� �������� �����͸� ���� �� ����
// ex ) #�� �������� �ڸ���  1# 234 #56 -> 1 / 234/ 56

public class Ex_String_2 {
	
	public void charSplit(String sVal) {
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);
		
		if(sVal != null && sVal.length()>0) {
			String sChar[] = sVal.split("@");
			
			for (int i=0; i <sChar.length; i++) {
				System.out.println("sChar["+i+"] >>> " + sChar[i]);
			}//end of for��
		}//end of if��
	}//end of charSplit method
	
	public void charToken(String sVal) {
		System.out.println("charToken(String sVal) sVal >>> : " + sVal);
		
		if(sVal != null && sVal.length()>0) {
			
			StringTokenizer st = new StringTokenizer(sVal, "@^|");
		
			while (st.hasMoreTokens()) {
				System.out.println(">>> : "+st.nextToken());
			}//end of while��
		}//end of if ��
	}//end of charToken method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sVal = "a b^c,d ef,g|h^i,jk|l,m^no";
		System.out.println("sVal >>> " + sVal);
		
		sVal = sVal.replace(',', '@');
		System.out.println("sVal >>> " + sVal);
		
		Ex_String_2 ex2 = new Ex_String_2();
		ex2.charSplit(sVal);
		ex2.charToken(sVal);
	}//end of main method
}//end of Ex_String_2 class
