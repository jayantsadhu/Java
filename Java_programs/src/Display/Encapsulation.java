
package Display;

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Emp obj=new Emp();
        obj.setEmpId(1452);
        obj.setEmpName("Jayant Kumar Sadhu");
        System.out.println(obj.getEmpId());
        System.out.println(obj.getEmpName());
    }
    
}
class Emp
{
    private int EmpId;
    private String EmpName;

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    public int getEmpId()
    {
        return EmpId;
    }
        public String getEmpName()
    {
        return EmpName;
    }
    
}
        
