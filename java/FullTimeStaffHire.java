
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (Utsav Basyal)
 * @version (0.1v)
 */
public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName; 
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined= false;
    }
        //getter method of all attributes
    public int getSalary(){
        return salary;
    }
        //setter method of salary 
    public void setSalary(int Salary){
        if(joined==true){
            System.out.println("The Staff is already hired and hence it is not possible to change the salary");
        }else{
            this.salary=Salary;
        }
    }
    
    public int getWorkingHour(){
        return workingHour;
    }
    
    public void setWorkingHour(int WorkingHour){
        this.workingHour=WorkingHour;
    }
    
    public String getStaffName(){
        return staffName;
    }

    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }

    public String getAppointedBy(){
        return appointedBy;
    }
    
    public boolean getJoined(){
        return joined;
    }
    //method to hire full time staff
   public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
   {
       if(joined){
           System.out.println("The staff" +getStaffName()+"has already been hired on" +getJoiningDate());
       }
       else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            System.out.println("The staff is successfully hired now"); 
       }
   }
    //method to dispaly the details of the full time staff
    public void display()
   {
       super.display();
       if(joined==true)
       {
           System.out.println("Name of the Staff: "+this.staffName);
           System.out.println("Salary: R.S "+this.salary);
           System.out.println("Working Hour: "+this.workingHour);
           System.out.println("Date of joining: "+this.joiningDate);
           System.out.println("Qualification: "+this.qualification);
           System.out.println("Appointed by: "+this.appointedBy);
           
        }
        
   }
}


    
 