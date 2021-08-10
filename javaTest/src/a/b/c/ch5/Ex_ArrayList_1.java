package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList�� ����
		ArrayList aList = new ArrayList();
		
		//aList�� TestVO�� �ּҰ��� ����
		for(int i = 0; i < 3; i++) {
		//TestVO ��� �� �ּҰ��� ��� ���� �ν��Ͻ�
			TestVO tvo = new TestVO();
			
			//TestVO�� �������ִ� �ڿ��鵵 �ν��Ͻ�
			tvo.setMnum("00_"+i);
			tvo.setMid("aa_"+i);
			tvo.setMpw("aa00_"+i);
			tvo.setMhp("010_"+i);
			tvo.setMjuso("�ּ�_"+i);
			
			//�� �����͵��� ����Ű�� �ּҰ�->tvo�� aList�� ���
			aList.add(tvo);
			System.out.println(aList);
		}//end of for ��
		
		
		//aList�� ũ�� ����Ʈ
		System.out.println(aList.size());
		
		//tvo �ּҰ��� �̿��� TestVO�� �ִ� �ڿ����� ������
		for(int i = 0; i < aList.size(); i++) {
			
			//aList�� ��� �ϳ� �ϳ��� �ּҰ��� ������
			System.out.println(i + ">>>> : " + aList.get(i));
			
			//Test VO�� �ڿ��� 5���� Ŭ����
			//aList�� ���� ArrayList��
			//���� ������ ũ��� �ٸ� -> ��ġ�� ���� ��ġĳ����(������ ������)
			//get(i) : i��° ������� ���
			TestVO tvo = (TestVO)aList.get(i);
			
			System.out.print(" "+ tvo.getMnum());
			System.out.print(" "+ tvo.getMid());
			System.out.print(" "+ tvo.getMpw());
			System.out.print(" "+ tvo.getMhp());
			System.out.println(" "+ tvo.getMjuso());
			
		}//end of for��
		
		//------------------------------------------
		//���ʸ�(Generic) : ������ Ÿ���� ������
		//= �Ѱ����� ����� ��
		// �� ��ü�� �����ϳ� ��Ŭ������ �ִ� ����ٵ� ����
		System.out.println("\n���ʸ����� ���� >>>>>>>>>>>>");
		
		//<TestVO> : TestVO�� �ڿ��� ����� ���ʸ�
		ArrayList<TestVO> aList1 = new ArrayList<TestVO>();
		
		for(int i = 0; i < 3; i++) {
		
		TestVO tvo1 = new TestVO();
		
		//TestVO�� �������ִ� �ڿ��鵵 �ν��Ͻ�
		tvo1.setMnum("00_"+i);
		tvo1.setMid("aa_"+i);
		tvo1.setMpw("aa00_"+i);
		tvo1.setMhp("010_"+i);
		tvo1.setMjuso("�ּ�_"+i);
		
		//�� �����͵��� ����Ű�� �ּҰ�->tvo�� aList�� ���
		aList1.add(tvo1);
		System.out.println(aList1);
	}//end of for ��
	
	
	//aList�� ũ�� ����Ʈ
	System.out.println(aList1.size());
	
	//tvo �ּҰ��� �̿��� TestVO�� �ִ� �ڿ����� ������
	for(int i = 0; i < aList1.size(); i++) {
		
		//aList�� ��� �ϳ� �ϳ��� �ּҰ��� ������
		System.out.println(i + ">>>> : " + aList1.get(i));
		
		//Test VO�� �ڿ��� 5���� Ŭ����
		//aList�� ���� ArrayList��
		//���� ������ ũ��� �ٸ� -> ��ġ�� ���� ��ġĳ����(������ ������)
		//get(i) : i��° ������� ���
		TestVO tvo1 = (TestVO)aList1.get(i);
		
		System.out.print(" "+ tvo1.getMnum());
		System.out.print(" "+ tvo1.getMid());
		System.out.print(" "+ tvo1.getMpw());
		System.out.print(" "+ tvo1.getMhp());
		System.out.println(" "+ tvo1.getMjuso());
		
	}//end of for��
		
	}//end of main method

}//end of ArrayList_1 Ŭ����
