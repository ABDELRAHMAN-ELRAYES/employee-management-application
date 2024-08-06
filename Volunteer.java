public class Volunteer extends StaffMember {
    private int amount;
    Volunteer(int id,String name,String phone,String email,Department dept ,int amount){
        super(id,name,phone,email,dept);
        this.amount=amount;
    }
}
