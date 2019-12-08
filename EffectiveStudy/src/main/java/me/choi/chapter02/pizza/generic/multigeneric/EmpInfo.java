package me.choi.chapter02.pizza.generic.multigeneric;

public class EmpInfo {
    private int empno;
    private int deptno;
    private String addr;

    public EmpInfo(int empno, int deptno, String addr) {
        this.empno = empno;
        this.deptno = deptno;
        this.addr = addr;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
