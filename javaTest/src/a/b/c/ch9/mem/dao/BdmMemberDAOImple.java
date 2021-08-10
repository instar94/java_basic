package a.b.c.ch9.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.ch9.mem.sql.BdmMemberSqlMap;
import a.b.c.common.BdmConnProperty;
import a.b.c.ch9.mem.vo.BdmMemberVO;


public class BdmMemberDAOImple implements BdmMemberDAO {

	//전체조회 함수 임플 오버라이딩
	@Override
	public ArrayList<BdmMemberVO> bmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("bmemSelectAll() 함수 시작 >>>> ");
		
		System.out.println("BdmMember.bmemeSelectAll() 함수 진입");
		//지역변수 선언 및 디폴트 값으로 초기화
		//지역변수로 연결하는 Connection
					//Staetment를 받아놓는 PreparedStatmnet
					//결과값을 돌려주는 ResultSet
					//그 결과 값들을 받을 ArrayList<BdmMemberVO>
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmMemberVO> aList = null;
		
		//Exception 처리 가 필요함으로 try - catch
		try {
			
		//connection은  자바-오라클을 연결
		//pstmt는 스테이트먼트를 저장했다가 사용함 -> SQLMAP에 있는걸 가져다 씀
		//reRs : 결과 값을 리턴해줌
		conn = BdmConnProperty.getConnection();
		pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberSelectAllQuery());
		System.out.println("전체조회 \n"+BdmMemberSqlMap.getBdmMemberSelectAllQuery());
		rsRs = pstmt.executeQuery();
		
		if(rsRs != null) {
			aList = new ArrayList<BdmMemberVO>();
			
			while (rsRs.next()) {
				BdmMemberVO bvo = new BdmMemberVO();
				bvo.setHNUM(rsRs.getNString("HNUM"));
				bvo.setHNAME(rsRs.getNString("HNAME"));
				bvo.setHID(rsRs.getNString("HID"));
				bvo.setHPW(rsRs.getNString("HPW"));
				bvo.setHBIRTH(rsRs.getNString("HBIRTH"));
				bvo.setHGENDER(rsRs.getNString("HGENDER"));
				bvo.setHTEL(rsRs.getNString("HTEL"));
				bvo.setHHP(rsRs.getNString("HHP"));
				bvo.setHEMAIL(rsRs.getNString("HEMAIL"));
				bvo.setHADDR(rsRs.getNString("HADDR"));
				bvo.setHHOBBY(rsRs.getNString("HHOBBY"));
				bvo.setHPHOTO(rsRs.getNString("HPHOTO"));
				bvo.setHSKILL(rsRs.getNString("HSKILL"));
				bvo.setHJOB(rsRs.getNString("HJOB"));
				bvo.setDELETEYN(rsRs.getNString("DELETEYN"));
				bvo.setINSERTDATE(rsRs.getNString("INSERTDATE"));
				bvo.setUPDATEDATE(rsRs.getNString("UPDATEDATE"));
				
				aList.add(bvo);
			}
		}
		
		
	}catch(Exception e) {
		System.out.println("db 연결 오류 >>> " + e.getMessage());
		}
		return aList;
	}
	

	@Override
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMember.bmemeSelect() 함수 진입");
		//지역변수 선언 및 디폴트 값으로 초기화
		//지역변수로 연결하는 Connection
					//Staetment를 받아놓는 PreparedStatmnet
					//결과값을 돌려주는 ResultSet
					//그 결과 값들을 받을 ArrayList<BdmMemberVO>
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmMemberVO> aList = null;
		
		//Exception 처리 가 필요함으로 try - catch
		try {
			
		//connection은 
		conn = BdmConnProperty.getConnection();
		pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberSelectQuery());
		System.out.println("조건조회 \n"+BdmMemberSqlMap.getBdmMemberSelectQuery());
		
		
		//스캐너 클래스에서 받아 온 값을 회원번호 디비와 연결
		pstmt.clearParameters();
		pstmt.setNString(1, bvo.getHNUM());
		rsRs = pstmt.executeQuery();
		
		if(rsRs != null) {
			aList = new ArrayList<BdmMemberVO>();
			
			while (rsRs.next()) {
				BdmMemberVO _bvo = new BdmMemberVO();
				_bvo.setHNUM(rsRs.getNString("HNUM"));
				_bvo.setHNAME(rsRs.getNString("HNAME"));
				_bvo.setHID(rsRs.getNString("HID"));
				_bvo.setHPW(rsRs.getNString("HPW"));
				_bvo.setHBIRTH(rsRs.getNString("HBIRTH"));
				_bvo.setHGENDER(rsRs.getNString("HGENDER"));
				_bvo.setHTEL(rsRs.getNString("HTEL"));
				_bvo.setHHP(rsRs.getNString("HHP"));
				_bvo.setHEMAIL(rsRs.getNString("HEMAIL"));
				_bvo.setHADDR(rsRs.getNString("HADDR"));
				_bvo.setHHOBBY(rsRs.getNString("HHOBBY"));
				_bvo.setHPHOTO(rsRs.getNString("HPHOTO"));
				_bvo.setHSKILL(rsRs.getNString("HSKILL"));
				_bvo.setHJOB(rsRs.getNString("HJOB"));
				_bvo.setDELETEYN(rsRs.getNString("DELETEYN"));
				_bvo.setINSERTDATE(rsRs.getNString("INSERTDATE"));
				_bvo.setUPDATEDATE(rsRs.getNString("UPDATEDATE"));
				
				aList.add(_bvo);
			}
		}
	}catch(Exception e) {
		System.out.println("db 연결 오류 >>> " + e.getMessage());
		}
		return aList;
	}

	@Override
	public boolean bmemInsert(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMember.bdmInsert() 함수 진입");
		BdmMemberVO.printBdmMemberVO(bvo);
		
		//지역변수 선언 및 디폴트값 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemInsertQuery());
			System.out.println("회원가입 \n"+BdmMemberSqlMap.getBdmMemInsertQuery());
			
			//파라미터 클리어 반드시!
			pstmt.clearParameters();
			
			//1부터 14까지 -> 쿼리문의 플레이스 홀더로 전달됨
			//15~17은 이미 값이 정해짐
			pstmt.setNString(1, bvo.getHNUM());
			pstmt.setNString(2, bvo.getHNAME());
			pstmt.setNString(3, bvo.getHID());
			pstmt.setNString(4, bvo.getHPW());
			pstmt.setNString(5, bvo.getHBIRTH());
			pstmt.setNString(6, bvo.getHGENDER());
			pstmt.setNString(7, bvo.getHTEL());
			pstmt.setNString(8, bvo.getHHP());
			pstmt.setNString(9, bvo.getHEMAIL());
			pstmt.setNString(10, bvo.getHADDR());
			pstmt.setNString(11, bvo.getHHOBBY());
			pstmt.setNString(12, bvo.getHPHOTO());
			pstmt.setNString(13, bvo.getHSKILL());
			pstmt.setNString(14, bvo.getHJOB());
			
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
			}catch(Exception e2) {}
		}
		return bool;
	}

	@Override
	public boolean bmemUpdate(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMember hmemUpdate() 함수 진입 >>> : ");
		BdmMemberVO.printlnBdmMemberVO(bvo);
			
			//사용할 객체 지역변수 선언 및 초기화
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
			boolean bool = false;
			
			try {
				conn = BdmConnProperty.getConnection();
				
				pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberUpdateQuery());
				System.out.println("수정하기 >>> : \n"+ BdmMemberSqlMap.getBdmMemberUpdateQuery());
				
				//파라미터 클리어 필수!
				pstmt.clearParameters();
				
				//수정할 내용을 받아서 쿼리문에 넣어놓음
				pstmt.setString(1, bvo.getHEMAIL());
				pstmt.setString(2, bvo.getHADDR());
				pstmt.setString(3, bvo.getHHOBBY());
				pstmt.setString(4, bvo.getHJOB());
				pstmt.setString(5, bvo.getHNUM());
				
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
			
			return bool;
		}

	@Override
	public boolean bmemDelete(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
			System.out.println("HbeMember hmemUpdate() 함수 진입 >>> : ");
			BdmMemberVO.printlnBdmMemberVO(bvo);
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
			boolean bool = false;
			try {
			conn = BdmConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberDeleteQuery());
			System.out.println("삭제하기 >>> : \n"+ BdmMemberSqlMap.getBdmMemberDeleteQuery());
			
			//파라미터 클리어 필수!
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getHNUM());
			
			//쿼리시작
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
			
			}catch(Exception e) {
				System.out.println("db 연결 오류 >>> " + e.getMessage());
			}finally {
				try {
					BdmConnProperty.conClose(conn, pstmt);
				} catch(Exception e2) {}
				
			}
			return bool;
		}
}
