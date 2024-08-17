public abstract  class StaffMember {
    protected int employeeID;
    protected String name;
    protected String phone;
    protected String email;
    protected Department dept;
    StaffMember(int id,String name,String phone,String email,Department dept){
        this.employeeID=id;
        this.setName(name);
        this.setPhone(phone);
        this.setEmail(email);
        this.setDept(dept);
    }
    public void setName(String name){
        this.name=  name;   
   }
   public void setPhone(String phone){
        this.phone= phone;   
    }
    public void setEmail(String email){
        this.email= email;   
    }
    public void setDept(Department dept){
        this.dept=dept;
    }
    public String viewStaffMemberInfo(){
        return "This is a staff member with ID "+ this.employeeID+" and his name is "+this.name+" who have phone : "+this.phone+" and Email : "+this.email;
    }
    public abstract double payroll();
}
