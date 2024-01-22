package departments;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "DEPT", schema = "SCOTT", catalog = "")
public class Department {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DEPTNO")
    private byte deptno;
    @Basic
    @Column(name = "DNAME")
    private String dname;
    @Basic
    @Column(name = "LOC")
    private String loc;
    @OneToMany(mappedBy = "deptByDeptno")
    private Collection<Employee> empsByDeptno;

    public byte getDeptno() {
        return deptno;
    }

    public void setDeptno(byte deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (deptno != that.deptno) return false;
        if (dname != null ? !dname.equals(that.dname) : that.dname != null) return false;
        if (loc != null ? !loc.equals(that.loc) : that.loc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) deptno;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (loc != null ? loc.hashCode() : 0);
        return result;
    }

    public Collection<Employee> getEmpsByDeptno() {
        return empsByDeptno;
    }

    public void setEmpsByDeptno(Collection<Employee> empsByDeptno) {

        this.empsByDeptno = empsByDeptno;
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
