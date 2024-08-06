public class HourlyEmployee extends Employee {
    private double workedHours;
    private double rate;

    HourlyEmployee(int id,String name,String phone,String email,Department dept ,String SSN,double workedHours,double rate){
        super(SSN,id,name,phone,email,dept);
        this.workedHours=workedHours;
        this.rate=rate;
    }
    public void payroll(){
        double totalPayroll  = workedHours*rate;
        System.out.println("your Salary is : "+totalPayroll);
    }
}
