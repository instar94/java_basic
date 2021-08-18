package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.board.sql.BdmBoardSqlMap;
import a.b.c.ch9.mem.sql.BdmMemberSqlMap;

public class BdmBoardChabun {
	
	//ȸ����ȣ ������ M
	public static final String BIZ_GUBUN_B = "B";

	
	//ä�� ���� �ҷ�����
	public static String ymdNun() {
		
		//�������� ���� �� ����Ʈ������ �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardChabunQuery());
			
			System.out.println("ȸ��ä�� ���� >>>> /n" + BdmBoardSqlMap.getBdmBoardChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				while (rsRs.next()) {
					commNO = rsRs.getNString("BNUM");
				}
			}else {
				System.out.println("ä������ ���� >>>> ");
			}
			//db���� ������ �� : 0
			//numPad ��ƿ�� ���� 001 ���� �������� �ٲ�
			System.out.println("commNO >>> : "+ commNO );
			commNO = CodeUtil.numPad(commNO);
			//�տ� ȸ���ڵ�  B�� ����
			commNO = BdmBoardChabun.BIZ_GUBUN_B.concat(commNO);
			
			//������� ���� �����
			System.out.println("commNO >>> "+commNO);
			//��ü ���� �� �ݱ�
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("db ���� - BdmBoardChabun ymdNum");
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
