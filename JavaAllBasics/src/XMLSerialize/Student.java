
package XMLSerialize;

public class Student 
{
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String toString() {
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }
    
}
