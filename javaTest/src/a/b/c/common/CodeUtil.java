package a.b.c.common;

//오라클에서 받은 정보를 원하는대로 보여주기 위한 유틸
//성별 , 직업 등 01, 02 등의 숫자로 받은 정보를  변환하는 유틸을 만듬
//추상클래스로 선언

//기본적인 형식
//지역변수 선언 및 디폴트값 초기화
//null값이 아니거나 입력된 값이 없지 않는지 확인
//equals(s)를 쓰거나 for로 하나하나 비교함

public abstract class CodeUtil {
	
	//취미 데이터 베이스
	//숫자 -> 취미로 바꿈
	//상수 배열로 선언
	static final String hVal[]= {"게임","음악감상","운동","독서","영화","명상"};
	
	//직업 데이터 베이스
	static final String jVal[]= {"회사원","자영업","학생","주부","무직","시인"};
	
	//생년월일
	//날짜를 형식에 맞추기 위해 정리함
	public static String birth(String s) {
		
		//지역변수 선언 및 디폴트 값으로 초기화
		String s0 = "";
		String s1 = "";
		String s2 = "";
		
		//생일에 값이 null이거나 아예 데이터가 없지 않다면 작동
		if(s!=null && s.length()>0) {
			
			//if에서 사용할 지역변수 선언
			int sLen = s.length();
			
			//8자리(YYYYMMDD) 라면 YYYY / MM / DD로 자름
			if(8 == sLen) {
				s0 = s.substring(0,4);
				s1 = s.substring(4,6);
				s2 = s.substring(6);
			}
			
		}
		return s0 + "-" + s1 + "-" + s2;
	}
	
	//성별
	//01 이면 여자 / 02면 남자로 표시하도록 함
	//equals를 통해서 같음을 표시 =지양
	public static String gender(String s) {
		
		//지역변수 선언
		String g = "";
		
		//null 이 아니거나 길이가 아예 없지 않는다면 진행
		if(s!=null && s.length() > 0) {
			//여자 아니면 남자임으로 if-else
			if ("01".equals(s)) {
				g = "여자";
			}else if("02".equals(s)) {
				g = "남자";
			}
			
		}
		
		return g;
	}
	
	public static String tel(String s) {
		String s0 = "";
		String s1 = "";
		String s2 = "";
		
		//null 값이거나 값이 아예 없는것 걸러냄
		if( s!=null && s.length() > 0) {
			
			//지역변수 선언
			int sLen = s.length();
			
			//번호가 10자리인 경우 00-0000-0000
			if (10 == sLen) {
				s0 = s.substring(0,2);
				s1 = s.substring(2,6);
				s2 = s.substring(7);
			}
			//번호가 11자리인 경우 000-0000-0000
			if (11 == sLen) {
				s0 = s.substring(0,3);
				s1 = s.substring(3,7);
				s2 = s.substring(7);
			}
			
		}
		return s0 + "-" + s1 + "-" + s2;
	}
	
	//핸드폰 번호
	public static String hp(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		//핸드폰은 11자리임으로 11자리로 고정
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				
				//return에서 받을 수도 있지만 미리 형태를 갖춰서 할 수도 있음
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}
	
	//취미 - 데이터베이스와 연동
	public static String hobby(String s) {
		
		String h = "";
		//null값이거나 길이가 아예 없는게 걸린 경우 배재
		if (s != null && s.length() > 0) {
			//맞는 취미가 나올때까지 for문으로 배열과 비교함
			for (int i = 1; i <6 ; i++) {
				//01 02 로 형식을 보정함
				if(("0"+i).equals(s)) {
					//오라클에서는 배열이 1부터 시작해 -1로 보정
					h = CodeUtil.hVal[i-1];
				}
			}
		}
		return h;
	}
	
	//직업 - 데이터 베이스오 연동
	public static String job(String s) {
		//지역변수 선언 및 디폴트 값으로 초기화
		String j = "";
		//null값이거나 데이터가 없는지 확인
		if(s!=null && s.length()>0) {
			//직업 데이터 베이스중 동일한걸 찾을 때까지 비교
			for(int i =1; i<6; i++) {
			if(("0"+i).equals(s)) {
				j = CodeUtil.jVal[i-1];
				}	
			}
		}
		return j;
	}
	
	//채번용 유틸
	//4자리 수가 되기 전까지 0을 앞에 붙임
	public static String numPad(String s) {
		int sLen = s.length();
		for(int i = sLen; i<4; i++) {
			s= "0"+s;
		}
		return s;
	}
	
	public static void main(String args[]) {
		//생년월일
		String b = CodeUtil.birth("20210801");
		System.out.println("b >>> " + b);
		
		// 전화번호
		String t = CodeUtil.tel("03212341234");		
		System.out.println("t >>> : " + t);
		
		// 핸드폰
		String hp = CodeUtil.hp("01012341234");		
		System.out.println("hp >>> : " + hp);		
		
		// 성별
		String g = CodeUtil.gender("02");
		System.out.println("g >>> : " + g);
		// 취미
		String h = CodeUtil.hobby("02");
		System.out.println("h >>> : " + h);
		// 직업
		String j = CodeUtil.job("02");
		System.out.println("j >>> : " + j);

		
	}

}
