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

	//��ü��ȸ �Լ� ���� �������̵�
	@Override
	public ArrayList<BdmMemberVO> bmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("bmemSelectAll() �Լ� ���� >>>> ");
		
		System.out.println("BdmMember.bmemeSelectAll() �Լ� ����");
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		//���������� �����ϴ� Connection
					//Staetment�� �޾Ƴ��� PreparedStatmnet
					//������� �����ִ� ResultSet
					//�� ��� ������ ���� ArrayList<BdmMemberVO>
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmMemberVO> aList = null;
		
		//Exception ó�� �� �ʿ������� try - catch
		try {
			
		//connection��  �ڹ�-����Ŭ�� ����
		//pstmt�� ������Ʈ��Ʈ�� �����ߴٰ� ����� -> SQLMAP�� �ִ°� ������ ��
		//reRs : ��� ���� ��������
		conn = BdmConnProperty.getConnection();
		pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberSelectAllQuery());
		System.out.println("��ü��ȸ \n"+BdmMemberSqlMap.getBdmMemberSelectAllQuery());
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
		System.out.println("db ���� ���� >>> " + e.getMessage());
		}
		return aList;
	}
	

	@Override
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMember.bmemeSelect() �Լ� ����");
		//�������� ���� �� ����Ʈ ������ �ʱ�ȭ
		//���������� �����ϴ� Connection
					//Staetment�� �޾Ƴ��� PreparedStatmnet
					//������� �����ִ� ResultSet
					//�� ��� ������ ���� ArrayList<BdmMemberVO>
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<BdmMemberVO> aList = null;
		
		//Exception ó�� �� �ʿ������� try - catch
		try {
			
		//connection�� 
		conn = BdmConnProperty.getConnection();
		pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberSelectQuery());
		System.out.println("������ȸ \n"+BdmMemberSqlMap.getBdmMemberSelectQuery());
		
		
		//��ĳ�� Ŭ�������� �޾� �� ���� ȸ����ȣ ���� ����
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
		System.out.println("db ���� ���� >>> " + e.getMessage());
		}
		return aList;
	}

	@Override
	public boolean bmemInsert(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMember.bdmInsert() �Լ� ����");
		BdmMemberVO.printBdmMemberVO(bvo);
		
		//�������� ���� �� ����Ʈ�� �ʱ�ȭ
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = BdmConnProperty.getConnection();
			pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemInsertQuery());
			System.out.println("ȸ������ \n"+BdmMemberSqlMap.getBdmMemInsertQuery());
			
			//�Ķ���� Ŭ���� �ݵ��!
			pstmt.clearParameters();
			
			//1���� 14���� -> �������� �÷��̽� Ȧ���� ���޵�
			//15~17�� �̹� ���� ������
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
			}catch(Exception e2) {}
		}
		return bool;
	}

	@Override
	public boolean bmemUpdate(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMember hmemUpdate() �Լ� ���� >>> : ");
		BdmMemberVO.printlnBdmMemberVO(bvo);
			
			//����� ��ü �������� ���� �� �ʱ�ȭ
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
			boolean bool = false;
			
			try {
				conn = BdmConnProperty.getConnection();
				
				pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberUpdateQuery());
				System.out.println("�����ϱ� >>> : \n"+ BdmMemberSqlMap.getBdmMemberUpdateQuery());
				
				//�Ķ���� Ŭ���� �ʼ�!
				pstmt.clearParameters();
				
				//������ ������ �޾Ƽ� �������� �־����
				pstmt.setString(1, bvo.getHEMAIL());
				pstmt.setString(2, bvo.getHADDR());
				pstmt.setString(3, bvo.getHHOBBY());
				pstmt.setString(4, bvo.getHJOB());
				pstmt.setString(5, bvo.getHNUM());
				
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
			
			return bool;
		}

	@Override
	public boolean bmemDelete(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
			System.out.println("HbeMember hmemUpdate() �Լ� ���� >>> : ");
			BdmMemberVO.printlnBdmMemberVO(bvo);
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			int nCnt = 0;
			boolean bool = false;
			try {
			conn = BdmConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BdmMemberSqlMap.getBdmMemberDeleteQuery());
			System.out.println("�����ϱ� >>> : \n"+ BdmMemberSqlMap.getBdmMemberDeleteQuery());
			
			//�Ķ���� Ŭ���� �ʼ�!
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getHNUM());
			
			//��������
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
			
			}catch(Exception e) {
				System.out.println("db ���� ���� >>> " + e.getMessage());
			}finally {
				try {
					BdmConnProperty.conClose(conn, pstmt);
				} catch(Exception e2) {}
				
			}
			return bool;
		}
}
