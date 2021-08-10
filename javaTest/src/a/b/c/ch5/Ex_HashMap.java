package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
//HashMap은 속도가 빠르나 대신 데이터를 많이 잡아먹는다 <-최근 D램값이 떨어져서 자주 사용
//단 순서를 보장하지 않는다.
// JDK 1.5버전부터 K와 V가 붙기 시작 
public class Ex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*제너릭의 타입
		 * 제너릭에서 선언한 Object의 역할 타입
		 * JDK 1.5부터 적용됨
		<T> : Type : 
		<E> : Element
		<K> : key
		<V> : Value
		<N> : Number
		
		//첫번째 오는 값 키값
		 * 두번째 오는 값은 리턴값
		 * 키값을 받아서 값을 리턴하는 것임
		public V put(K key, Value) <- JKD 1.8
		puvlic Object put (Object key, Object value)<-JDK 1.4
		
		public V get(Object key)<-JDK 1.4
		public V get(K key, Value) <- JDK 1.8
		
		1.8버전이 좀더 직관적임 
		put함수의 return은  Object임
		get함수
		*/
		
		//콘솔값 [] + 주소값
		ArrayList alist = new ArrayList();//[] : 배열
		System.out.println("alist >>> : " + alist);
		System.out.println("alist >>> : " + System.identityHashCode(alist));
		
		//콘솔값 {} + 주소값
		HashMap hp = new HashMap(); // {} : 배열 아님
		System.out.println("hp >>>>> : "+hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));

		//add 대신 put을 넣는다.
		hp.put("이름","배동민");
		System.out.println("hp >>>>>> " + hp);
		
		//데이터타입 상관 없음
		hp.put("나이",28);
		System.out.println("hp >>>>>> " + hp);
		
		//순서를 보장하지 않음
		hp.put('a',"동민");
		System.out.println("hp >>>>>> " + hp);
		
		hp.put('이','e');
		System.out.println("hp >>>>>> " + hp);
		System.out.println("hp.size >>>>>> " + hp.size());
		
		//동일한 key를 가지면 나중에 입력된 것으로 value로 고친다
		hp.put('이',2);
		System.out.println("hp >>>>>> " + hp);
		System.out.println("hp.size >>>>>> " + hp.size());
		
		//HashMap에 저장된 값은 모두 객체가 된다
		//HashMap에서 꺼낼때는 데이터로 원래형태로 형변환해야함
		// = value 의 리턴형을 가진다 
		//String s0 = hp.get("이름");
		
		//객체이기 때문에 Object로 받음 
		//?? 이 Object는 어디서 왔는가??
		Object obj0 = hp.get("이름");
		
		//캐스팅 연산자()를 이용해 String 형으로 형변환 시킴
		String s0 = (String)obj0; //hp.put("이름", "배동민") <- String이어야함
		
		//데이터를 숫자/문자로 바꾸는것과 동일하게감 
		//get으로 이름에 해당하는 주소값을 가져온 뒤 to.String()을 통해 String으로 형 변환 시킴
		String s0_1 = hp.get("이름").toString();
		//get으로 이름에 해당하는 주소값을 가져온 뒤 String클래스의 
		//valueOf을 통해 String으로 형 변환 시킴
		String s0_2 = String.valueOf(hp.get("이름"));
		//그냥 키값을 뽑고 + 를 이용해서 String으로 만듬
		String s0_3 = hp.get("이름")+"";
		
		System.out.println("obj0 >>> : " + obj0);
		System.out.println("s0 >>> : " + s0);
		System.out.println("s0_1 >>> : " + s0_1);
		System.out.println("s0_2 >>> : " + s0_2);
		System.out.println("s0_3 >>> : " + s0_3);	
		
		//String s0 = hp.get("이름");
		Object obj1 = hp.get("나이");
		Integer s1 = (Integer)obj1;
		String s1_1 = hp.get("나이").toString();
		String s1_2 = String.valueOf(hp.get("나이"));
		String s1_3 = hp.get("나이")+"";
		
		System.out.println("obj1 >>> : " + obj1);
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1_1 >>> : " + s1_1);
		System.out.println("s2_2 >>> : " + s1_2);
		System.out.println("s3_3 >>> : " + s1_3);	

		//hp.put('a',"동민"); <-리턴형 String 
		
		// String s2 = hp.get('a');
		Object obj2 = hp.get('a');
		String s2 = (String)obj2;
		String s2_1 = hp.get('a').toString();
		String s2_2 = String.valueOf(hp.get('a'));
		String s2_3 = hp.get('a')+"";
		
		System.out.println("obj2 >>> : " + obj2);
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2_1 >>> : " + s2_1);
		System.out.println("s2_2 >>> : " + s2_2);
		System.out.println("s2_3 >>> : " + s2_3);	
		
		Object obj3 = hp.get('이');
		Integer s3 = (Integer)obj3;
		String s3_1 = hp.get('이').toString();
		String s3_2 = String.valueOf(hp.get('이'));
		String s3_3 = hp.get('이')+"";
		
		System.out.println("obj3 >>> : " + obj3);
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3_1 >>> : " + s3_1);
		System.out.println("s3_2 >>> : " + s3_2);
		System.out.println("s3_3 >>> : " + s3_3);
		
	}//end of main method
}//end of Ex_HashMap class
