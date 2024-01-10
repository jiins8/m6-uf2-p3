package departments;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "EMP", schema = "SCOTT", catalog = "")
public class EmpEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPNO")
    private short empno;
    @Basic
    @Column(name = "ENAME")
    private String ename;
    @Basic
    @Column(name = "JOB")
    private String job;
    @Basic
    @Column(name = "MGR")
    private Short mgr;
    @Basic
    @Column(name = "HIREDATE")
    private Date hiredate;
    @Basic
    @Column(name = "SAL")
    private Integer sal;
    @Basic
    @Column(name = "COMM")
    private Integer comm;
    @Basic
    @Column(name = "DEPTNO")
    private Byte deptno;
    @ManyToOne
    @JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
    private DeptEntity deptByDeptno;

    public short getEmpno() {
        return empno;
    }

    public void setEmpno(short empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Short getMgr() {
        return mgr;
    }

    public void setMgr(Short mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getComm() {
        return comm;
    }

    public void setComm(Integer comm) {
        this.comm = comm;
    }

    public Byte getDeptno() {
        return deptno;
    }

    public void setDeptno(Byte deptno) {
        this.deptno = deptno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntity empEntity = (EmpEntity) o;

        if (empno != empEntity.empno) return false;
        if (ename != null ? !ename.equals(empEntity.ename) : empEntity.ename != null) return false;
        if (job != null ? !job.equals(empEntity.job) : empEntity.job != null) return false;
        if (mgr != null ? !mgr.equals(empEntity.mgr) : empEntity.mgr != null) return false;
        if (hiredate != null ? !hiredate.equals(empEntity.hiredate) : empEntity.hiredate != null) return false;
        if (sal != null ? !sal.equals(empEntity.sal) : empEntity.sal != null) return false;
        if (comm != null ? !comm.equals(empEntity.comm) : empEntity.comm != null) return false;
        if (deptno != null ? !deptno.equals(empEntity.deptno) : empEntity.deptno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) empno;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mgr != null ? mgr.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        result = 31 * result + (deptno != null ? deptno.hashCode() : 0);
        return result;
    }

    public DeptEntity getDeptByDeptno() {
        return deptByDeptno;
    }

    public void setDeptByDeptno(DeptEntity deptByDeptno) {
        this.deptByDeptno = deptByDeptno;
    }
}
