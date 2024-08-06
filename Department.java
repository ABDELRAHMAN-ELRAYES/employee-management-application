public class Department {
    private int departID;
    private String departName;
    
    Department(int id,String deptName ){
        this.setDepartID(id);
        this.setDepartName(deptName);
    }

    public void setDepartName(String name ){
        this.departName=name;
    }
    public void setDepartID(int id){
        this.departID=id;
    }
    
    public int getDepartID( ){
        return this.departID;    
    }
    public String getDepartName(){
        return this.departName;
    }
    public void viewDepartInfo(){
        System.out.println("This is the : "+this.getDepartName()+" department with ID : "+this.getDepartID());
    }
}
