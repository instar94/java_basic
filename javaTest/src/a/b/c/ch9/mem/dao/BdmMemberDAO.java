package a.b.c.ch9.mem.dao;

import java.util.ArrayList;
import a.b.c.ch9.mem.vo.BdmMemberVO;

//DAO -> db���� ������ ����
//SQL���� �̿��� ������ �����ͺ��̽��� ������ ����
//�׸��� �� ���� ���񽺷� ����
public interface  BdmMemberDAO {
	
	public ArrayList<BdmMemberVO> bmemSelectAll();
	public ArrayList<BdmMemberVO> bmemSelect(BdmMemberVO bvo);
	public boolean bmemInsert(BdmMemberVO bvo);
	public boolean bmemUpdate(BdmMemberVO bvo);
	public boolean bmemDelete(BdmMemberVO bvo);
	

}
