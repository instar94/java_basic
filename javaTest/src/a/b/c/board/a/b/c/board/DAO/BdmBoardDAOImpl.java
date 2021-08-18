package a.b.c.board.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.vo.BdmBoardVO;
import a.b.c.common.BdmConnProperty;
import a.b.c.board.sql.BdmBoardSqlMap;

public class BdmBoardDAOImpl implements BdmBoardDAO {

	@Override
	public ArrayList<BdmBoardVO> bdmboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardDAOImpl.bmemSelectAll() 시작 >>> ");
		
		//db에서 데이터를 받기 지역변수 선언 및 디폴트 값으로 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmBoardVO> aList = null;
		
		try{
			//연결 시작
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardSelectAllQueryMap());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				
				//결과 값이 있어야 인스턴스함 -> 매번하는거보단 나음
				aList = new ArrayList<BdmBoardVO>();
				
				while(rsRs.next()) {
					BdmBoardVO _bvo = new BdmBoardVO();
					
					_bvo.setBnum(rsRs.getString(1));
					_bvo.setBsubject(rsRs.getString(2));
					_bvo.setBwriter(rsRs.getString(3));
					_bvo.setBcontents(rsRs.getString(4));
					_bvo.setBpw(rsRs.getString(5));
					_bvo.setDeletyn(rsRs.getString(6));
					_bvo.setInsertdate(rsRs.getString(7));
					_bvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_bvo);
				}
				
			}else {
				System.out.println("데이터가 없음 >>>" + aList);
			}
			
		}catch(Exception e) {
			System.out.println("db 연결 불량 >>> " + e.getMessage());
			
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	//조건조회
	@Override
	public ArrayList<BdmBoardVO> bboardSelect(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardDAOImpl.bmemSelect() 시작 >>> ");
		
		//db에서 데이터를 받기 지역변수 선언 및 디폴트 값으로 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmBoardVO> aList = null;
		
		try{
			//연결 시작
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardSelectQueryMap());
			
			//스캐너클래스에서 받은 값을 연결
			//파라미터 클리어 필수
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				
				//결과 값이 있어야 인스턴스함 -> 매번하는거보단 나음
				aList = new ArrayList<BdmBoardVO> ();
				
				while(rsRs.next()) {
					BdmBoardVO _bvo = new BdmBoardVO();
					
					
					_bvo.setBnum(rsRs.getString(1));
					_bvo.setBsubject(rsRs.getString(2));
					_bvo.setBwriter(rsRs.getString(3));
					_bvo.setBcontents(rsRs.getString(4));
					_bvo.setBpw(rsRs.getString(5));
					_bvo.setDeletyn(rsRs.getString(6));
					_bvo.setInsertdate(rsRs.getString(7));
					_bvo.setUpdatedate(rsRs.getString(8));
					
					
					aList.add(_bvo);
				}
				
			}else {
				System.out.println("데이터가 없음 >>>" + aList);
			}
			BdmConnProperty.conClose(conn, pstmt, rsRs);
			
		}catch(Exception e) {
			System.out.println("db 연결 불량 >>> " + e.getMessage());
			
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public int bboardInsert(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("bboardInsert() 함수 진입");
		BdmBoardVO.printBdmBoardVO(bvo);
		
		//지역변수 선언 및 디폴트값 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardInsertQuery());
			System.out.println("회원가입 \n"+BdmBoardSqlMap.getBdmboardInsertQuery());
			
			//파라미터 클리어 반드시!
			pstmt.clearParameters();
			
			//1부터 14까지 -> 쿼리문의 플레이스 홀더로 전달됨
			//15~17은 이미 값이 정해짐
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBsubject());
			pstmt.setString(3, bvo.getBwriter());
			pstmt.setString(4, bvo.getBcontents());
			pstmt.setString(5, bvo.getBpw());
		
			
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용
			//리턴값이 int : 건수를 리턴한다.
			//// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용
			nCnt = pstmt.executeUpdate();
			//오토커밋 안되어 있으면 커밋 시킴
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> "+nCnt+" 건");
			
			BdmConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e) {
			System.out.println("db 연결 오류 >>> " + e.getMessage());
		} finally {
			try {
				BdmConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		return nCnt;
	}

	@Override
	public int bboardUpdate(BdmBoardVO bvo) {
		
		// TODO Auto-generated method stub
		System.out.println("bboardUpdate() 함수 진입 >>> : ");
			
			//사용할 객체 지역변수 선언 및 초기화
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
		
			
			try {
				conn = BdmConnProperty.getConnection();
				
				pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardUpdateQuery());
				System.out.println("수정하기 >>> : \n"+ BdmBoardSqlMap.getBdmBoardUpdateQuery());
				
				//파라미터 클리어 필수!
				pstmt.clearParameters();
				
				//수정할 내용을 받아서 쿼리문에 넣어놓음
				pstmt.setString(1, bvo.getBsubject());
				pstmt.setString(2, bvo.getBcontents());
				pstmt.setString(3, bvo.getBnum());
				
				
				
				//쿼리문 전달
				// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용
				//리턴값이 int : 건수를 리턴한다.
				//// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용
				nCnt = pstmt.executeUpdate();
				
				//오토커밋 안되어 있으면 커밋 시킴
				if(!conn.getAutoCommit()) conn.commit();
				System.out.println("nCnt >>> "+nCnt+" 건");
				

				
				BdmConnProperty.conClose(conn, pstmt);
				
			} catch(Exception e) {
				System.out.println("db 연결 오류 >>> " + e.getMessage());
			} finally {
				try {
					BdmConnProperty.conClose(conn, pstmt);
				} catch(Exception e2) {}
			}
		
		return nCnt;
	}

	@Override
	public int bboardDelete(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("bboardDelete() 함수 진입 >>> : ");
		
		//사용할 객체 지역변수 선언 및 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = BdmConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardDeleteQuery());
			System.out.println("수정하기 >>> : \n"+ BdmBoardSqlMap.getBdmBoardDeleteQuery());
			
			//파라미터 클리어 필수!
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());

			
			//쿼리문 전달
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용
			//리턴값이 int : 건수를 리턴한다.
			//// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용
			nCnt = pstmt.executeUpdate();
			
			//오토커밋 안되어 있으면 커밋 시킴
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> "+nCnt+" 건");
			
			if(nCnt > 0) {
				bool = true;
			}
			
			BdmConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e) {
			System.out.println("db 연결 오류 >>> " + e.getMessage());
		} finally {
			try {
				BdmConnProperty.conClose(conn, pstmt);
			} catch(Exception e2) {}
		}
	
		return nCnt;
	}

}
