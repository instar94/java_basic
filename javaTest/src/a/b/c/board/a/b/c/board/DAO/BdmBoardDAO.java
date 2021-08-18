package a.b.c.board.DAO;

import java.util.ArrayList;

import a.b.c.board.vo.BdmBoardVO;


public interface BdmBoardDAO {
	
	public ArrayList<BdmBoardVO> bdmboardSelectAll();
	public ArrayList<BdmBoardVO> bboardSelect(BdmBoardVO bvo);
	public int bboardInsert(BdmBoardVO bvo);
	public int bboardUpdate(BdmBoardVO bvo);
	public int bboardDelete(BdmBoardVO bvo);

}
