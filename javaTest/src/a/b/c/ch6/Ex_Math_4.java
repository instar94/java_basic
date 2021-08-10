package a.b.c.ch6;

public class Ex_Math_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_Math_4.main >>> 시작");
		
		//String형 지역변수 n0선언후 디폴트 값으로 초기화
		String n0 = "";
		String n1 = "";
		
		
		for (int n=0; n<5; n++) {
			//int형 배열 lo 선언후, 구성요소가 6개
			int lo[] = new int[6];
			
			//lo배열에다가 1~45사이의 난수를 집어 넣음
			for (int i=0; i<lo.length; i++) {
				lo[i] = (int)(Math.random()*45)+1;
				
				//동일한 숫자가 나오지 않도록 지워버림
				//j는 i의 모든 숫자를 검수함
				//break를 통해 멈춤
				for(int j=0; j< i; j++) {
					if(lo[j]==lo[i]) {
						i--;
						break;
					}//end of if문
				}//end of j for문
			}//end of i for문
			
			//배열을 채운뒤 n1를 lo의 구성요소로 채우고 String형으로 형변환
			for (int i=0; i<lo.length; i++) {
				
				if(lo[0]==lo[i]) {
					n1 = String.valueOf(lo[i]);
					if (1==n1.length()) {
						n1= "0" +n1;
					}//end of if문
					n0= "자 동"+n1;
	
				}else {
					//배열을 채운뒤 n0를 lo의 구성요소로 채우고 String형으로 형변환
					n0=String.valueOf(lo[i]);
					//n0는 언제나 길이가 1임
					//숫자의 형식을 0XX 이런식으로 만듬
					if (1==n0.length()) {
						n0= "0" +n0;
					}//end of if문
				}//end of if - else문
				
				
				
				
				//다시한번 문자열로 만들고 값을 출력함
				System.out.print(n0+" ");
				
				
				n0+=" ";
				System.out.print(n0);
			}//end of i for문
			//한줄 띄우기
			System.out.println();
		}//end of n for 문
		System.out.println("Ex_Math_4.main >>> 끝");
	}//end of main method
}//end of Ex_Math_4 클래스
