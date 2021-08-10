package a.b.c.ch9.mem.vo;

import a.b.c.common.CodeUtil;

public class BdmMemberVO {
	
	private String HNUM;
	private String HNAME;
	private String HID;
	private String HPW;
	private String HBIRTH;
	private String HGENDER;
	private String HTEL;
	private String HHP;
	private String HEMAIL;
	private String HADDR;
	private String HHOBBY;
	private String HPHOTO;
	private String HSKILL;
	private String HJOB;
	private String DELETEYN;
	private String INSERTDATE;
	private String UPDATEDATE;
	
	

	public BdmMemberVO() {
		
	}
	public BdmMemberVO(String hNUM, String hNAME, String hID
					, String hPW, String hBIRTH, String hGENDER
					, String hTEL,String hHP, String hEMAIL
					, String hADDR, String hHOBBY, String hPHOTO
					, String hSKILL, String hJOB,String dELETEYN
					, String iNSERTDATE, String uPDATEDATE) {
		
		this.HNUM = hNUM;
		this.HNAME = hNAME;
		this.HID = hID;
		this.HPW = hPW;
		this.HBIRTH = hBIRTH;
		this.HGENDER = hGENDER;
		this.HTEL = hTEL;
		this.HHP = hHP;
		this.HEMAIL = hEMAIL;
		this.HADDR = hADDR;
		this.HHOBBY = hHOBBY;
		this.HPHOTO = hPHOTO;
		this.HSKILL = hSKILL;
		this.HJOB = hJOB;
		this.DELETEYN = dELETEYN;
		this.INSERTDATE = iNSERTDATE;
		this.UPDATEDATE = uPDATEDATE;
	}
	

	public String getHNUM() {
		return HNUM;
	}

	public String getHNAME() {
		return HNAME;
	}

	public String getHID() {
		return HID;
	}

	public String getHPW() {
		return HPW;
	}

	public String getHBIRTH() {
		return HBIRTH;
	}

	public String getHGENDER() {
		return HGENDER;
	}

	public String getHTEL() {
		return HTEL;
	}

	public String getHHP() {
		return HHP;
	}

	public String getHEMAIL() {
		return HEMAIL;
	}

	public String getHADDR() {
		return HADDR;
	}

	public String getHHOBBY() {
		return HHOBBY;
	}

	public String getHPHOTO() {
		return HPHOTO;
	}

	public String getHSKILL() {
		return HSKILL;
	}

	public String getHJOB() {
		return HJOB;
	}

	public String getDELETEYN() {
		return DELETEYN;
	}

	public String getINSERTDATE() {
		return INSERTDATE;
	}

	public String getUPDATEDATE() {
		return UPDATEDATE;
	}

	public void setHNUM(String hNUM) {
		HNUM = hNUM;
	}

	public void setHNAME(String hNAME) {
		HNAME = hNAME;
	}

	public void setHID(String hID) {
		HID = hID;
	}

	public void setHPW(String hPW) {
		HPW = hPW;
	}

	public void setHBIRTH(String hBIRTH) {
		HBIRTH = hBIRTH;
	}

	public void setHGENDER(String hGENDER) {
		HGENDER = hGENDER;
	}

	public void setHTEL(String hTEL) {
		HTEL = hTEL;
	}

	public void setHHP(String hHP) {
		HHP = hHP;
	}

	public void setHEMAIL(String hEMAIL) {
		HEMAIL = hEMAIL;
	}

	public void setHADDR(String hADDR) {
		HADDR = hADDR;
	}

	public void setHHOBBY(String hHOBBY) {
		HHOBBY = hHOBBY;
	}

	public void setHPHOTO(String hPHOTO) {
		HPHOTO = hPHOTO;
	}

	public void setHSKILL(String hSKILL) {
		HSKILL = hSKILL;
	}

	public void setHJOB(String hJOB) {
		HJOB = hJOB;
	}

	public void setDELETEYN(String dELETEYN) {
		DELETEYN = dELETEYN;
	}

	public void setINSERTDATE(String iNSERTDATE) {
		INSERTDATE = iNSERTDATE;
	}

	public void setUPDATEDATE(String uPDATEDATE) {
		UPDATEDATE = uPDATEDATE;
	}

	//BdmMemberVO를 출력하는 함수
	//CodeUtil로 형태를 잡아놓은 것들 형태로 출력되도록 잡아놓음
	
	//print 함수
	public static void printBdmMemberVO(BdmMemberVO bvo) {
		
		System.out.print(bvo.getHNUM()      +", ");
		System.out.print(bvo.getHNAME()      +", ");
		System.out.print(bvo.getHID()      +", ");
		System.out.print(bvo.getHPW()      +", ");
		System.out.print(bvo.getHBIRTH()      +", ");
		System.out.print(CodeUtil.gender(bvo.getHGENDER())     +", ");
		System.out.print(bvo.getHTEL()      +", ");
		System.out.print(bvo.getHHP()      +", ");
		System.out.print(bvo.getHEMAIL()      +", ");
		System.out.print(bvo.getHADDR()      +", ");
		System.out.print(CodeUtil.hobby(bvo.getHHOBBY())      +", ");
		System.out.print(bvo.getHPHOTO()      +", ");
		System.out.print(bvo.getHSKILL()      +", ");
		System.out.print(CodeUtil.job(bvo.getHJOB())      +", ");
		System.out.print(bvo.getDELETEYN()      +", ");
		System.out.print(bvo.getINSERTDATE()      +", ");
		System.out.println(bvo.getUPDATEDATE()      );
	}
	
	//println 함수
	public static void printlnBdmMemberVO(BdmMemberVO bvo) {
		
		System.out.println(bvo.getHNUM() );
		System.out.println(bvo.getHNAME() );
		System.out.println(bvo.getHID()   );
		System.out.println(bvo.getHPW()   );
		System.out.println(bvo.getHBIRTH());
		System.out.println(bvo.getHGENDER()  );
		System.out.println(bvo.getHTEL());
		System.out.println(bvo.getHHP()  );
		System.out.println(bvo.getHEMAIL());
		System.out.println(bvo.getHADDR() );
		System.out.println(CodeUtil.hobby(bvo.getHHOBBY()));
		System.out.println(bvo.getHPHOTO());
		System.out.println(bvo.getHSKILL());
		System.out.println(CodeUtil.hobby(bvo.getHJOB()));
		System.out.println(bvo.getDELETEYN());
		System.out.println(bvo.getINSERTDATE());
		System.out.println(bvo.getUPDATEDATE());
	}
	
	


}
