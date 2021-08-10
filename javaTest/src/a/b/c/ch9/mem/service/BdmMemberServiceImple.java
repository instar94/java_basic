package a.b.c.ch9.mem.service;

import java.util.ArrayList;

import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.ch9.mem.dao.BdmMemberDAO;
import a.b.c.ch9.mem.dao.BdmMemberDAOImple;


public class BdmMemberServiceImple implements BdmMemberService {

	@Override
	public ArrayList<BdmMemberVO> bmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemSelectAll() �Լ� ����>>>>");
		
		//DAO���� ������ �޾ƿ��� �װ�  ArrayList�� �־����
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		ArrayList<BdmMemberVO> aList = bdao.bmemSelectAll();
		
		return aList;
	}

	@Override
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemSelect() �Լ� ����>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		ArrayList<BdmMemberVO> aList = bdao.bmemSelect(bvo);
		
		return aList;
		
	}

	@Override
	public boolean bmemInsert(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemInsert() �Լ� ����>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemInsert(bvo);
		
		return bool;
	}

	@Override
	public boolean bmemUpdate(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemUpdate() �Լ� ����>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemUpdate(bvo);
		
		return bool;
	}

	@Override
	public boolean bmemDelete(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemDelete() �Լ� ����>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemDelete(bvo);
		
		return bool;
	}

}
