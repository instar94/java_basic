package a.b.c.ch9.mem.bdmmem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.mem.sql.BdmMemberSqlMap;
import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.common.BdmConnProperty;

//getConnection �� �����ͼҽ��� ����ϱ� ���ؿ� import


//Ŭ����
public class BdmMember {
	public ArrayList<BdmMemberVO> bmemeSelectAll() {

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


	public boolean bdmInsert(BdmMemberVO bvo) {
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


	public boolean bdmUpdate(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMember bdmUpdate() �Լ� ���� >>> : ");
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

	public boolean bdmDelete(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
			System.out.println("BdmMember bmeDelete() �Լ� ���� >>> : ");
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
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ CRUD :: ISUD �׽�Ʈ >>> :");
		
		//ȸ�� ���� ��ȸ�� ȸ����ȣ�� Scanner�� ����
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("\n\n ȸ������ ��ü��ȸ : SA\n������ȸ : S\n��� : I\n ���� : U\n���� : D\n���� : Q");
			
			//Scanner Ŭ������ ���� ������ ���� �������� ����
			//������ �빮�ڷ� �������� ó����
			String isud = sc.next().toUpperCase();
			
			//Q�� ������ ������
			
			if("Q".equals(isud)) { 
				System.out.println("���� >>> : " + isud);
				break;}
			
			if("SA".equals(isud)) {
				System.out.println("ȸ������ ��ü��ȸ >>> : " + isud);
				
				BdmMember bmb = new BdmMember();
				ArrayList<BdmMemberVO> aList = bmb.bmemeSelectAll();
				
				if(aList != null && aList.size() >0) {
					for (int i = 0 ; i < aList.size() ; i++) {
						
						BdmMemberVO bvo = aList.get(i);
						BdmMemberVO.printBdmMemberVO(bvo);
			
					}
					
				}else {
					System.out.println("aList ������ ���� >> " + aList);
				}
			}
			
			if("S".equals(isud)) {
				System.out.println("ȸ������ ������ȸ >>> : " + isud);
				
				System.out.println("��ȸ���� ȸ�� ��ȣ �Է� >>> : ");
				Scanner scs = new Scanner(System.in);
				String hnum = scs.next();
				
				BdmMember bm = new BdmMember();
				
				BdmMemberVO bvo = null;
				bvo = new BdmMemberVO();
				bvo.setHNUM(hnum);
				
				ArrayList<BdmMemberVO> aList =bm.bmemSelect(bvo);
				
				if (aList != null && aList.size() > 0) {
					for(int i=0; i<aList.size();i++) {
						
						BdmMemberVO _bvo = aList.get(i);
						BdmMemberVO.printBdmMemberVO(_bvo);
					}
				}else {
					System.out.println("aList�� ������ ����" + aList);
				}
			}
			if ("I".equals(isud)) {
				System.out.println("ȸ������ ��� >>> : " + isud);
				
				String hnum = "202108050001";
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
				
				BdmMember bm = new BdmMember();
				
				BdmMemberVO bvo = null;
				bvo = new BdmMemberVO();
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
				
				boolean bool = bm.bdmInsert(bvo);
				
				if (bool) {
					System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);	
					
					ArrayList<BdmMemberVO> aList = bm.bmemeSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							BdmMemberVO _bvo = aList.get(i);
							BdmMemberVO.printBdmMemberVO(_bvo);
						}		
					}else {
						System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
					}
				}else {
					System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
				}	
				
				
			}
			if ("U".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
				
				String hnum = "202108060007";				
				String hemail = "FF00@naver.com";
				String haddr = "���� ��õ�� ���굿 6622"; 
				String hhobby = "04";				
				String hjob = "02";
				
				BdmMember bm = new BdmMember();
				
				BdmMemberVO bvo = null;
				bvo = new BdmMemberVO();
				bvo.setHNUM(hnum);
				bvo.setHEMAIL(hemail);
				bvo.setHADDR(haddr);
				bvo.setHHOBBY(hhobby);
				bvo.setHJOB(hjob);
				
				boolean bool = bm.bdmUpdate(bvo);
				
				if(bool) {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);					
					ArrayList<BdmMemberVO> aList =bm.bmemSelect(bvo);
					
					ArrayList<BdmMemberVO> aList1 = bm.bmemeSelectAll();
					
					if (aList1 != null && aList1.size() > 0) {
						for(int i=0; i<aList1.size();i++) {
							
							BdmMemberVO _bvo = aList1.get(i);
							BdmMemberVO.printBdmMemberVO(_bvo);
						}
					}else {
						System.out.println("aList�� ������ ����" + aList1);
					}
					
				}else {
					System.out.println("ȸ�� ���� ���� ���� >>> "+ bool);
				}
				
				
			}
			if ("D".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
				
				String hnum ="202108060007";
				
				BdmMember bm = new BdmMember();
				
				BdmMemberVO bvo = null;
				bvo = new BdmMemberVO();
				bvo.setHNUM(hnum);
				
				boolean bool = bm.bdmDelete(bvo);
			
				if(bool) {
					System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);	
					
					ArrayList<BdmMemberVO> aList1 = bm.bmemeSelectAll();
					
					if (aList1 != null && aList1.size() > 0) {
						for(int i=0; i<aList1.size();i++) {
							
							BdmMemberVO _bvo = aList1.get(i);
							BdmMemberVO.printBdmMemberVO(_bvo);
						}
					}else {
						System.out.println("aList�� ������ ����" + aList1);
					}
				}else {
					System.out.println("ȸ�� ���� ���� ���� >>> "+ bool);
				}
			}				
		}	
	}
}
