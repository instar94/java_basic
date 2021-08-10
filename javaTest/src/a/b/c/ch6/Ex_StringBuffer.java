package a.b.c.ch6;

public class Ex_StringBuffer {

//	1. StringBuffer와 String은 모두 다른 객체임
//	2. 상호간 데이터를 사용시 형변환이 필요함
//	3. 문자열의 불변성을 가지고 있지 않음 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StringBuffer sb = new StringBuffer("java");
			System.out.println("sb >>>> " + sb);
			System.out.println("sb >>>> " + System.identityHashCode(sb));
			
			//append : StringBuffer에 문자열을 추가로 넣음
			sb.append(" and");
			sb.append(" android");
			sb.append(" programming is fun");
			System.out.println("sb >>>> "+sb);
			System.out.println("sb >>>> " + System.identityHashCode(sb));
			
			//StringBuffer와 String은 다르기때문에 형변환 필수
			String str = sb.toString();
			System.out.println("str>>>> "+str);
			System.out.println("str >>>> " + System.identityHashCode(str));
			
			String str1 = str + "\n String class의 불변성 이해!";
			System.out.println("str1 >>> " + str1);
			System.out.println("str >>>> " + System.identityHashCode(str1));
	}

}
