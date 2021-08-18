package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.vo.BdmBoardVO;

public interface BdmBoardService {
	
	public ArrayList<BdmBoardVO> bboardSelectAll();
	public ArrayList<BdmBoardVO> bboardSelect(BdmBoardVO bvo);
	
	public int bboardInsert (BdmBoardVO bvo);
	public int bboardUpdate (BdmBoardVO bvo);
	public int bboardDelete (BdmBoardVO bvo);
}
