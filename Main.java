import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Department>departments = new ArrayList<>();
        Department dept = new Department(121,"IT");
        departments.add(dept);
        viewAllDepartments(departments);

    }
    // a function to view all departments we have 
    public static void viewAllDepartments(ArrayList<Department>departments){
        for(Department dept : departments){
            dept.viewDepartInfo();
        }
    }

}