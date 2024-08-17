import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            ArrayList<Department>departments = new ArrayList<>();
            // Department dept = new Department(121,"IT");
            // departments.add(dept);
            // viewAllDepartments(departments);

            System.out.println("1- Department");
            System.out.println("2- Staff");
            System.out.println("3- Project");
            System.out.print("Enter the number of your choice : ");
            int chooseNumber=scanner.nextInt();
            System.out.println();

            switch (chooseNumber) {
                case 1:
                        System.out.println("1- Add New Department");
                        System.out.println("2- View All Departments");
                        System.out.print("Enter the number of your choice : ");
                        int departmentOpt=scanner.nextInt();
                        System.out.println();
                        switch (departmentOpt) {
                            case 1:
                                String newDeptName = scanner.next();
                                int newDeptId = scanner.nextInt();
                                Department newDept = new Department(newDeptId, newDeptName);
                                departments.add(newDept);
                                System.out.println("The new Department is added successfully.");
                                break;
                            case 2:
                                viewAllDepartments(departments);
                            break;
                            default:
                                System.out.println("Sorry, your choice is not correct ,Try Again!");
                                break;
                        }
                        break;
                case 2:
                        System.out.println("1- Add New Member");
                        System.out.println("2- view All Members");
                        System.out.println("3- calculate Payroll");
                        System.out.println("4- Delete Member");
                        System.out.println("5- updata Member");
                        System.out.print("Enter the number of your choice : ");
                        int staffNumber=scanner.nextInt();
                        System.out.println();
                        switch (staffNumber) {
                            case 1:

                            String newMemberName = scanner.next();
                            String newMemberType = scanner.next();
                            
                            System.out.println("The new Member is added successfully.");
                                break;
                            case 2:
                                viewAllDepartments(departments);
                            break;
                            case 3:
                                break;
                            case 4:
                                viewAllDepartments(departments);
                            break;
                            default:
                                System.out.println("Sorry, your choice is not correct ,Try Again!");
                                break;
                        }
                        break;
                case 3:
                    
                    break;
                
                default:
                    break;
            }




    }
    // a function to view all departments we have 
    public static void viewAllDepartments(ArrayList<Department>departments){
        for(Department dept : departments){
            dept.viewDepartInfo();
        }
    }

}