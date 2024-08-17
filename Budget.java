public class Budget {
    private int ID;
    private double value;
    public double getValue(){
        return this.value;
    }
    // increase the value of the budget
    public void increaseBudget(double amount){
        this.value += amount;
        System.out.println("The budget is increased by "+amount+" Successfully!.");
    }
}
