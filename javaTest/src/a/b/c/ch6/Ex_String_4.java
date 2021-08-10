package a.b.c.ch6;

public class Ex_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sVal = "Hell Java Testing !!";
		//sval에 Hello가 있는 지 확인
		boolean bool = sVal.contains("Hello");
		System.out.println("bool >>> " + bool);
		
		String sVal1 = "학교종이 땡땡땡 어서모이자";
		bool = sVal1.contains("학교종");
		System.out.println("bool >>> " + bool);
		bool = sVal1.contains("땡땡땡");
		System.out.println("bool >>> " + bool);
		
		//compareTo()
		//리턴값은 0/음수/양수 int
		//0 : 동일한 ㄱ밧
		//양수 : compareTo()가 호출한 객체가 인자보다 앞임
		//음수 : 뒤임
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "World";
		System.out.println("s1.compareTo(s2)>>>>"+s1.compareTo(s2));
		System.out.println("s1.compareTo(s3)>>>>"+s1.compareTo(s3));
		System.out.println("s1.compareTo(s1)>>>>"+s3.compareTo(s1));
	}

}
