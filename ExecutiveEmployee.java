public class ExecutiveEmployee extends SalariedEmployee {
    private double bonus;
    ExecutiveEmployee(String SSN,int id,String name,String phone,String email,Department dept ,double salary,double bonus){
        super(SSN,id,name,phone,email,dept,salary);
        this.bonus=bonus;
    }
    public void payroll(){
        double totalSalary  = this.salary+this.bonus;
        System.out.println("your salary is : "+totalSalary);
    }
}
