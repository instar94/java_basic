package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڷ� ���ʸ� �ϱ�
		//���ʸ����� String�� �޾ұ� ������ ���ڿ��θ� �޾ƾ���
		//���ʸ� < > �̶� ������ Ÿ���� �����ϴ� ����
		//��� ĳ�����̶�� �ൿ�� ������ ������
		//����Ҷ��� parseint ���� �Լ��� ���ϴ� ������ �ؾ���
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("�赿��");//���ڿ�
		System.out.println("aList>>> :"+ aList);
		
		aList.add("25");//����
		System.out.println("aList>>> :"+ aList);
		
		aList.add("2021-07-21");//��¥
		System.out.println("aList>>> :"+ aList);
		
		//for���� �̿��ؼ� ����ϱ�
		for(int i = 0; i< aList.size();i++) {
			System.out.println("aList "+i+" >>>>"+ aList.get(i));
		}//for�� ����
		
		//���ڷ� ���ʸ� �ϱ�
		//�� ���ʸ��� ��ü�� �����ϱ� ������ �����ڷ����� int�� �Ұ�����
		//ArrayList<int> al0 = new ArrayListM<int>();
		ArrayList<Integer> al0 = new ArrayList<Integer>();
		
		al0.add(1);
		al0.add(new Integer(100));
		//al0.add(new Byte(11)); <-11�� Byte�� ĳ���� �� �� ����
		System.out.println("al0>>>>> "+ al0);
		System.out.println("al0.size >>>> " + al0.size());
		
		//for���� �̿��ؼ� ����ϱ�
		for(int i = 0; i< al0.size();i++) {
			System.out.println("al0 "+i+" >>>>"+ al0.get(i));
				}//for�� ����
		
		//����� ���� Ŭ���� ���ʸ�
		ArrayList<TestVO> al1 = new ArrayList<TestVO>();
		al1.add(new TestVO("00_1","aa_1","aa00_1","010_1","�ּ�_1"));
		al1.add(new TestVO("00_2","aa_2","aa00_2","010_2","�ּ�_2"));
		al1.add(new TestVO("00_3","aa_3","aa00_3","010_3","�ּ�_3"));
		al1.add(new TestVO("00_4","aa_4","aa00_4","010_4","�ּ�_4"));
		System.out.println("al1>>>>> "+ al1);
		System.out.println("al1.size >>>> " + al1.size());
		
		//for���� �̿��ؼ� ����ϱ�
		for(int i = 0; i< al1.size();i++) {
			TestVO tvo = al1.get(i);
			System.out.print(" " + tvo.getMnum());
			System.out.print(" " + tvo.getMid());
			System.out.print(" " + tvo.getMpw());
			System.out.print(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMjuso());
				}//for�� ����
	}//end of main method

}//end of Ex_ArrayList_2 class
