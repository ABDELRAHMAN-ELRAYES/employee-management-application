public class StaffMember {
    protected int employeeID;
    protected String name;
    protected String phone;
    protected String email;    
    public String viewStaffMemberData(int employeeID){
        return "This is a staff member with ID "+ this.employeeID+" and his name is "+this.name+" who have phone : "+this.phone+" and Email : "+this.email;

    }
    // public double pay(){
    //     return
    // }
}
