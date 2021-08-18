package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.BdmBoardService;
import a.b.c.board.service.BdmBoardServiceImpl;
import a.b.c.board.vo.BdmBoardVO;
import a.b.c.common.BdmBoardChabun;

public class BdmBoardscr {

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
	public static void bboardInsert() {
		System.out.println("scr.bboardInsert ���� >>>>");
		System.out.println("ȸ������ ��� >>> : ");

		// ���� ���� �� ���� ���� �ۼ���
		// ȸ����ȣ�� �˾Ƽ� ������� -> by ä������
		String bnum = BdmBoardChabun.ymdNun();
		String bsubject = "�׽�Ʈ ����";
		String bwriter = "�׽�Ʈ";
		String bcontents = "�׽�Ʈ ����";
		String bpw = "test";

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
	public static void bboardUpdate() {
		System.out.println("scr.bboardUpdate ���� >>>>");
		System.out.println("������ ���� >>> : ");

		// ������ ������ �̸� �����ϰ� �ʱ�ȭ
		String bnum = "B0005";
		String bsubject = "��������";
		String bwirter = "����۾���";

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
	public static void bboardDelete() {
		System.out.println("scr.bboardDelete ���� >>> ");
		System.out.println("ȸ������ ���� >>> : ");

		// ���� �� ���� ���� �� �ʱ�ȭ
		String bnum = "B0005";

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

			while (true) {
				// 0�� ��� �ٷ� ����
				if (0 == isud)
					break;

				switch (isud) {

				//SelectAll
				case 1:
					try {
						BdmBoardscr.bboardSelectAll();
					} catch (Exception e) {
					}
					break;
				//Select
				case 2:
					System.out.println("ȸ����ȣ �Է� >>> ");
					Scanner sc1 = new Scanner(System.in);
					try {
						String bnum = sc1.next();
						BdmBoardscr.bboardSelect(bnum);
					} catch (Exception e) {
					}
					break;
				// INSERT
				case 3:
					try {
						BdmBoardscr.bboardInsert();
					} catch (Exception e) {
					}
					break;

				// UPDATE
				case 4:
					try {
						BdmBoardscr.bboardUpdate();
					} catch (Exception e) {
					}
					break;

				// DELETE
				case 5:
					try {
						BdmBoardscr.bboardDelete();
					} catch (Exception e) {
					}
					break;
				}
			}
			System.out.println("BdmBoardscr.main �Լ� �� >>>> ");
		}
	}
}
