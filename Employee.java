public abstract class Employee extends StaffMember {
    protected String SSN ;
    Employee(String SSN,int id,String name,String phone,String email,Department dept){
        super(id,name,phone,email,dept);
        this.SSN=SSN;
    }
    
}
