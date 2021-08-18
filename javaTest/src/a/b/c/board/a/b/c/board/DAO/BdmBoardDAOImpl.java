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
		System.out.println("BdmBoardDAOImpl.bmemSelectAll() ���� >>> ");
		
		//db���� �����͸� �ޱ� �������� ���� �� ����Ʈ ������ �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmBoardVO> aList = null;
		
		try{
			//���� ����
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardSelectAllQueryMap());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				
				//��� ���� �־�� �ν��Ͻ��� -> �Ź��ϴ°ź��� ����
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
				System.out.println("�����Ͱ� ���� >>>" + aList);
			}
			
		}catch(Exception e) {
			System.out.println("db ���� �ҷ� >>> " + e.getMessage());
			
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	//������ȸ
	@Override
	public ArrayList<BdmBoardVO> bboardSelect(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardDAOImpl.bmemSelect() ���� >>> ");
		
		//db���� �����͸� �ޱ� �������� ���� �� ����Ʈ ������ �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmBoardVO> aList = null;
		
		try{
			//���� ����
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardSelectQueryMap());
			
			//��ĳ��Ŭ�������� ���� ���� ����
			//�Ķ���� Ŭ���� �ʼ�
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				
				//��� ���� �־�� �ν��Ͻ��� -> �Ź��ϴ°ź��� ����
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
				System.out.println("�����Ͱ� ���� >>>" + aList);
			}
			BdmConnProperty.conClose(conn, pstmt, rsRs);
			
		}catch(Exception e) {
			System.out.println("db ���� �ҷ� >>> " + e.getMessage());
			
		}finally {
			BdmConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public int bboardInsert(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("bboardInsert() �Լ� ����");
		BdmBoardVO.printBdmBoardVO(bvo);
		
		//�������� ���� �� ����Ʈ�� �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmboardInsertQuery());
			System.out.println("ȸ������ \n"+BdmBoardSqlMap.getBdmboardInsertQuery());
			
			//�Ķ���� Ŭ���� �ݵ��!
			pstmt.clearParameters();
			
			//1���� 14���� -> �������� �÷��̽� Ȧ���� ���޵�
			//15~17�� �̹� ���� ������
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBsubject());
			pstmt.setString(3, bvo.getBwriter());
			pstmt.setString(4, bvo.getBcontents());
			pstmt.setString(5, bvo.getBpw());
		
			
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ���
			//���ϰ��� int : �Ǽ��� �����Ѵ�.
			//// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ���
			nCnt = pstmt.executeUpdate();
			//����Ŀ�� �ȵǾ� ������ Ŀ�� ��Ŵ
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> "+nCnt+" ��");
			
			BdmConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e) {
			System.out.println("db ���� ���� >>> " + e.getMessage());
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
		System.out.println("bboardUpdate() �Լ� ���� >>> : ");
			
			//����� ��ü �������� ���� �� �ʱ�ȭ
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
		
			
			try {
				conn = BdmConnProperty.getConnection();
				
				pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardUpdateQuery());
				System.out.println("�����ϱ� >>> : \n"+ BdmBoardSqlMap.getBdmBoardUpdateQuery());
				
				//�Ķ���� Ŭ���� �ʼ�!
				pstmt.clearParameters();
				
				//������ ������ �޾Ƽ� �������� �־����
				pstmt.setString(1, bvo.getBsubject());
				pstmt.setString(2, bvo.getBcontents());
				pstmt.setString(3, bvo.getBnum());
				
				
				
				//������ ����
				// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ���
				//���ϰ��� int : �Ǽ��� �����Ѵ�.
				//// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ���
				nCnt = pstmt.executeUpdate();
				
				//����Ŀ�� �ȵǾ� ������ Ŀ�� ��Ŵ
				if(!conn.getAutoCommit()) conn.commit();
				System.out.println("nCnt >>> "+nCnt+" ��");
				

				
				BdmConnProperty.conClose(conn, pstmt);
				
			} catch(Exception e) {
				System.out.println("db ���� ���� >>> " + e.getMessage());
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
		System.out.println("bboardDelete() �Լ� ���� >>> : ");
		
		//����� ��ü �������� ���� �� �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = BdmConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BdmBoardSqlMap.getBdmBoardDeleteQuery());
			System.out.println("�����ϱ� >>> : \n"+ BdmBoardSqlMap.getBdmBoardDeleteQuery());
			
			//�Ķ���� Ŭ���� �ʼ�!
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());

			
			//������ ����
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ���
			//���ϰ��� int : �Ǽ��� �����Ѵ�.
			//// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ���
			nCnt = pstmt.executeUpdate();
			
			//����Ŀ�� �ȵǾ� ������ Ŀ�� ��Ŵ
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> "+nCnt+" ��");
			
			if(nCnt > 0) {
				bool = true;
			}
			
			BdmConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e) {
			System.out.println("db ���� ���� >>> " + e.getMessage());
		} finally {
			try {
				BdmConnProperty.conClose(conn, pstmt);
			} catch(Exception e2) {}
		}
	
		return nCnt;
	}

}
