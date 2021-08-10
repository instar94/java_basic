package a.b.c.ch6;

public class Ex_Exception_3 {
	
	//iVal은 aM함수의 매개변수
	//int iVal = iArr
	//iArr과 iVal의 주소값이 동일함
	
	//main함수가 아닌곳에서도 try-catch가능하지만 
	//어디서 에러가 낫는지 모를 수도 있다
	//main함수로 throws를 사용함
	//단 main함수에서는 throw를 사용할 수 없음
	//public void aM(int[] iVal)throws java.lang.ArrayIndexOutOfBoundsException
	//로 쓰나 현재는 최상위인 Exception만 쓴다
	//throw Exception
	public void aM(int[] iVal)throws Exception{
		System.out.println("aM() 시작 >>>> ");
		System.out.println("iVal >>>> "+iVal);
		System.out.println("iVal.length"+iVal.length);
	
		//for문을 이용해 iVal의 구성요소를 가져옴
		//<=때문에 에러가 발생함
		for (int i =0 ; i <=iVal.length;i++) {
			iVal[i]=i;
			System.out.println("iVal["+i+"] >>> " + iVal[i]);
		}
		//throws를 했기때문에 aM이 
		System.out.println("aM() 끝 >>>> ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iArr = 지역변수이면서 참조변수임
		System.out.println("Ex_Exception_2.main() 시작 >>>> ");
		int[] iArr = new int[5];
		System.out.println("iArr >>>> " + iArr);
		
		// java.lang.ArrayIndexOutOfBoundsException
		try {
		Ex_Exception_3 ex3 = new Ex_Exception_3();
		//iArr을 아규먼트로 가져감 : aM함수의
		ex3.aM(iArr);
		
		}catch (Exception e) {
			System.out.println("e>>>> " + e);
		}//end of try-catch 구문
		System.out.println("Ex_Exception_2.main() 끝 >>>> ");
	}//end of main method
}//end of Ex_Exception_2 class
