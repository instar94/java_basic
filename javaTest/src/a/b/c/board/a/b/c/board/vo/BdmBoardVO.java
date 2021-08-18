package a.b.c.board.vo;

public class BdmBoardVO {
	
	//사용 예정인 변수 선언
	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bcontents;
	private String bpw;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	//깡통 생성자
	public BdmBoardVO() {
		
	}
	
	// 데이터 받기용 생성자
	public BdmBoardVO(String bnum, String bsubject
					, String bwriter, String bcontents
					, String bpw, String deleteyn
					,String insertdate, String updatedate) {
		
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
		this.bcontents = bcontents;
		this.bpw = bpw;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	//getter 함수
	public String getBnum() {
		return bnum;
	}
	public String getBsubject() {
		return bsubject;
	}
	public String getBwriter() {
		return bwriter;
	}
	public String getBcontents() {
		return bcontents;
	}
	public String getBpw() {
		return bpw;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	//set 함수 
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}
	public void setBpw(String bpw) {
		this.bpw = bpw;
	}
	public void setDeletyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	
	public static void printBdmBoardVO(BdmBoardVO bvo) {
		System.out.print(bvo.getBnum() + ",");
		System.out.print(bvo.getBsubject() + ",");
		System.out.print(bvo.getBwriter() + ",");
		System.out.print(bvo.getBcontents() + ",");
		System.out.print(bvo.getBpw() + ",");
		System.out.print(bvo.getDeleteyn() + ",");
		System.out.print(bvo.getInsertdate() + ",");
		System.out.println(bvo.getUpdatedate());
	}
	

}
