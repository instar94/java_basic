package a.b.c.ch9;

//VO는 데이터를 담는통
//Value Object => Data Transport Object (Beans)
//명명규칙 : 클래스이름+VO
public class Ex_EmpVO {
	
	//정보 은닉화(private) : 정보를 밖으로 세지 않도록 하기 위함
	//데이터를 쓰려면 getter-setter를 통해서 한정적으로만 사용
	//전부 String으로 선언함
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;
	
	//생성자
		public Ex_EmpVO() {
			
		}
	
	public Ex_EmpVO(String empno
				  , String ename
				  , String job
				  , String mgr
				  , String hiredate
				  , String sal
				  , String comm,
				  	String deptno) {
		
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	


	//getter 함수
	public String getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getMgr() {
		return mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public String getSal() {
		return sal;
	}
	public String getComm() {
		return comm;
	}
	public String getDeptno() {
		return deptno;
	}
	
	//setter 함수
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	

}
