package a.b.c.ch9.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.ch9.mem.bdmmem.BdmMember;
import a.b.c.common.BdmMemberChabun;
import a.b.c.ch9.mem.service.BdmMemberService;
import a.b.c.ch9.mem.service.BdmMemberServiceImple;

public class BdmMemberScr {

	// 전체조회
	// Service에서 받아온 값을 전부 출력해냄
	public static void bdmSelectAll() {
		System.out.println("회원 전체 조회 >>> ");

		// 서비스인스턴스하고 ArrayList 값을 가져옴
		BdmMemberService bs = new BdmMemberServiceImple();
		ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

		// if와 for를 통해서 해당 값을 출력해냄
		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {
				BdmMemberVO bvo = aList.get(i);
				BdmMemberVO.printBdmMemberVO(bvo);
			}
		} else {
			System.out.println("aList에 데이터가 없음 >>> " + aList);
		}
	}

	// 조건조회
	public static void bmemSelect(String hnum) {
		System.out.println("회원정보 조건조회 >>> : ");

		// 지역변수 선언 및 초기화

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
			System.out.println("aList에 데이터 없음" + aList);
		}
	}

	// 회원 가입
	public static void bmemInsert() {
		System.out.println("회원정보 등록 >>> : ");

		// 회원번호는 알아서 만들어짐
		String hnum = null;
		String hname = "GGGG";
		String hid = "GG00";
		String hpw = "GG1234";
		String hbirth = "20210701";
		String hgender = "01";
		String htel = "03212341234";
		String hhp = "01012341234";
		String hemail = "GG00@naver.com";
		String haddr = "서울 금천구 가산동 77";
		String hhobby = "01";
		String hphoto = "abc06.jpg";
		String hskill = "특기7";
		String hjob = "01";

		BdmMemberService bs = new BdmMemberServiceImple();

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();

		// 회원번호 만들기
		hnum = BdmMemberChabun.ymdNun();
		System.out.println("회원번호는  " + hnum + "입니다.");
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
			System.out.println("회원 정보 입력 성공 >>> : " + bool);

			ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

			if (aList != null && aList.size() > 0) {
				for (int i = 0; i < aList.size(); i++) {

					BdmMemberVO _bvo = aList.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
			}
		} else {
			System.out.println("회원 정보 입력 실패 >>> : " + bool);
		}
	}

	// 회원정보 수정
	public static void bMemUpdate() {
		System.out.println("회원정보 수정 >>> : ");

		String hnum = "202108060007";
		String hemail = "FF00@naver.com";
		String haddr = "서울 금천구 가산동 6622";
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
			System.out.println("회원 정보 수정 성공 >>> : " + bool);
			ArrayList<BdmMemberVO> aList = bs.bmemSelectAll();

			ArrayList<BdmMemberVO> aList1 = bs.bmemSelectAll();

			if (aList1 != null && aList1.size() > 0) {
				for (int i = 0; i < aList1.size(); i++) {

					BdmMemberVO _bvo = aList1.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList에 데이터 없음" + aList1);
			}

		} else {
			System.out.println("회원 정보 수정 실패 >>> " + bool);
		}

	}

	public static void bmemDelete() {
		System.out.println("회원정보 삭제 >>> : ");

		String hnum = "202108060007";

		BdmMemberService bs = new BdmMemberServiceImple();

		BdmMemberVO bvo = null;
		bvo = new BdmMemberVO();
		bvo.setHNUM(hnum);

		boolean bool = bs.bmemDelete(bvo);

		if (bool) {
			System.out.println("회원 정보 삭제 성공 >>> : " + bool);

			ArrayList<BdmMemberVO> aList1 = bs.bmemSelectAll();

			if (aList1 != null && aList1.size() > 0) {
				for (int i = 0; i < aList1.size(); i++) {

					BdmMemberVO _bvo = aList1.get(i);
					BdmMemberVO.printBdmMemberVO(_bvo);
				}
			} else {
				System.out.println("aList에 데이터 없음" + aList1);
			}
		} else {
			System.out.println("회원 정보 삭제 실패 >>> " + bool);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("회원정보 CRUD :: ISUD 테스트 >>> :");

		// 회원 정보 조회시 회원번호를 Scanner로 받음
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\n회원정보 전체조회 : 1" + "\n조건조회 : 2" + "\n등록 : 3" + "\n 수정 : 4" + "\n삭제 : 5" + "\n종료 : 0");
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
				System.out.println("조회할 회원의 회원번호 입력 >>>");
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
