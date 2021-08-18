package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.board.sql.BdmBoardSqlMap;
import a.b.c.ch9.mem.sql.BdmMemberSqlMap;

public class BdmBoardChabun {
	
	//회원번호 구분자 M
	public static final String BIZ_GUBUN_B = "B";

	
	//채번 쿼리 불러오기
	public static String ymdNun() {
		
		//지역변수 선언 및 디폴트값으로 초기화
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardChabunQuery());
			
			System.out.println("회원채번 쿼리 >>>> /n" + BdmBoardSqlMap.getBdmBoardChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				while (rsRs.next()) {
					commNO = rsRs.getNString("BNUM");
				}
			}else {
				System.out.println("채번쿼리 실패 >>>> ");
			}
			//db에서 가져온 값 : 0
			//numPad 유틸을 통해 001 같은 형식으로 바꿈
			System.out.println("commNO >>> : "+ commNO );
			commNO = CodeUtil.numPad(commNO);
			//앞에 회원코드  B을 붙임
			commNO = BdmBoardChabun.BIZ_GUBUN_B.concat(commNO);
			
			//만들어진 값을 출력함
			System.out.println("commNO >>> "+commNO);
			//객체 쓰면 꼭 닫기
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("db 에러 - BdmBoardChabun ymdNum");
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
			
		return commNO;
	}
	
	public static void main(String[] args) {
		String commNO = BdmBoardChabun.ymdNun();
		System.out.println("main :: commNO >>> " + commNO);
	}
}
