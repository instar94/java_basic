package a.b.c.ch9.mem.service;

import java.util.ArrayList;
import a.b.c.ch9.mem.vo.BdmMemberVO;

public interface BdmMemberService {
	
	public ArrayList<BdmMemberVO> bmemSelectAll();
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo);
	public boolean bmemInsert(BdmMemberVO bvo);
	public boolean bmemUpdate(BdmMemberVO bvo);
	public boolean bmemDelete(BdmMemberVO bvo);

}
