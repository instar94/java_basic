package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.service.BdmBoardService;
import a.b.c.board.service.BdmBoardServiceImpl;
import a.b.c.board.vo.BdmBoardVO;
import a.b.c.common.BdmBoardChabun;

public class BdmBoardscr {

	// 전체조회함수
	public static void bboardSelectAll() {
		System.out.println("scr.bboardSelectAll() 시작 >>>");
		System.out.println("회원 전체 조회 >>>> : ");

		try {
			// scr <- Service <- DAO <- Database
			// 서비스를 인스턴스함
			// aList에 전체 선택 서비스 bboardSelectAll 값을 넣음
			BdmBoardService bs = new BdmBoardServiceImpl();
			ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

			// aList가 null이거나 값이 없는지 확인
			if (aList != null && aList.size() > 0) {

				// aList의 값들을 하나씩 bvo에 넣음
				for (int i = 1; i < aList.size(); i++) {
					BdmBoardVO bvo = aList.get(i);

					// bvo에 담긴 값을 print 함수를 통해 출력함
					BdmBoardVO.printBdmBoardVO(bvo);
				}
				// null 값이거나 사이즈가 0일 경우
			} else {
				System.out.println("aList에 데이터가 없음 >>> " + aList);
			}
		} catch (Exception e) {
			System.out.println("등록 에러 >>> " + e.getMessage());
		}
		System.out.println("scr.bboardSelectAll() 끝 >>>");
	}// end of bboardSelectAll() method

	// 조건조회
	public static void bboardSelect(String bnum) {
		System.out.println("scr.bboardSelect() 시작 >>>");
		System.out.println("회원정보 조건조회 >>> : ");

		try {
			// 서비스를 인스턴스함
			BdmBoardService bs = new BdmBoardServiceImpl();
			// 조건 조회를 위해 글번호를 받아야 함으로 bvo를 인스턴스
			BdmBoardVO bvo = new BdmBoardVO();
			// 받은 글번호 bnum을 bvo에 넣음
			bvo.setBnum(bnum);

			// bboardSelect에 bvo에서 담은 값을 aList에 넣음
			ArrayList<BdmBoardVO> aList = bs.bboardSelect(bvo);

			// aList null, 값이 없는지 확인함
			if (aList != null && aList.size() > 0) {
				// 반복문을 이용하여 값들을 출력해냄
				for (int i = 0; i < aList.size(); i++) {
					// aList의 i 번째 요소들을 _bvo에 넣음
					BdmBoardVO _bvo = aList.get(i);
					// 그리고 그 _bvo에 담긴 값들을 출력함
					BdmBoardVO.printBdmBoardVO(_bvo);
				}
			} else {
				System.out.println("aList에 데이터 없음" + aList);
			}
		} catch (Exception e) {
			System.out.println("등록 에러 >>> " + e.getMessage());
		}
		System.out.println("scr.bboardSelect() 끝 >>>");
	}

	// INSERT
	public static void bboardInsert() {
		System.out.println("scr.bboardInsert 시작 >>>>");
		System.out.println("회원정보 등록 >>> : ");

		// 변수 선언 후 넣을 값을 작성함
		// 회원번호는 알아서 만들어짐 -> by 채번로직
		String bnum = BdmBoardChabun.ymdNun();
		String bsubject = "테스트 제목";
		String bwriter = "테스트";
		String bcontents = "테스트 내용";
		String bpw = "test";

		try {
			// 서비스를 호출
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo를 선언 후 인스턴스함
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();

			// 글번호 만들기
			// 글 번호는 채번로직 클래스에 의해서 자동으로 만들어짐
			bnum = BdmBoardChabun.ymdNun();
			System.out.println("글번호는  " + bnum + "입니다.");

			// set함수를 이용해서 글번호,제목,글쓴이,글내용,비밀번호를 bvo에 저장하도록 함
			bvo.setBnum(bnum);
			bvo.setBsubject(bsubject);
			bvo.setBwriter(bwriter);
			bvo.setBcontents(bcontents);
			bvo.setBpw(bpw);

			// nCnt : 작업이 성공했는지 아닌지를 확인 하는 로직
			// nCnt에 bboardInsert의 값을 넣음
			// 작업이 성공했다면 1이상 ------ 실패했다면 0이 나옴
			int nCnt = bs.bboardInsert(bvo);

			// 실패하지 않은 상황
			if (nCnt > 0) {
				System.out.println("게시글 입력 성공 >>> : " + nCnt + "건의 게시물 작성 완료");
				// SelectAll 함수를 호출해서 모든 데이터를 보여줌 -> 잘 작동되었다는 의미
				ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

				// if문: aList 값이 없거나 null이 아닌지를 확인함
				if (aList != null && aList.size() > 0) {
					// for문 : for문을 이용해서 aList의 값들을 받아내고,출력함
					for (int i = 0; i < aList.size(); i++) {

						BdmBoardVO _bvo = aList.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
				}
			} else {
				System.out.println("게시글 입력 실패 >>> : " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("등록 에러 >>> " + e.getMessage());
		}
		System.out.println("scr.bboardInsert 끝 >>>>");
	}

	// UPDATE
	public static void bboardUpdate() {
		System.out.println("scr.bboardUpdate 시작 >>>>");
		System.out.println("글정보 수정 >>> : ");

		// 변경할 내용을 미리 선언하고 초기화
		String bnum = "B0005";
		String bsubject = "변경제목";
		String bwirter = "변경글쓴이";

		try {
			// 서비스 호출
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo를 인스턴스함 <- 변경정보를 받아서 넣을 예정
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();

			// set함수를 이용해 받아온 값들을 저장함
			bvo.setBnum(bnum);
			bvo.setBsubject(bsubject);
			bvo.setBwriter(bwirter);

			// nCnt : 작업이 성공했는지 확인하는 변수
			int nCnt = bs.bboardUpdate(bvo);

			if (nCnt > 0) {
				System.out.println("게시글 수정 성공 >>> : " + nCnt);
				ArrayList<BdmBoardVO> aList = bs.bboardSelectAll();

				if (aList != null && aList.size() > 0) {
					for (int i = 0; i < aList.size(); i++) {

						BdmBoardVO _bvo = aList.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList에 데이터 없음" + aList);
				}

			} else {
				System.out.println("게시글 수정 실패 >>> " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("등록 에러 >>> " + e.getMessage());
		}
		System.out.println("scr.bboardUpdate 끝 >>>> ");
	}

	// DELETE -> flag 삭제를 진행
	// 실제 삭제하지 않음
	public static void bboardDelete() {
		System.out.println("scr.bboardDelete 시작 >>> ");
		System.out.println("회원정보 삭제 >>> : ");

		// 삭제 할 변수 선언 및 초기화
		String bnum = "B0005";

		try {
			// 서비스 호출
			BdmBoardService bs = new BdmBoardServiceImpl();

			// bvo 인스턴스 및 bnum값을 받아서 넘김
			BdmBoardVO bvo = null;
			bvo = new BdmBoardVO();
			bvo.setBnum(bnum);

			// nCnt 작업 성공 여부 확인 변수
			int nCnt = bs.bboardDelete(bvo);

			if (nCnt > 0) {
				System.out.println("게시글 삭제 성공 >>> : " + nCnt);

				ArrayList<BdmBoardVO> aList1 = bs.bboardSelectAll();

				if (aList1 != null && aList1.size() > 0) {
					for (int i = 0; i < aList1.size(); i++) {

						BdmBoardVO _bvo = aList1.get(i);
						BdmBoardVO.printBdmBoardVO(_bvo);
					}
				} else {
					System.out.println("aList에 데이터 없음" + aList1);
				}
			} else {
				System.out.println("게시글 삭제 실패 >>> " + nCnt);
			}
		} catch (Exception e) {
			System.out.println("등록 에러 >>>> " + e.getMessage());
		}
		System.out.println("scr.bboardDelete 끝>>>>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardscr.main 함수 시작 >>>> ");
		System.out.println("게시판 ISUD 테스트 >>> ");

		// 어떤 기능을 수행 할지 사용할 지역변수를 선언 (Scanner)
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n\n회원정보 전체조회 : 1" + "\n조건조회 : 2" + "\n등록 : 3" + "\n수정 : 4" + "\n삭제 : 5" + "\n종료 : 0");
			// 작업 분기 값을 isud라는 인트형 변수로 받아옴
			// sc.nextInt () : key-in된 정수 값을 가져옴
			int isud = sc.nextInt();

			while (true) {
				// 0일 경우 바로 종료
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
					System.out.println("회원번호 입력 >>> ");
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
			System.out.println("BdmBoardscr.main 함수 끝 >>>> ");
		}
	}
}
