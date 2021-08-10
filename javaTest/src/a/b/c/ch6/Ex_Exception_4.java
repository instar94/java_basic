package a.b.c.ch6;

public class Ex_Exception_4 {

	public void aM() throws Exception{
		System.out.println("aM함수 시작 >>> ");
		System.out.println("aM()");
		bM();
		System.out.println("aM함수 끝 >>> ");
	}//end of aM()method
	
	public void bM() throws Exception{
		System.out.println("bM함수 시작 >>> ");
		System.out.println("bM()");
		
		//에러가 발생함
		//ArrayIndexOutOfBoundsException
		int[] iVal = new int[5];
		
		for (int i =0; i<= iVal.length; i++) {
			iVal[i]=i;
			System.out.println("iVal["+i+"] >>> "+iVal);
		}//end of for문
		
		String msg = cM();
		System.out.println("bM함수 끝 >>> ");
	}//end of bM() metohd
	
	public String cM() throws Exception{
		System.out.println("cM함수 시작 >>> ");
		System.out.println("cM()");
		
		String msg = dM();
		System.out.println("cM() msg >>>> : " + msg);
		
		System.out.println("cM함수 끝 >>> ");
		
		return "cM() 함수에서 예외 테스트중 ";
	}
	
	public String dM() throws Exception {
		System.out.println("dM함수 시작 >>> ");
		System.out.println("dM()");
		
		int x = 1;
		int y = 0;
		//에러 발생함 : ArithmeticException a
		int z = x/y;
		
		System.out.println("z>>> :" + z);
		System.out.println("dM함수 끝 >>> ");
		
		return "dM() 함수에서 예외 테스트중";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main 함수 시작 >>>> ");
		
		try {
			Ex_Exception_4 ex4 = new Ex_Exception_4();
			System.out.println("ex4 참조변수 >>> "+ex4);
			ex4.aM();
		}catch (Exception e) {
			System.out.println("e>>> : "+e);
		}
		
		System.out.print("main 함수 끝 ");
	}

}
