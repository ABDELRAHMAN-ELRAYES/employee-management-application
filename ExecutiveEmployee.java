public class ExecutiveEmployee extends SalariedEmployee {
    private double bonus;
    ExecutiveEmployee(String SSN,int id,String name,String phone,String email,Department dept ,double salary,double bonus){
        super(SSN,id,name,phone,email,dept,salary);
        this.bonus=bonus;
    }
    public double payroll(){
        return this.salary+this.bonus;
    }
}
