package a.b.c.ch5;

public class Ex_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 문자와 숫자의 변환
		//사용금지
		//숫자 -> 문자
		//+로 인해 문자열이됨 -> 사용 지양
		String s0 = 1 + ""; //+로 인해 문자열로 바뀜
		System.out.println("s0>>>>> "+s0);
		
		//지향
		//String.valueof() : int형은 String 형으로 변환함
		String s1 =String.valueOf(1);
		System.out.println("s1>>>>> "+s1);
		
		//Integer.toString
		//Int형을 String 형으로 변환함
		String s2 = Integer.toString(1);
		System.out.println("s2>>>>> "+s2);
		
		//parseInt() : 문자 숫자를 숫자로 바꾸는 함수
		//문자를 Int형으로 변경한다
		int i0 = Integer.parseInt("1");
		System.out.println("i0>>>>> "+i0);
		
		//배열에 있는 문자열을 int형으로 형변환
		String sval[] = {"010","111","222"};
		//배열은 문자열이고, 변수는 int형임
		//형변환이 필요함
		//int sval0 에서는 정수형임
		int sval0 = Integer.parseInt(sval[0]);
		//sval0에서는 문자 (println에서 toString이 됨)
		System.out.println("sval0>>>"+ sval0);
		
		int sval1 = Integer.parseInt(sval[1]);
		System.out.println("sval1>>>"+ sval1);
		
		int sval2 = Integer.parseInt(sval[2]);
		System.out.println("sval2>>>"+ sval2);
		
		//위의 과정을 아래와 같이 for문으로 대체 할 수도 있다.
		
		for (int i = 0; i < sval.length ; i++) {
			System.out.println(Integer.parseInt(sval[i]));
			
				int iv = Integer.parseInt(sval[i]);
			
				System.out.println("iv>>>>>" + iv);
			
		}//end of for flow 
		
	}//end of main method

}//end of Ex_String_3 Class
