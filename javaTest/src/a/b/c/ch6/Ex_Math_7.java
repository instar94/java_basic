 package a.b.c.ch6;

 //임시 비밀번호 만들기
 //자바에서 제공하는 비밀번호 난수 생성 클래스
 /*
	 * 자바 중복되지 않는 고유 키 
	 * UUID(Universally unique identifier)
	 * 숫자와 영어(소문자)만을 조합하여 임시비밀번호 생성
	 * 32개 문자 + '-' = 36개	   
	 */
 
 import java.util.UUID;
 
public class Ex_Math_7 { //★★★★


	//UUID를 이용한 임시비밀번호 만들기
	//len짜리 길이의 번호가 만들어짐
	public static String tempPW(int len){
		// UUID에서 난수를 받아온 뒤 String으로 형변환 시킴
		//그리고 String u라는 지역변수에 초기화
		String u =UUID.randomUUID().toString();
		System.out.println("u>>> " + u);
		
		//-가 들어가는건 전부 삭제
		u=u.replace("-", "").substring(0,len);
		
		System.out.println("u >>>> " + u);
		
		return u;
	}//end of tempPW method
	
	//문자를 미리 주고 그중에서 랜덤으로 고르기
	public static String randomPw(int len) {
		char c[] = {
				'1','2','3','4','5','6','7','8','9','0', 
				'A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z', 
				'a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t',
				'u','v','w','x','y','z',
				'!','@','#','&'
				//'!','@','#','$','%','^','&','*','(',')'
    	}; 
	
	String p ="";

		//len만큼 길이의 비번을 만들 것임
		for (int i=0; i<len; i++) {
			//랜덤 난수를 뽑고 c의 길이를 골라 c 구성요소 수만큼의 값만 나오게함
			//그 난수번째에 해당하는 구성요소를 부름
			int a =(int)(Math.random()*(c.length));
			//그걸 계속 String p에 더해놓음
			p+= c[a];
		}
	return p;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8글자 짜리 비번
		String s1 = Ex_Math_7.tempPW(8);
		String s2 = Ex_Math_7.randomPw(8);
		
		System.out.println("UUID >>> " + s1);
		System.out.println("random >>> " + s2);
	}//end of main method
}//end of Ex_Math_7 class

