import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);

    static Staff staff = new Staff();
    static ArrayList<Department>departments = new ArrayList<>();
    static ArrayList<Project>porjects = new ArrayList<>();
    public static void main(String[]args){
            Department dept1 = new Department(1, "IS");
            Department dept2 = new Department(2, "AI");
            Department dept3 = new Department(3, "SE");
            Department dept4 = new Department(4, "CS");
            departments.add(dept1);
            departments.add(dept2);
            departments.add(dept3);
            departments.add(dept4);
            addExecutiveEmployee(1,"john",   "111111", "john@gmail.com", dept1);
            addExecutiveEmployee(1,"kris",   "222222", "kris@gmail.com", dept2);
            addExecutiveEmployee(1,"ahmed",  "333333", "ahmed@gmail.com", dept3);
            addExecutiveEmployee(1,"mahmoud", "444444", "mahmoud@gmail.com", dept4);



            
            System.out.println("1- Department");
            System.out.println("2- Staff");
            System.out.println("3- Project");
            System.out.print("Enter the number of your choice : ");
            int chooseNumber=scanner.nextInt();
            System.out.println();

            switch (chooseNumber) {
                case 1:
                    chooseDeptartmentOption();
                    break;
                case 2:
                    chooseStaffOption();
                    break;
                case 3:
                    chooseProjectOption();
                    break;
                default:
                viewError();
                    break;
            }




    }
    //choose error function 
    public static void viewError(){
        System.out.println("Error,sorry your choice is not correct ,Try Again!");
    }
    // a function to view all departments we have 
    public static void viewAllDepartments(ArrayList<Department>departments){
        for(Department dept : departments){
            dept.viewDepartInfo();
        }
    }
    // view options and implement operations on department choose
    public static void chooseDeptartmentOption(){
        System.out.println("1- Add New Department");
        System.out.println("2- View All Departments");
        System.out.print("Enter the number of your choice : ");
        int departmentOpt=scanner.nextInt();
        System.out.println();
        switch (departmentOpt) {
            case 1:
                Department newDept = addNewDepartment();
                departments.add(newDept);
                System.out.println("The new Department is added successfully.");
                break;
            case 2:
                viewAllDepartments(departments);
                break;
            default:
                viewError();   
                break;
        }
    }
    // add new department
    public static Department addNewDepartment(){
        System.out.print("Enter the name of Department : ");
        String newDeptName = scanner.next();
        System.out.println();
        System.out.print("Enter the ID of Department : ");
        int newDeptId = scanner.nextInt();
        System.out.println();
        Department newDept = new Department(newDeptId, newDeptName);
        return newDept;
        
    }

    // view options and implement operations on staff choose
    public static void chooseStaffOption(){
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
                addNewMember();
                break;
            case 2:
                staff.viewAll();
                break;
            case 3:
                staff.callPayroll();
                break;
            case 4:
                System.out.print("Enter Employee ID : ");
                int employeeID = scanner.nextInt();
                System.out.println();
                staff.deleteMember(employeeID);
                break;
            case 5:
                System.out.print("Enter Employee ID : ");
                int employeeIDUpdate = scanner.nextInt();
                System.out.println();
                staff.updateMember(employeeIDUpdate);
                break;
            default:
                viewError();
                break;
        }
    }
    // add new member in staff option 
    public static void addNewMember(){
        System.out.println("1- Commisssion Employee");
        System.out.println("2- Salaried Employee");
        System.out.println("3- Hourly Employee");
        System.out.println("4- Executive Employee");
        System.out.println("5- Volunteer");
        System.out.print("Enter the number of your choice : ");
        int newMemberType=scanner.nextInt();
        System.out.println();
        System.out.print("Enter ID : ");
        int newMemberId = scanner.nextInt();
        System.out.println();
        System.out.print("Enter name : ");
        String newMemberName = scanner.next();
        System.out.println();
        System.out.print("Enter phone : ");
        String newMemberPone = scanner.next();
        System.out.println();
        System.out.print("Enter email : ");
        String newMemberEmail = scanner.next();
        System.out.println();

        Department dept = addNewDepartment();// Error the logic is not correct cz you must enter the id of department and search for it in the current departments list 

        switch (newMemberType) {
            case 1:
                addCommissionEmployee(newMemberId,newMemberName,newMemberPone,newMemberEmail,dept);
                break;
            case 2:
                addSalariedEmployee(newMemberId, newMemberName, newMemberPone, newMemberEmail, dept);
                break;
            case 3:

                addHourlyEmployee(newMemberId, newMemberName, newMemberPone, newMemberEmail, dept);
                break;
            case 4:
                addExecutiveEmployee(newMemberId, newMemberName, newMemberPone, newMemberEmail, dept);
                break;
            case 5:

                System.out.print("Enter Volunteer Amount : ");
                double newMemberAmount = scanner.nextDouble();

                Volunteer volunteer = new Volunteer(newMemberId, newMemberName, newMemberPone, newMemberEmail, dept, newMemberId);
                staff.addMember(volunteer);
                System.out.println();
                break;
            default:
                viewError();
                break;
        }
        System.out.println("The new Member is added successfully.");
    }
    // add new commission employee 
    public static void addCommissionEmployee(int newMemberId,String newMemberName,String newMemberPone,String  newMemberEmail,Department dept){

        System.out.print("Enter SSN : ");
        String newCommissionMemberSsn = scanner.next();
        System.out.println();

        System.out.print("Enter Employee Target : ");
        double newMemberTarget = scanner.nextDouble();
        System.out.println();

        CommissionEmployee commissionEmployee= new CommissionEmployee(newCommissionMemberSsn, newMemberId, newMemberName, newMemberPone, newMemberEmail, dept, newMemberTarget);
        staff.addMember(commissionEmployee);
    }
    // add new salaried employee 
    public static void addSalariedEmployee(int newMemberId,String newMemberName,String newMemberPone,String  newMemberEmail,Department dept){

        System.out.print("Enter SSN : ");
        String newSalariedMemberSsn = scanner.next();
        System.out.println();

        System.out.print("Enter Employee Salary : ");
        double newMemberSalary = scanner.nextDouble();
        System.out.println();

        SalariedEmployee salariedEmployee = new SalariedEmployee(newSalariedMemberSsn, newMemberId, newMemberName, newMemberPone, newMemberEmail, dept, newMemberSalary);
        staff.addMember(salariedEmployee);
    }
    // add new Hourly employee 
    public static void addHourlyEmployee(int newMemberId,String newMemberName,String newMemberPone,String  newMemberEmail,Department dept){

        System.out.print("Enter SSN : ");
        String newHourlyMemberSsn = scanner.next();
        System.out.println();


        System.out.print("Enter Emplyee Worked Hours : ");
        double newMemberWorkedHours = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter Emplyee Rate : ");
        double newMemberRate = scanner.nextDouble();
        System.out.println();

        HourlyEmployee hourlyEmployee =new HourlyEmployee(newMemberId, newMemberName, newMemberPone, newMemberEmail, dept, newHourlyMemberSsn, newMemberWorkedHours, newMemberRate);
        staff.addMember(hourlyEmployee);
    }
    // add new Executive employee 
    public static void addExecutiveEmployee(int newMemberId,String newMemberName,String newMemberPone,String  newMemberEmail,Department dept){

        System.out.print("Enter SSN : ");
        String newExecutiveMemberSsn = scanner.next();
        System.out.println();

        System.out.print("Enter Emplyee ronus : ");
        double newMemberBonus = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter Emplyee ronus : ");
        double newExecutiveMemberSalary = scanner.nextDouble();
        System.out.println();
        
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(newExecutiveMemberSsn, newMemberId, newMemberName, newMemberPone, newMemberEmail, dept, newExecutiveMemberSalary, newMemberBonus);
        
        staff.addMember(executiveEmployee);
    }

    // view options and implement operations on project choose
    public static void chooseProjectOption(){
        System.out.println("1- Add New Project");
        System.out.println("2- view All Projects");
        System.out.println("3- Add budget to existing project");
        System.out.println("4- Increase pudget to existing project");
        System.out.print("Enter the number of your choice : ");
        int projectChoose=scanner.nextInt();
        System.out.println();
        switch (projectChoose) {
            case 1:
                addNewProject();
                break;
            case 2:
                staff.viewAll();
                break;
            case 3:
                staff.callPayroll();
                break;
            case 4:
                System.out.print("Enter Employee ID : ");
                int employeeID = scanner.nextInt();
                System.out.println();
                staff.deleteMember(employeeID);
                break;
            case 5:
                System.out.print("Enter Employee ID : ");
                int employeeIDUpdate = scanner.nextInt();
                System.out.println();
                staff.updateMember(employeeIDUpdate);
                break;
            default:
                viewError();
                break;
        }
    }
    public static void addNewProject(){
            System.out.print("Enter project ID : ");
            int newProjectId = scanner.nextInt();
            System.out.println();
            System.out.print("Enter project location : ");
            String newProjectLocation = scanner.next();
            System.out.println();
            System.out.print("Enter current cost : ");
            double newProjectCost = scanner.nextDouble();
            System.out.println();

            System.out.print("Enter ID of the manager : ");
            int managerId = scanner.nextInt();
            System.out.println();
            StaffMember manager = staff.searchFoStaffMember(managerId);
            if(manager != null){
                Project project = new Project(managerId, newProjectLocation, newProjectCost, manager);
            }else{
                System.out.println("The manager with entered id is not found");
            }


            
    }
}