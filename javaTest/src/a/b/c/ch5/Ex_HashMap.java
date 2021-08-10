package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
//HashMap�� �ӵ��� ������ ��� �����͸� ���� ��ƸԴ´� <-�ֱ� D������ �������� ���� ���
//�� ������ �������� �ʴ´�.
// JDK 1.5�������� K�� V�� �ٱ� ���� 
public class Ex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*���ʸ��� Ÿ��
		 * ���ʸ����� ������ Object�� ���� Ÿ��
		 * JDK 1.5���� �����
		<T> : Type : 
		<E> : Element
		<K> : key
		<V> : Value
		<N> : Number
		
		//ù��° ���� �� Ű��
		 * �ι�° ���� ���� ���ϰ�
		 * Ű���� �޾Ƽ� ���� �����ϴ� ����
		public V put(K key, Value) <- JKD 1.8
		puvlic Object put (Object key, Object value)<-JDK 1.4
		
		public V get(Object key)<-JDK 1.4
		public V get(K key, Value) <- JDK 1.8
		
		1.8������ ���� �������� 
		put�Լ��� return��  Object��
		get�Լ�
		*/
		
		//�ְܼ� [] + �ּҰ�
		ArrayList alist = new ArrayList();//[] : �迭
		System.out.println("alist >>> : " + alist);
		System.out.println("alist >>> : " + System.identityHashCode(alist));
		
		//�ְܼ� {} + �ּҰ�
		HashMap hp = new HashMap(); // {} : �迭 �ƴ�
		System.out.println("hp >>>>> : "+hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));

		//add ��� put�� �ִ´�.
		hp.put("�̸�","�赿��");
		System.out.println("hp >>>>>> " + hp);
		
		//������Ÿ�� ��� ����
		hp.put("����",28);
		System.out.println("hp >>>>>> " + hp);
		
		//������ �������� ����
		hp.put('a',"����");
		System.out.println("hp >>>>>> " + hp);
		
		hp.put('��','e');
		System.out.println("hp >>>>>> " + hp);
		System.out.println("hp.size >>>>>> " + hp.size());
		
		//������ key�� ������ ���߿� �Էµ� ������ value�� ��ģ��
		hp.put('��',2);
		System.out.println("hp >>>>>> " + hp);
		System.out.println("hp.size >>>>>> " + hp.size());
		
		//HashMap�� ����� ���� ��� ��ü�� �ȴ�
		//HashMap���� �������� �����ͷ� �������·� ����ȯ�ؾ���
		// = value �� �������� ������ 
		//String s0 = hp.get("�̸�");
		
		//��ü�̱� ������ Object�� ���� 
		//?? �� Object�� ��� �Դ°�??
		Object obj0 = hp.get("�̸�");
		
		//ĳ���� ������()�� �̿��� String ������ ����ȯ ��Ŵ
		String s0 = (String)obj0; //hp.put("�̸�", "�赿��") <- String�̾����
		
		//�����͸� ����/���ڷ� �ٲٴ°Ͱ� �����ϰ԰� 
		//get���� �̸��� �ش��ϴ� �ּҰ��� ������ �� to.String()�� ���� String���� �� ��ȯ ��Ŵ
		String s0_1 = hp.get("�̸�").toString();
		//get���� �̸��� �ش��ϴ� �ּҰ��� ������ �� StringŬ������ 
		//valueOf�� ���� String���� �� ��ȯ ��Ŵ
		String s0_2 = String.valueOf(hp.get("�̸�"));
		//�׳� Ű���� �̰� + �� �̿��ؼ� String���� ����
		String s0_3 = hp.get("�̸�")+"";
		
		System.out.println("obj0 >>> : " + obj0);
		System.out.println("s0 >>> : " + s0);
		System.out.println("s0_1 >>> : " + s0_1);
		System.out.println("s0_2 >>> : " + s0_2);
		System.out.println("s0_3 >>> : " + s0_3);	
		
		//String s0 = hp.get("�̸�");
		Object obj1 = hp.get("����");
		Integer s1 = (Integer)obj1;
		String s1_1 = hp.get("����").toString();
		String s1_2 = String.valueOf(hp.get("����"));
		String s1_3 = hp.get("����")+"";
		
		System.out.println("obj1 >>> : " + obj1);
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1_1 >>> : " + s1_1);
		System.out.println("s2_2 >>> : " + s1_2);
		System.out.println("s3_3 >>> : " + s1_3);	

		//hp.put('a',"����"); <-������ String 
		
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
		
		Object obj3 = hp.get('��');
		Integer s3 = (Integer)obj3;
		String s3_1 = hp.get('��').toString();
		String s3_2 = String.valueOf(hp.get('��'));
		String s3_3 = hp.get('��')+"";
		
		System.out.println("obj3 >>> : " + obj3);
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3_1 >>> : " + s3_1);
		System.out.println("s3_2 >>> : " + s3_2);
		System.out.println("s3_3 >>> : " + s3_3);
		
	}//end of main method
}//end of Ex_HashMap class
