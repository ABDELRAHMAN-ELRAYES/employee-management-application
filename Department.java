public class Department {
    private int departID;
    private String departName;
    public void setDepartID(int id ){
        this.departID=id;
    }

    public void setDepartName(String name ){
        this.departName=name;
    }
    public int getDepartID( ){
        return this.departID;    
    }
    public String getDepartName(){
        return this.departName;
    }
    public void showDepart(){
        System.out.println("This is the : "+this.getDepartName()+" department with ID : "+this.getDepartID());
    }
}
