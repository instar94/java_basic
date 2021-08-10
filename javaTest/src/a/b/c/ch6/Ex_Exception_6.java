package a.b.c.ch6;

public class Ex_Exception_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//나누기 오류 : 1/0같이 결과값이 안나올때
		//숫자대신 다른값을 넣었을때
		//명령행 인수를 이용할 것임
		int argsL = args.length;
		
		if (2==argsL) {
			String sX = args[0];
			System.out.println("입력한 값은 >> " + sX);
			String sY = args[1];
			System.out.println("입력한 값은 >> " + sY);
			
			try {
			//명령행 인수로 배열로 받음-> 문자열임
			int x = Integer.parseInt(sX);
			int y = Integer.parseInt(sY);
			int z =x / y;
			System.out.println(x+"/"+y+"= "+z);
			//}catch(NumberFormationException n) { <-현대 코드는 이렇게 안씀
			//NumberFormationException : 숫자대신 다른걸 썼을때 나오는 에러
			//n은 Exception클래스의 참조변수임
			}catch(Exception n) {
				System.out.println("에러 n.getMessage()>>> "+ n.getMessage());
				}//end of try catch
			}else {
			System.out.println("데이터 값을 입력해주세요");	
		}//end of if-else문
	}//end of main method
}//end of Ex_Exception_6 class