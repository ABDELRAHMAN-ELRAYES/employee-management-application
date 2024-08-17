import java.util.ArrayList;
public class Project {
    private int projectID;
    private String location;
    private double currentCost;
    private  Employee manager;
    private ArrayList<Budget>budgetList = new ArrayList<>();
    // view project information
    public void viewProject(){
        System.out.println("This project with ID "+this.projectID+" and located in "+this.location+" and the cost on this project is "+this.currentCost+" and the manager who responsible of it is "+this.manager.viewStaffMemberInfo());
        budgetList.forEach(budget ->{
            System.out.println(budget);
        });
    }
    // view the total budget of the project
    public void getTotalBudget(){
        //budgetList.forEach(budget ->{ // normal variables con not be modified by lambda expression
        //    totalBudget += budget.getValue();
        //});
        double totalBudget = 0 ;
        for(Budget budget:budgetList){
            totalBudget += budget.getValue();
        }
        System.out.println("The total budget on this project is : "+totalBudget);
    }
    //  Add new budget to budget list 
    public void addBudget(Budget budget){
        budgetList.add(budget);
        System.out.println("Budget is added successfully!.");
    }

}
