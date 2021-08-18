package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.BdmBoardService;
import a.b.c.board.service.BdmBoardServiceImpl;
import a.b.c.board.vo.BdmBoardVO;
import a.b.c.common.BdmBoardChabun;

public class BdmBoardscr_1 {
	
	//�Խ������� ��
	public static final String[] insert_label = {"������","�ۼ���","�۳���","��й�ȣ"};
	public static final String[] update_label = {"�۹�ȣ","������","�۳���"};
	// ��ü��ȸ�Լ�
	public static void bboardSelectAll() {
		System.out.println("scr.bboardSelectAll() ���� >>>");
		System.out.println("ȸ�� ��ü ��ȸ >>>> : ");

		try {
			// scr <- Service <- DAO <- Database
			// ���񽺸� �ν��Ͻ���
			// aList�� ��ü ���� ���� bboardSelectAll ���� ����
			BdmBoardService bs = new BdmBoardServiceImpl();
			ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

			// aList�� null�̰ų� ���� ������ Ȯ��
			if (aList != null && aList.size() > 0) {

				// aList�� ������ �ϳ��� bvo�� ����
				for (int i = 1; i < aList.size(); i++) {
					BdmBoardVO bvo = aList.get(i);

					// bvo�� ��� ���� print �Լ��� ���� �����
					BdmBoardVO.printBdmBoardVO(bvo);
				}
				// null ���̰ų� ����� 0�� ���
			} else {
				System.out.println("aList�� �����Ͱ� ���� >>> " + aList);
			}
		} catch (Exception e) {
			System.out.println("��� ���� >>> " + e.getMessage());
		}
		System.out.println("scr.bboardSelectAll() �� >>>");
	}// end of bboardSelectAll() method

	// ������ȸ
	public static void bboardSelect(String bnum) {
		System.out.println("scr.bboardSelect() ���� >>>");
		System.out.println("ȸ������ ������ȸ >>> : ");

		try {
			// ���񽺸� �ν��Ͻ���
			BdmBoardService bs = new BdmBoardServiceImpl();
			// ���� ��ȸ�� ���� �۹�ȣ�� �޾ƾ� ������ bvo�� �ν��Ͻ�
			BdmBoardVO bvo = new BdmBoardVO();
			// ���� �۹�ȣ bnum�� bvo�� ����
			bvo.setBnum(bnum);

			// bboardSelect�� bvo���� ���� ���� aList�� ����
			ArrayList<BdmBoardVO> aList = bs.bboardSelect(bvo);

			// aList null, ���� ������ Ȯ����
			if (aList != null && aList.size() > 0) {
				// �ݺ����� �̿��Ͽ� ������ ����س�
				for (int i = 0; i < aList.size(); i++) {
					// aList�� i ��° ��ҵ��� _bvo�� ����
					BdmBoardVO _bvo = aList.get(i);
					// �׸��� �� _bvo�� ��� ������ �����
					BdmBoardVO.printBdmBoardVO(_bvo);
				}
			} else {
				System.out.println("aList�� ������ ����" + aList);
			}
		} catch (Exception e) {
			System.out.println("��� ���� >>> " + e.getMessage());
		}
		System.out.println("scr.bboardSelect() �� >>>");
	}

	// INSERT
	public static void bboardInsert(String sVal[]) {
		System.out.println("scr.bboardInsert ���� >>>>");
		System.out.println("ȸ������ ��� >>> : ");

		// ���� ���� �� ���� ���� �ۼ���
		// ȸ����ȣ�� �˾Ƽ� ������� -> by ä������
		for(int i=0; i<sVal.length; i++){
			System.out.println(insert_label[i]+">>>"+sVal[i]);
				}
		String bnum = BdmBoardChabun.ymdNun();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bcontents = sVal[2];
		String bpw = sVal[3];

		try {
			// ���񽺸� ȣ��
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo�� ���� �� �ν��Ͻ���
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();

			// �۹�ȣ �����
			// �� ��ȣ�� ä������ Ŭ������ ���ؼ� �ڵ����� �������
			bnum = BdmBoardChabun.ymdNun();
			System.out.println("�۹�ȣ��  " + bnum + "�Դϴ�.");

			// set�Լ��� �̿��ؼ� �۹�ȣ,����,�۾���,�۳���,��й�ȣ�� bvo�� �����ϵ��� ��
			bvo.setBnum(bnum);
			bvo.setBsubject(bsubject);
			bvo.setBwriter(bwriter);
			bvo.setBcontents(bcontents);
			bvo.setBpw(bpw);

			// nCnt : �۾��� �����ߴ��� �ƴ����� Ȯ�� �ϴ� ����
			// nCnt�� bboardInsert�� ���� ����
			// �۾��� �����ߴٸ� 1�̻� ------ �����ߴٸ� 0�� ����
			int nCnt = bs.bboardInsert(bvo);

			// �������� ���� ��Ȳ
			if (nCnt > 0) {
				System.out.println("�Խñ� �Է� ���� >>> : " + nCnt + "���� �Խù� �ۼ� �Ϸ�");
				// SelectAll �Լ��� ȣ���ؼ� ��� �����͸� ������ -> �� �۵��Ǿ��ٴ� �ǹ�
				ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

				// if��: aList ���� ���ų� null�� �ƴ����� Ȯ����
				if (aList != null && aList.size() > 0) {
					// for�� : for���� �̿��ؼ� aList�� ������ �޾Ƴ���,�����
					for (int i = 0; i < aList.size(); i++) {

						BdmBoardVO _bvo = aList.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}
			} else {
				System.out.println("�Խñ� �Է� ���� >>> : " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("��� ���� >>> " + e.getMessage());
		}
		System.out.println("scr.bboardInsert �� >>>>");
	}

	// UPDATE
	public static void bboardUpdate(String sVal[]) {
		System.out.println("scr.bboardUpdate ���� >>>>");
		System.out.println("������ ���� >>> : ");

		// ������ ������ �̸� �����ϰ� �ʱ�ȭ
		String bnum = sVal[0];
		String bsubject = sVal[1];
		String bwirter = sVal[2];

		try {
			// ���� ȣ��
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo�� �ν��Ͻ��� <- ���������� �޾Ƽ� ���� ����
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();

			// set�Լ��� �̿��� �޾ƿ� ������ ������
			bvo.setBnum(bnum);
			bvo.setBsubject(bsubject);
			bvo.setBwriter(bwirter);

			// nCnt : �۾��� �����ߴ��� Ȯ���ϴ� ����
			int nCnt = bs.bboardUpdate(bvo);

			if (nCnt > 0) {
				System.out.println("�Խñ� ���� ���� >>> : " + nCnt);
				ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

				if (aList != null && aList.size() > 0) {
					for (int i = 0; i < aList.size(); i++) {

						BdmBoardVO _bvo = aList.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList�� ������ ����" + aList);
				}

			} else {
				System.out.println("�Խñ� ���� ���� >>> " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("��� ���� >>> " + e.getMessage());
		}
		System.out.println("scr.bboardUpdate �� >>>> ");
	}

	// DELETE -> flag ������ ����
	// ���� �������� ����
	public static void bboardDelete(String bnum) {
		System.out.println("scr.bboardDelete ���� >>> ");
		System.out.println("ȸ������ ���� >>> : ");

		// ���� �� ���� ���� �� �ʱ�ȭ
		try {
			// ���� ȣ��
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo �ν��Ͻ� �� bnum���� �޾Ƽ� �ѱ�
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();
			
			bvo.setBnum(bnum);

			// nCnt �۾� ���� ���� Ȯ�� ����
			int nCnt = bs.bboardDelete(bvo);

			if (nCnt > 0) {
				System.out.println("�Խñ� ���� ���� >>> : " + nCnt);

				ArrayList<BdmBoardVO> aList1 = bs.bboardSelectAll();

				if (aList1 != null && aList1.size() > 0) {
					for (int i = 0; i < aList1.size(); i++) {

						BdmBoardVO _bvo = aList1.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList�� ������ ����" + aList1);
				}
			} else {
				System.out.println("�Խñ� ���� ���� >>> " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("��� ���� >>>> " + e.getMessage());
		}
		System.out.println("scr.bboardDelete ��>>>>");
	}

	public static String[] getParameter(int iVal) {
		
		String sVal[] =null;
		
		//Insert �Ķ����
		if(3==iVal) {
			sVal = new String[insert_label.length];
			
			//������ �Է¹ޱ� ���� ��ĳ�� Ŭ���� �ν��Ͻ�
			Scanner sc2 = new Scanner (System.in);
			
			System.out.println("����� �Խ��� ������ �Է� >>> "+insert_label.length);
			System.out.println("����� �Խ����� �迭�� ���� >>> : " + sVal.length);
		
			for(int i =0; i<sVal.length; i++) {
				System.out.println(insert_label[i]+"��(��) �Է����ּ��� >> ");
				sVal[i] = sc2.next();
				System.out.println(insert_label[i]+" ������ >>>> "+ sVal[i]);
			}
		
		}
		
		if(4==iVal) {
			sVal = new String[update_label.length];
			
			//������ �Է¹ޱ� ���� ��ĳ�� Ŭ���� �ν��Ͻ�
			Scanner sc3 = new Scanner (System.in);
			
			System.out.println("������ �Խ��� ������ �Է� >>> "+insert_label.length);
			System.out.println("������ �Խ����� �迭�� ���� >>> : " + sVal.length);
		
			for(int i =0; i<sVal.length; i++) {
				System.out.println(update_label[i]+"��(��) �Է����ּ��� >> ");
				sVal[i] = sc3.next();
				System.out.println(update_label[i]+" ������ >>>> "+ sVal[i]);
			}
			
		}
		return sVal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardscr.main �Լ� ���� >>>> ");
		System.out.println("�Խ��� ISUD �׽�Ʈ >>> ");

		// � ����� ���� ���� ����� ���������� ���� (Scanner)
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\nȸ������ ��ü��ȸ : 1" + "\n������ȸ : 2" + "\n��� : 3" + "\n���� : 4" + "\n���� : 5" + "\n���� : 0");
			// �۾� �б� ���� isud��� ��Ʈ�� ������ �޾ƿ�
			// sc.nextInt () : key-in�� ���� ���� ������
			int isud = sc.nextInt();

				// 0�� ��� �ٷ� ����
				if (0 == isud) {
					System.out.println("���α׷� ���� >>>>>");
					break;
				}
				
				switch (isud) {

				//SelectAll
				case 1:
					try {
						BdmBoardscr_1.bboardSelectAll();
					} catch (Exception e) {
					}
					break;
				//Select
				case 2:
					System.out.println("��ȸ�� ���Ͽ� �۹�ȣ �Է� >>> ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						BdmBoardscr_1.bboardSelect(bnum);
					} catch (Exception e) {
					}
					break;
				// INSERT
				case 3:
					try {
						String sVal3[] = BdmBoardscr_1.getParameter(3);
						BdmBoardscr_1.bboardInsert(sVal3);
					} catch (Exception e) {
					}
					break;

				// UPDATE
				case 4:
					try {
						String sVal3[] = BdmBoardscr_1.getParameter(4);
						BdmBoardscr_1.bboardUpdate(sVal3);
					} catch (Exception e) {
					}
					break;

				// DELETE
				case 5:
					System.out.println("������ �۹�ȣ�� �Է��Ͻÿ� >>> : ");
					Scanner sc2 = new Scanner(System.in);
					try {
						String bnum = sc2.next();
						BdmBoardscr_1.bboardDelete(bnum);
					} catch (Exception e) {
					}
					break;
				}
			
			System.out.println("BdmBoardscr.main �Լ� �� >>>> ");
		}
	}
}
