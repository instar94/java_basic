package a.b.c.ch6;

//reflect.Method 를 이용해 함수를 이용할 수 있음
//생성자 / 필드/ 어노테이션 모두 가져 올 수 있음
//상태를 보거나 사용도 모두 가능함 
import java.lang.reflect.Method;

public class Ex_ClassName extends java.lang.Object{
	
	public void aM() {
		System.out.println("Ex_ClassName aM() 함수 시작 >>>> ");
		System.out.println("Ex_ClassName aM() 함수! ");
		System.out.println("Ex_ClassName aM() 함수 끝 >>>> ");
	}
	
	public void bM() {
		System.out.println("Ex_ClassName bM() 함수 시작 >>>> ");
		System.out.println("Ex_ClassName bM() 함수! ");
		System.out.println("Ex_ClassName bM() 함수 끝 >>>> ");
	}
	
	public void cM() {
		System.out.println("Ex_ClassName cM() 함수 시작 >>>> ");
		System.out.println("Ex_ClassName cM() 함수! ");
		System.out.println("Ex_ClassName cM() 함수 끝 >>>> ");
	}
	
	public void dM() {
		System.out.println("Ex_ClassName dM() 함수 시작 >>>> ");
		System.out.println("Ex_ClassName dM() 함수! ");
		System.out.println("Ex_ClassName dM() 함수 끝 >>>> ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ex_ClassName main 함수 시작 >>>> ");
		System.out.println("Ex_ClassName main 함수! ");
		
		//자식클래스 선언 자식클래스 참조변수 = new 자식클래스 생성자 선언()
		//부모클래스 선언 부모클래스 참조변수 = new 자식클래스 생성자 선언()
		//으로도 가능 
		//이 경우 부모클래스에서 자식클래스를 뽑아낼 수 있다.
		//Reference Casting 이라고 함
		// 부모 obj에서 자식클래스 Ex_ClassName을 꺼내놓으면
		//obj에서 Ex_ClassName을 캐스팅하고 객체형변환 한것임
		Object obj = new Ex_ClassName();
		System.out.println("부모클래스인 Objectobj 부모클래스참조변수" + obj);
		
		//단, 자바는 각 항 모두 동일해야하기 때문에 자료형은 같아져야함
		Ex_ClassName cn1 = (Ex_ClassName)obj;
		System.out.println("cn1 참조변수 >>> : " + cn1);
		System.out.println("cn1.getClass() >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() >>> : " + cn1.getClass().getName());
		
		
		Ex_ClassName en = new Ex_ClassName();
		System.out.println("en 참조 변수 >>> " + en);
		System.out.println("en.getClass() >>> " + en.getClass().getName());
		
		//thorws를 사용 할 수 없음
		//Class.forName을 이용해서 자원 사용 가능 (new, 상속 없이)
		//-> 휘발성 함수임 
		//단 미리 예외처리를 해놔야만 사용이 가능함 
		try {
		Class cc = Class.forName("a.b.c.ch6.Ex_ClassName");
		System.out.println("cc >>>> "+ cc);
		Ex_ClassName cc1= (Ex_ClassName)cc.newInstance();
		System.out.println("cc1 >>>> " + cc1);
		cc1.aM(); //<-new나 상속을 이용하지 않고 사용할 수 있음
		
		//클래스에 선언된 메소드를 찾기
		System.out.println("--------------------");
		Method m [] = cc.getDeclaredMethods();
		for (int i = 0; i<m.length; i++) {
			System.out.println(">>> : "+ m[i].toString());
			String findM = m[i].getName();
			System.out.println("m["+i+"].getName()"+findM);
		}
		System.out.println("--------------------");
		
		Class aList = Class.forName("java.util.ArrayList");
		java.util.ArrayList aList1 = (java.util.ArrayList)aList.newInstance();
		System.out.println("aList >>>> "+aList);
		
		Class d = Class.forName("java.util.Date");
		java.util.Date dd = (java.util.Date)d.newInstance();
		System.out.println("dd >>>> "+dd);
		
		}catch(Exception c) {
			System.out.println("c 에러 >>> "+c);
		}//end of try-catch
		
		System.out.println("Ex_ClassName main 함수 끝 >>>> ");
		}//end of main method 

}//end of Ex_ClassName class
