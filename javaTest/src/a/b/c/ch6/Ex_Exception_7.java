package a.b.c.ch6;

public class Ex_Exception_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Exception("오류메세지");
			//Exception e = new Exception("오류메세지//
			//throw e;
		}catch(Exception e) {
			System.out.println("e >>>> "+e.getMessage());
		}
		System.out.println("try-catch 블럭이후 >>> ");
	}
}
