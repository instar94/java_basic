package a.b.c.ch5;

import java.util.ArrayList;
import a.b.c.TestVO;
import java.util.Scanner;

public class Ex_ArrayList_3 {
	
	//ȸ����ȸ �Լ�
	public ArrayList<TestVO> memSelect() {
		
		System.out.println("Ex_ArrayList_3.memSelect() �Լ� ���� >>>>> ");
		
		//ArrayList�� aList�� ���� . <TestVO>�� ���ʸ����� ���
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		
		for (int i = 0; i < 3; i++) {
		
			//TestVO�� �ڿ��� �����ϱ� ���� �������� ����
			TestVO tvo = new TestVO();
			
			//setter�� �̿��ؼ� �� �������� ������
			tvo.setMnum("00_"+i);
			tvo.setMid("aa_"+i);
			tvo.setMpw("aa00_"+i);
			tvo.setMhp("010_"+i);
			tvo.setMjuso("�ּ�_"+i);
			
			//aList�� tvo�� �ּҰ��� ����
			aList.add(tvo);
			
			//����Ʈ�ϸ� �ּҰ��� ����
			System.out.println(aList);
		}
		System.out.println("Ex_ArrayList_3.memSelect() �Լ� �� >>>>> ");
		return aList;
	}
	
	public ArrayList<TestVO> memSelect(TestVO tvo){
		System.out.println("Ex_ArrayList_3.memSelect(TestVO tvo) �Լ� ���� >>>>> ");
		
		//�ǵ������� �����͸� ���� <-������ �ȵǾ� ����
		//������ ���� ArrayList�� �ΰ��� ����
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		
		for(int i = 0 ; i < 3 ; i++) {
			//TestVO�� �ڿ��� �����ϱ� ���� �������� ����
			TestVO tt = new TestVO();
			
			//setter�� �̿��ؼ� �� �������� ������
			//mnum�� 00_0~ 00_2���� �������
			tt.setMnum("00_"+i);
			tt.setMid("aa_"+i);
			tt.setMpw("aa00_"+i);
			tt.setMhp("010_"+i);
			tt.setMjuso("�ּ�_"+i);
			//���õ� ������ aList�� ����
			aList.add(tt);
			System.out.println(aList);
		}
		
		//����� ���� ArrayList�� ����
		ArrayList<TestVO> aList_1 = new ArrayList<TestVO>();
		
		//00_0~00_2 �� 00_1�� ������ ������
		if("00_1".equals(tvo.getMnum())){
			
			//00_1�� �ش��ϴ� ���� �������� ���� TestVO�� ���������� ����
			TestVO _tvo = new TestVO();
			//set�Լ��� ���� �����ϴµ�, �� ���� aList���� get(0).getMnum ���� ������
			//aList.get(0) : aLsit�� ù��° ��������� �ּҰ��� ������ ��
			// aList���� get(0).getMnum : aList�� 0��° ������� �ּҰ��� �ش��ϴ� getMnum ���� ������
			
			
			_tvo.setMnum(aList.get(0).getMnum());
			_tvo.setMid(aList.get(0).getMid());
			_tvo.setMpw(aList.get(0).getMpw());
			_tvo.setMhp(aList.get(0).getMhp());
			_tvo.setMjuso(aList.get(0).getMjuso());
			
	
			aList_1.add(_tvo);	
		}//end of if��
		
		System.out.println("Ex_ArrayList_3.memSelect(TestVO tvo) �Լ� �� >>>>> ");
		return aList_1;
	}//end of memSelect(TestVO tvo) �Լ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_ArrayList_3.main �Լ� ���� >>>>> ");
		System.out.println("��ȸ Ű���� �Է� : ������ȸ S / ��ü��ȸSALL");
		
		//Scanner Ŭ������ ���ؼ� ���� �޾ƿ�
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();
		//toUpperCase : �빮�ڷ� ����
		isud = isud.toUpperCase();
		
		if("S".equals(isud)) {
			System.out.println("isud >>>> " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
			
			//���������� Ư���� ���� ������ ��ü, �����ڷ��� ��� ����Ʈ������ �ʱ�ȭ
			TestVO tvo = null;
			tvo = new TestVO();
			tvo.setMnum("00_1");
			
			ArrayList<TestVO> aList = ex3.memSelect(tvo);
			System.out.println("aList.size () >>>> "+aList.size());
			System.out.println("aList >>>> : "+ aList);
			
			if (aList.size() > 0) {
				for(int i = 0; i< aList.size(); i++) {
					TestVO _tvo = aList.get(i);
					
					System.out.print(" " + _tvo.getMnum());
					System.out.print(" " + _tvo.getMid());
					System.out.print(" " + _tvo.getMpw());
					System.out.print(" " + _tvo.getMhp());
					System.out.println(" " + _tvo.getMjuso());
					
			}//for�� ����
		}//end of if��		
	}//end of S if��
		
		//��� ȸ�� ������ �������� if ��
		if("SALL".equals(isud)) {
			System.out.println("isud >>>> " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
			
			ArrayList<TestVO> aList = ex3.memSelect();
			
			System.out.println("aList.size() >>> "+aList.size());
			System.out.println("aList >>>> " + aList);
			
			if (aList.size() > 0) {
			for(int i = 0; i< aList.size(); i++) {
				TestVO tvo = aList.get(i);
				System.out.print(" " + tvo.getMnum());
				System.out.print(" " + tvo.getMid());
				System.out.print(" " + tvo.getMpw());
				System.out.print(" " + tvo.getMhp());
				System.out.println(" " + tvo.getMjuso());
					}//for�� ����
				}//end of if��
			}//end of if ��
		System.out.println("Ex_ArrayList_3.main �Լ� �� >>>>> ");
		}//end of main method
	}//end of Ex_ArrayList_3 class

