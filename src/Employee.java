public class Employee {
    private int id;
    private String fname;
    private String lnanme;
    private Department dep;
    private String pos;
    //Constructor
    public Employee(){
        this("?","?");//call other constructor
    }//default constructor
    public Employee(String fname,String lnanme){
        this.fname = fname;
        this.lnanme = lnanme;
    }
    public String getFname(){
        return fname+" "+lnanme;
    }
}
