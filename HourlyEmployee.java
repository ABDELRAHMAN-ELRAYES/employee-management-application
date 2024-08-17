public class HourlyEmployee extends Employee {
    private double workedHours;
    private double rate;

    HourlyEmployee(int id,String name,String phone,String email,Department dept ,String SSN,double workedHours,double rate){
        super(SSN,id,name,phone,email,dept);
        this.workedHours=workedHours;
        this.rate=rate;
    }
    public double payroll(){
        return this.workedHours*rate;
    }
    public void addHours(int hours){
        this.workedHours+=hours;
        System.out.println("The additional woked hours is added ,successfully");
    }
}
