public class CommissionEmployee extends Employee {
    public double target;
    CommissionEmployee(String SSN,int id,String name,String phone,String email,Department dept ,double target){
        super(SSN,id,name,phone,email,dept);
        this.target=target;
    }
}
