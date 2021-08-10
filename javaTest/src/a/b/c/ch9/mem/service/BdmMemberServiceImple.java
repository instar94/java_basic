package a.b.c.ch9.mem.service;

import java.util.ArrayList;

import a.b.c.ch9.mem.vo.BdmMemberVO;
import a.b.c.ch9.mem.dao.BdmMemberDAO;
import a.b.c.ch9.mem.dao.BdmMemberDAOImple;


public class BdmMemberServiceImple implements BdmMemberService {

	@Override
	public ArrayList<BdmMemberVO> bmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemSelectAll() 함수 시작>>>>");
		
		//DAO에서 정보를 받아오고 그걸  ArrayList에 넣어놓음
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		ArrayList<BdmMemberVO> aList = bdao.bmemSelectAll();
		
		return aList;
	}

	@Override
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemSelect() 함수 시작>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		ArrayList<BdmMemberVO> aList = bdao.bmemSelect(bvo);
		
		return aList;
		
	}

	@Override
	public boolean bmemInsert(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemInsert() 함수 시작>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemInsert(bvo);
		
		return bool;
	}

	@Override
	public boolean bmemUpdate(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemUpdate() 함수 시작>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemUpdate(bvo);
		
		return bool;
	}

	@Override
	public boolean bmemDelete(BdmMemberVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmMemberServiceImple.bmemDelete() 함수 시작>>>>");
		
		BdmMemberDAO bdao = new BdmMemberDAOImple();
		boolean bool = bdao.bmemDelete(bvo);
		
		return bool;
	}

}
