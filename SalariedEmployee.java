public class SalariedEmployee extends Employee {
    public double salary;

    SalariedEmployee(String SSN,int id,String name,String phone,String email,Department dept ,double salary){
        super(SSN,id,name,phone,email,dept);
        this.salary=salary;
    }
    public double payroll(){
        return this.salary;
    }


}
