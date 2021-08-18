package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.DAO.BdmBoardDAO;
import a.b.c.board.DAO.BdmBoardDAOImpl;
import a.b.c.board.vo.BdmBoardVO;


public class BdmBoardServiceImpl implements BdmBoardService {

	@Override
	public ArrayList<BdmBoardVO> bboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardServiceImpl.bboardSelectAll() 함수 시작>>>>");
		
		BdmBoardDAO bdao = new BdmBoardDAOImpl();
		ArrayList<BdmBoardVO> aList =  bdao.bdmboardSelectAll();
		
		return aList;
	}

	@Override
	public ArrayList<BdmBoardVO> bboardSelect(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardServiceImpl.bboardSelect() 함수 시작>>>>");
		
		BdmBoardDAO bdao = new BdmBoardDAOImpl();
		ArrayList<BdmBoardVO> aList = bdao.bboardSelect(bvo);
		
		return aList;
	}

	@Override
	public int bboardInsert(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardServiceImpl.bboardInsert() 함수 시작>>>>");
		
		BdmBoardDAO bdao = new BdmBoardDAOImpl();
		int nCnt = bdao.bboardInsert(bvo);
		
		return nCnt;
	}

	@Override
	public int bboardUpdate(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BdmBoardServiceImpl.bboardUpdate() 함수 시작>>>>");
		
		BdmBoardDAO bdao = new BdmBoardDAOImpl();
		int nCnt = bdao.bboardUpdate(bvo);
		
		return nCnt;
	}

	@Override
	public int bboardDelete(BdmBoardVO bvo) {
		// TODO Auto-generated method stub
		BdmBoardDAO bdao = new BdmBoardDAOImpl();
		int nCnt = bdao.bboardDelete(bvo);
		return nCnt;
	}

}
