package a.b.c.ch9.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.ch9.mem.bdmmem.BdmMember;
import a.b.c.common.BdmMemberChabun;
import a.b.c.ch9.mem.service.BdmMemberService;
import a.b.c.ch9.mem.service.BdmMemberServiceImple;

public class BdmMemberScr {

	// ��ü��ȸ
	// Service���� �޾ƿ� ���� ���� ����س�
	public static void bdmSelectAll() {
		System.out.println("ȸ�� ��ü ��ȸ >>> ");

		// �����ν��Ͻ��ϰ� ArrayList ���� ������
		BdmMemberService bs = new BdmMemberServiceImple();
		ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

		// if�� for�� ���ؼ� �ش� ���� ����س�
		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {
				BdmMemberVO bvo = aList.get(i);
				BdmMemberVO.printBdmMemberVO(bvo);
			}
		} else {
			System.out.println("aList�� �����Ͱ� ���� >>> " + aList);
		}
	}

	// ������ȸ
	public static void bmemSelect(String hnum) {
		System.out.println("ȸ������ ������ȸ >>> : ");

		// �������� ���� �� �ʱ�ȭ

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();
		bvo.setHNUM(hnum);

		BdmMemberService bs = new BdmMemberServiceImple();

		ArrayList<BdmMemberVO> aList = bs.bmemSelect(bvo);

		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {

				BdmMemberVO _bvo = aList.get(i);
				BdmMemberVO.printBdmMemberVO(_bvo);
			}
		} else {
			System.out.println("aList�� ������ ����" + aList);
		}
	}

	// ȸ�� ����
	public static void bmemInsert() {
		System.out.println("ȸ������ ��� >>> : ");

		// ȸ����ȣ�� �˾Ƽ� �������
		String hnum = null;
		String hname = "GGGG";
		String hid = "GG00";
		String hpw = "GG1234";
		String hbirth = "20210701";
		String hgender = "01";
		String htel = "03212341234";
		String hhp = "01012341234";
		String hemail = "GG00@naver.com";
		String haddr = "���� ��õ�� ���굿 77";
		String hhobby = "01";
		String hphoto = "abc06.jpg";
		String hskill = "Ư��7";
		String hjob = "01";

		BdmMemberService bs = new BdmMemberServiceImple();

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();

		// ȸ����ȣ �����
		hnum = BdmMemberChabun.ymdNun();
		System.out.println("ȸ����ȣ��  " + hnum + "�Դϴ�.");
		bvo.setHNUM(hnum);
		bvo.setHNAME(hname);
		bvo.setHID(hid);
		bvo.setHPW(hpw);
		bvo.setHBIRTH(hbirth);
		bvo.setHGENDER(hgender);
		bvo.setHTEL(htel);
		bvo.setHHP(hhp);
		bvo.setHEMAIL(hemail);
		bvo.setHADDR(haddr);
		bvo.setHHOBBY(hhobby);
		bvo.setHPHOTO(hphoto);
		bvo.setHSKILL(hskill);
		bvo.setHJOB(hjob);

		boolean bool = bs.bmemInsert(bvo);

		if (bool) {
			System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);

			ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

			if (aList != null && aList.size() > 0) {
				for (int i = 0; i < aList.size(); i++) {

					BdmMemberVO _bvo = aList.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		} else {
			System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
		}
	}

	// ȸ������ ����
	public static void bMemUpdate() {
		System.out.println("ȸ������ ���� >>> : ");

		String hnum = "202108060007";
		String hemail = "FF00@naver.com";
		String haddr = "���� ��õ�� ���굿 6622";
		String hhobby = "04";
		String hjob = "02";

		BdmMemberService bs = new BdmMemberServiceImple();

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();
		bvo.setHNUM(hnum);
		bvo.setHEMAIL(hemail);
		bvo.setHADDR(haddr);
		bvo.setHHOBBY(hhobby);
		bvo.setHJOB(hjob);

		boolean bool = bs.bmemUpdate(bvo);

		if (bool) {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
			ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

			ArrayList<BdmMemberVO> aList1 = bs.bmemSelectAll();

			if (aList1 != null && aList1.size() > 0) {
				for (int i = 0; i < aList1.size(); i++) {

					BdmMemberVO _bvo = aList1.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList�� ������ ����" + aList1);
			}

		} else {
			System.out.println("ȸ�� ���� ���� ���� >>> " + bool);
		}

	}

	public static void bmemDelete() {
		System.out.println("ȸ������ ���� >>> : ");

		String hnum = "202108060007";

		BdmMemberService bs = new BdmMemberServiceImple();

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();
		bvo.setHNUM(hnum);

		boolean bool = bs.bmemDelete(bvo);

		if (bool) {
			System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);

			ArrayList<BdmMemberVO> aList1 = bs.bmemSelectAll();

			if (aList1 != null && aList1.size() > 0) {
				for (int i = 0; i < aList1.size(); i++) {

					BdmMemberVO _bvo = aList1.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList�� ������ ����" + aList1);
			}
		} else {
			System.out.println("ȸ�� ���� ���� ���� >>> " + bool);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ȸ������ CRUD :: ISUD �׽�Ʈ >>> :");

		// ȸ�� ���� ��ȸ�� ȸ����ȣ�� Scanner�� ����
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\nȸ������ ��ü��ȸ : 1" + "\n������ȸ : 2" + "\n��� : 3" + "\n ���� : 4" + "\n���� : 5" + "\n���� : 0");
			int isud = sc.nextInt();
			if (0 == isud)
				break;

			switch (isud) {

			case 1:
				try {
					BdmMemberScr.bdmSelectAll();
				} catch (Exception e) {

				}
				break;

			case 2:
				System.out.println("��ȸ�� ȸ���� ȸ����ȣ �Է� >>>");
				Scanner sc1 = new Scanner(System.in);
				try {
					String hnum = sc1.next();
					BdmMemberScr.bmemSelect(hnum);
				} catch (Exception e) {
				}
				break;

			case 3:
				try {
					BdmMemberScr.bmemInsert();
				} catch (Exception e) {
				}
				break;

			case 4:
				try {
					BdmMemberScr.bMemUpdate();
				} catch (Exception e) {
				}
				break;

			case 5:
				try {
					BdmMemberScr.bmemDelete();
				} catch (Exception e) {
				}
				break;
			}
		}
	}

}
