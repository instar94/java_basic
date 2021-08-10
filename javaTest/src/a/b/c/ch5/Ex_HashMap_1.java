package a.b.c.ch5;

//ArrayList와 HashMap을 사용하기 위해 import
import java.util.ArrayList;
import java.util.HashMap;

//VO가 없을 때 사용 하는 방법

public class Ex_HashMap_1 {

	//ArrayList 함수 선언 => return이 있음
	public ArrayList hashMap() {
		
		//HashMap을 통해서 각각 정보를 받아옴
		HashMap hm0 = new HashMap();
		hm0.put("이름","배동민");
		hm0.put("나이","28");
		hm0.put("주소","인천시 서구");
		
		HashMap hm1 = new HashMap();
		hm1.put("이름","동민");
		hm1.put("나이","27");
		hm1.put("주소","인천시 동구");
		
		HashMap hm2 = new HashMap();
		hm2.put("이름","동배");
		hm2.put("나이","26");
		hm2.put("주소","인천시 남구");
		
		//ArrayList에 각 해쉬맵의 주소값을 담음
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		//ArrayList를 리턴함
		return aList;
		
	}//end of hashMap method
	
	//제너릭 이용 : String과 String 데이터만을 이용함
	public ArrayList<HashMap<String, String>> hasMapGeneric(){
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("이름","민동배");
		hm0.put("나이","28");
		hm0.put("주소","인천시 서구");
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("이름","민동");
		hm1.put("나이","27");
		hm1.put("주소","인천시 미추홀구");
		
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("이름","동배");
		hm2.put("나이","26");
		hm2.put("주소","인천시 청라");
		
		ArrayList<HashMap<String, String>> aList =
				new ArrayList<HashMap<String, String>>();
		
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		return aList;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		Ex_HashMap_1 ex1 = new Ex_HashMap_1();
		ArrayList aList = ex1.hashMap();
		System.out.println("aList.size() >>>>> " + aList.size());
		
		for(int i = 0 ; i < aList.size(); i++) {
			HashMap hm = (HashMap)aList.get(i);
			
			//name
			Object obj1 = hm.get("이름");
			String name1 = (String)obj1;
			System.out.print("이름 >>> " + name1);

			//age
			Object obj2 = hm.get("나이");
			String age1 = String.valueOf(hm.get("나이"));
			System.out.print("  나이 >>>> "+age1);

			//add
			Object obj3 = hm.get("주소");
			String add1 = hm.get("주소").toString();
			System.out.println("  주소 >>>>  "+ add1);
			
		}//end of for 문

		ArrayList<HashMap<String, String>> aList1 = ex1.hasMapGeneric();
		System.out.println("aList1.size >>> "+aList.size());
		
		for(int i = 0 ; i < aList1.size(); i++) {
			//위와 달리 캐스팅을 사용하지 않음
			HashMap<String, String> hm = aList1.get(i);
			
			//name
			Object obj1 = hm.get("이름");
			String name1 = (String)obj1;
			System.out.print("이름 >>> " + name1);

			//age
			Object obj2 = hm.get("나이");
			String age1 = String.valueOf(hm.get("나이"));
			System.out.print("  나이 >>>> "+age1);

			//add
			Object obj3 = hm.get("주소");
			String add1 = hm.get("주소").toString();
			System.out.println("  주소 >>>>  "+ add1);
			
		}//end of for 문		
		
		
	}//end of main method

}//end of Ex_HashMap_1 class
