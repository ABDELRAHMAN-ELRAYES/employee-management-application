
import java.util.ArrayList;
import java.util.Scanner;
public class Staff {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<StaffMember>stafMembers= new ArrayList<>();
    
    public void addMember(StaffMember member){
        stafMembers.add(member);
        System.out.println("This member added successfully!");
    }
    public void updateMember(int memberID){
        boolean checkFound = false;
        for(StaffMember member :stafMembers){
            if(memberID==member.employeeID){
                checkFound=true;
                System.out.println("1- name");
                System.out.println("2- phone");
                System.out.println("3- email");
                System.out.println("4- Department");
                
                System.out.print("Enter the number of employee data you want to update: ");
                int dataNumber = scanner.nextInt();
                System.out.println();
                switch (dataNumber) {
                    case 1:
                        System.out.print("Enter the new name: ");
                        String newName = scanner.next();
                        System.out.println();
                        member.setName(newName);
                        System.out.println("name is updated successfully!");
                        break;
                    case 2:
                    
                        System.out.print("Enter the new phone: ");
                        String newPhone = scanner.next();
                        System.out.println();
                        member.setPhone(newPhone);
                        System.out.println("phone is updated successfully!");
                        break;
            
                    case 3:

                        System.out.print("Enter the new email: ");
                        String newEmail = scanner.next();
                        System.out.println();
                        member.setEmail(newEmail);
                        System.out.println("email is updated successfully!");
                        break;
            
                    case 4:

                        System.out.print("Enter the new department name: ");
                        String newDeptName = scanner.next();
                        System.out.println();
                        System.out.print("Enter the new department id: ");
                        int newDeptID = scanner.nextInt();
                        System.out.println();
                        Department dept = new Department(newDeptID, newDeptName);
                        member.setDept(dept);
                        System.out.println("Department is updated successfully!");
                        break;
                    default:
                        break;
                }
            }
            if(!checkFound){
                System.out.println("Sorry, Employee with ID entered is not found.");
            }
        }
    }
    // delete a member 
    public void deleteMember(StaffMember member){
        stafMembers.remove(member);
        System.out.println("This member deleted successfully!");
    }
    // show each employee info in proper format
    public void viewAll(){
        for(StaffMember member:stafMembers){
            System.err.println(member.viewStaffMemberInfo());
        }
    }
    // this must return the total salary for all employees
    public void callPayroll(){
        long totalSalary = 0;
        for(StaffMember member:stafMembers){
            totalSalary += member.payroll();
        }
        System.out.println("The total salary of all employees :  "+totalSalary);
    }
}
