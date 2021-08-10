package a.b.c.ch9;

public class Ex_DeptVO {
	
	private String deptno;
	private String dname;
	private String loc;
	
	
	//이렇게 빈 생성자가 없으면 디폴트 생성자가 불러지지 않아서
	//오버로딩이 되지 않음
	public Ex_DeptVO() {
		
	}
	
	public Ex_DeptVO(String deptno
				   , String dname
				   , String loc){
		
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
	public String getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
