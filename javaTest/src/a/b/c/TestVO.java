package a.b.c;

public class TestVO {

	String mnum;
	String mid;
	String mpw;
	String mhp;
	String mjuso;
	
	public TestVO() {
		
	}
	
	public TestVO(String mnum, 
				  String mid, 
				  String mpw, 
				  String mhp, 
				  String mjuso) {
		
		this.mnum = mnum;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.mjuso = mjuso;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMhp() {
		return mhp;
	}
	public void setMhp(String mhp) {
		this.mhp = mhp;
	}
	public String getMjuso() {
		return mjuso;
	}
	public void setMjuso(String mjuso) {
		this.mjuso = mjuso;
	}
}
