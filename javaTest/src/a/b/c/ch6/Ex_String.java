package a.b.c.ch6;

public class Ex_String {
	
	//파일을 이름과 확장자로 구분함
	//멤버변수 String 선언
	String orginFileName = "Hello.java";
	
	//void형 일반함수 strIndexOf 선언
	//일반함수 : 사용시 참조변수를 선언해야함
	public void strIndexOf() {
		System.out.println("strIndexOf 시작>>>>>>");
		
		//지역변수 + 참조 자료형 선언  -> 출력값 5
		String fullName = "Hello.java";
		//문자인 . 을 찾음 (싱글쿼테이션)
		int index = fullName.indexOf('.');
		//문자열인 .을 찾음 (더블쿼테이션) -> 출력값 : 5
		int index1 = fullName.indexOf(".");
		
		System.out.println("index >>>> "+index);
		System.out.println("index1 >>>> "+ index1);
		
		//파일의 이름을 뽑음
		//인덱스 0부터 .이 있는 인덱스 사이의 문자열을 뽑음
		String fileName = fullName.substring(0,index);
		System.out.println("fileName >>> : " + fileName);
		
		//확장자명 뽑음
		//.이 있는 인덱스 다음부터 끝까지 뽑아냄
		String extendstions = fullName.substring(index+1);
		System.out.println("extendstions >>>> : " + extendstions);
		
		if(orginFileName.equals(fullName)) {
			
			System.out.println("fullName>>>" + fullName);
			int index2 = fullName.indexOf('.');
			String fileName2 = fileName.substring(0, index2);
			System.out.println("fileName2>>>" + fileName2);
			
			String extendstions2 = fullName.substring(index2+1);
			System.out.println("extendstions2 >>>> : " + extendstions2);
			
			String fullName2 = fileName2 + "(1)" + "." + extendstions2;
			System.out.println("fullName2 >>> : "+fullName2);
		}
	}
	
	public void strLastIndexOf() {
		System.out.println("str LastIndex함수 시작 >>>>> : ");
		
		String fullName = "Hello00000.doc";
		
		int lastIndex = fullName.lastIndexOf('.');
		System.out.println("lastIndex >>> : " + lastIndex);
		
		String extenstions = fullName.substring(lastIndex+1);
		System.out.println("extenstions >>> : "+extenstions);
		
		if("doc".equals(extenstions)) {
			System.out.println("extenstions >>> : " + extenstions);
			System.out.println("ms doc MIME TYPE : application/msword");
		}
		
		System.out.println("str LastIndex함수 끝 >>>>> : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//public String substring(int beginIndex,int endIndex)
//Returns a string that is a substring of this string. 
//The substring begins at the specified beginIndex and extends 
//to the character at index endIndex - 
//1. Thus the length of the substring is endIndex-beginIndex.
		
		String s0 = "unhappy";
		System.out.println("s0.length >>>>> "+s0.length());
		
		//index 2번을 꺼내옴 -> 3번째 글자를 가져옴
		System.out.println("s0.charAt(2) >>> "+s0.charAt(2));

		//index 2번부터 문자를 출력함
		String s1 = s0.substring(2);
		System.out.println("s0.charAt(2) : s0.substring(2) >>> "+s1);
		
		//index 2번부터 5번까지 문자를 출력함
		String s2 = s0.substring(2, 5);
		System.out.println("index 2~5번까지 >>> " +s2);
		
		Ex_String exs = new Ex_String();
		exs.strIndexOf();
		exs.strLastIndexOf();
		
	}//end of main method
}//end of Ex_String class
