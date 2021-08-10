package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.ch9.mem.sql.BdmMemberSqlMap;

public class BdmMemberChabun {
	
	//ȸ����ȣ ������ M
	public static final String BIZ_GUBUN_M = "M";

	
	//ä�� ���� �ҷ�����
	public static String ymdNun() {
		
		//�������� ���� �� ����Ʈ������ �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberChabunQuery());
			
			System.out.println("ȸ��ä�� ���� >>>> /n" + BdmMemberSqlMap.getBdmMemberChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				while (rsRs.next()) {
					commNO = rsRs.getNString("COMMNO");
				}
			}else {
				System.out.println("ä������ ���� >>>> ");
			}
			//db���� ������ �� : 0
			//numPad ��ƿ�� ���� 001 ���� �������� �ٲ�
			System.out.println("commNO >>> : "+ commNO );
			commNO = CodeUtil.numPad(commNO);
			//�տ� ��¥�� ����
			commNO = DateUtil.yyyymmdd().concat(commNO);//+����, concat����
			//�տ� ȸ���ڵ�  M�� ����
			commNO = BdmMemberChabun.BIZ_GUBUN_M.concat(commNO);
			
			//������� ���� �����
			System.out.println("commNO >>> "+commNO);
			//��ü ���� �� �ݱ�
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("db ���� - BdmMemberChabun ymdNum");
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
			
		return commNO;
	}
	
	public static void main(String[] args) {
		String commNO = BdmMemberChabun.ymdNun();
		System.out.println("main :: commNO >>> " + commNO);
	}
}
