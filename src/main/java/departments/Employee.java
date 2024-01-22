package departments;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "EMP", schema = "SCOTT", catalog = "")
public class Employee {
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
    @Column(name = "HIREDATE")
    private Date hiredate;
    @Basic
    @Column(name = "SAL")
    private Integer sal;
    @Basic
    @Column(name = "COMM")
    private Integer comm;
    @ManyToOne
    @JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
    private Department deptByDeptno;

    @ManyToOne
    @JoinColumn(name = "MGR", referencedColumnName = "EMPNO")
    private Employee manager;

    @OneToMany (mappedBy = "manager")
    private Collection<Employee> subordinats;
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

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee empEntity = (Employee) o;

        if (empno != empEntity.empno) return false;
        if (ename != null ? !ename.equals(empEntity.ename) : empEntity.ename != null) return false;
        if (job != null ? !job.equals(empEntity.job) : empEntity.job != null) return false;
        if (hiredate != null ? !hiredate.equals(empEntity.hiredate) : empEntity.hiredate != null) return false;
        if (sal != null ? !sal.equals(empEntity.sal) : empEntity.sal != null) return false;
        if (comm != null ? !comm.equals(empEntity.comm) : empEntity.comm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) empno;
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        return result;
    }

    public Department getDeptByDeptno() {
        return deptByDeptno;
    }

    public void setDeptByDeptno(Department deptByDeptno) {
        this.deptByDeptno = deptByDeptno;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", manager" + manager +
                '}';
    }
}
