package a.b.c.ch6;

//사용자지정 예외클래스
//Excetion 클래스를 상속받아옴
//throws : 예외처리 미루기 -> 호출함수의 예외 던지기 -> main에서 throws를 사용 할 수 없다
//throw 키워드 : 사용자 정의 예외
class IDFormatException extends Exception{
	
	//생성자
	public IDFormatException(String s) {
		//Exception의 s를 가져옴
		super(s);
	}//end of IDFormatException(String s) 생성자
}//end of IDFormatException class

//지역변수로 선언되는 userID를 저장할 수 있는 함수를 만듬
class IDFormatTest{
	private String userID;
	
	public String getUserID(){
		return userID;
	}//end of getUserID method

//throws :  예외처리를 미뤄버림
	//null값일 때와 8~20자 사이가 아닐때 throw해버림
	//throw는 사용자 정의 예외
public void setUserID(String userID) throws IDFormatException{

	if(userID == null) {
		IDFormatException ide = new IDFormatException("아이디는 null일 수 없습니다.");
		throw ide;
	}else if (userID.length()<8|| userID.length()>20) {
		throw new IDFormatException("아이디를 8~20자 사이로 작성해주세요");
	}
		this.userID = userID;
	}

}//end of IDFormatTest class

public class Ex_Exception_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDFormatTest idt = new IDFormatTest();
		
		//userID라는 지역변수 + 문자열을 선언후 디폴트 값으로 선언
		String userID = null;
		
		//받은 값을 IDFormatTest로 set함
		//set한 값은 this를 통해 해당 클래스에 저장됨
		//현재 userID는 null 값임
		//에러 발
		try {
			idt.setUserID(userID); 
		}catch(IDFormatException i) {
			System.out.println("i 에러 >> "+i);
		}//end of try-catch문
		
		//userID를 7자미만으로 설정함
		userID = "1234567";
		
		//IDFormatException의 setUser함수에 userID(1234567)를 넣음
		//elseif 조건에 걸림 -> 8~20자사이가 아님
		//오류가 발생함 
		//catch문으로 가버림
		//catch문에서 i 에러 발동 ->사용자 정의예외가 발동함
		try {
			idt.setUserID(userID);
		
		}catch(IDFormatException i) {
			System.out.println("i 에러 >>> "+i);
		}//end of try-catch문
		System.out.println("try-catch블럭 이후 >>>>");
	}//end of main method
}//end of Ex_Exception_8

