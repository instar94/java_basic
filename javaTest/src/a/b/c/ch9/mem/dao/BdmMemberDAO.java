package a.b.c.ch9.mem.dao;

import java.util.ArrayList;
import a.b.c.ch9.mem.vo.BdmMemberVO;

//DAO -> db에서 정보를 받음
//SQL문을 이용해 정보를 데이터베이스에 정보를 받음
//그리고 그 값을 서비스로 보냄
public interface  BdmMemberDAO {
	
	public ArrayList<BdmMemberVO> bmemSelectAll();
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo);
	public boolean bmemInsert(BdmMemberVO bvo);
	public boolean bmemUpdate(BdmMemberVO bvo);
	public boolean bmemDelete(BdmMemberVO bvo);
	

}
