package a.b.c.ch5;

import java.util.ArrayList;

public class Ex_ArrayList {
//class ArrayList 1.4 ����
//https://javaalmanac.io/jdk/1.4/api/index.html
//class ArrayList <E> : ���ʸ����� 1.5����
//https://javaalmanac.io/jdk/5/api/index.html


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList�� ������ ���� Ű�ٸ� �������̴�.	
		// -> ������ Ÿ���� �޶� ������ / ������ ���ڸ��ų� ���ĵ� ���
		//������ ���� = index�� ����
		
		//Array�迭�� ������ �ư����̴�.
		//-> ������ Ÿ�� ���� / ������ ���ڶ�� ����
		//������ ���� - index�� ����
		//�����;��� �۰�, ������ ó�� �� �� �����
		//�迭�� ���������� �����ϴ°� �ƴ� - ���������� �����ϴ°���
		
		ArrayList aList = new ArrayList();
		System.out.println("aList >>>> " + aList);
		//.size : ��������� ���� ����
		//�⺻���� ������Ҵ� �� 10��
		System.out.println("aList.size() >>>> " + aList.size());
		
		//�����ڷ��� ���� ����
		aList.add(1);
		System.out.println("aList >>>> " + aList);
		
		//��ü�� ���� ����
		aList.add(new Integer("100"));
		System.out.println("aList >>>> " + aList);
		
		//�����ڷ��� ���ڰ���
		aList.add("����");
		System.out.println("aList >>>> " + aList);
		
		//��ü�� ���ڿ� ����
		aList.add(new String("�赿��"));
		System.out.println("aList >>>> " + aList);
		
		//�����ڷ��� ���� ����
		aList.add('a');
		System.out.println("aList >>>> " + aList);
		
		//boolean ����
		aList.add(false);
		System.out.println("aList >>>> " + aList);
		
		//ArrayList �ڱ� �ڽŵ� ����
		//�迭������ this Collection���� ����
		//������ҷμ��� �迭 ��ü�� ����
		//ex) [1, 100, ����, �赿��, a, false, (this Collection), a.b.c.TestVO@15db9742]
	
		aList.add(aList);
		System.out.println("aList >>>> " + aList);
		
		//�ٸ� ��Ű���� �ִ� �͵� ����
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>>> " + aList);
		
		//10���� �Ѿ ArrayList�� ArrayList.add�� ����� ���� ��Ų��
		System.out.println("aList.size() >>>> " + aList.size());
		
		//������� �̱�
		//length ��ſ� size�� �����
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(">>>> "+ aList.get(i));
		}//end of for��
	}//end of main method

}//end of Ex_ArrayList
