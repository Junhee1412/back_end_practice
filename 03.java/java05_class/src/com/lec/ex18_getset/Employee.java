package com.lec.ex18_getset;
import java.util.Date;
import java.util.Objects;

public class Employee {
	private int empno;
	private String ename;
	private Date hiredate;
	private int sal;
	private int deptno;
	private String ssn;
	private boolean 질병;
	private boolean 관리자;
	public int getEmpno() {
		return empno;
	}




	// 화면 우클릭 > 소스 > 제너레이트 게터세터
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public boolean is질병() {
		return 질병;
	}
	public void set질병(boolean 질병) {
		this.질병 = 질병;
	}
	public boolean is관리자() {
		return 관리자;
	}
	public void set관리자(boolean 관리자) {
		this.관리자 = 관리자;
	}



	// 기본생성자? 
	public Employee() {}
	
	
	// 우클릭 > 소스 > 어쩌구 유징필드
	public Employee(int empno, String ename, Date hiredate, int sal, int deptno, String ssn, boolean 질병, boolean 관리자) {
		//super();
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.ssn = ssn;
		this.질병 = 질병;
		this.관리자 = 관리자;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(deptno, empno, ename, hiredate, sal, ssn, 관리자, 질병);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		/*return deptno == other.deptno && empno == other.empno && Objects.equals(ename, other.ename)
				&& Objects.equals(hiredate, other.hiredate) && sal == other.sal && Objects.equals(ssn, other.ssn)
				&& 관리자 == other.관리자 && 질병 == other.질병;*/
		return empno == other.empno && Objects.equals(ename,other.ename);
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + ", deptno="
				+ deptno + ", ssn=" + ssn + ", 질병=" + 질병 + ", 관리자=" + 관리자 + "]";
	}
}
