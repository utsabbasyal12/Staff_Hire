/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Utsav Basyal)
 * @version (0.1v)
 */
public class PartTimeStaffHire extends StaffHire
{
     // declear private variable
   private int workingHour;
   private int wagesPerHour;
   private String staffName;
   private String joiningDate;
   private String qualification;
   private String appointedBy;
   private String shifts;
   private boolean joined;
   private boolean terminated;
        
        //assign the constructor
   public PartTimeStaffHire(int vacancyNumber, String designation, String jobType,
   int workingHour,int wagesPerHour,String shifts)
   {
       super(vacancyNumber, designation, jobType);//calling the staffHire class as (super class)
       this.workingHour=workingHour;
       this.wagesPerHour=wagesPerHour;
       this.shifts=shifts;
       staffName="";
       joiningDate="";
       qualification="";
       appointedBy="";
       joined=false;
       terminated=false;
   }
     // getter method for all the subclass attributes
   public int getWorkingHour()
   {
      return workingHour;
   }
   public int getWagesPerHour()
   {
       return wagesPerHour;
   }
   
   public String getJoiningDate()
   {
       return joiningDate;
   }
   public String getStaffName()
   {
        return staffName;
   }
   public String getQualification()
   {
        return qualification;
   }
   public String getAppointedBy()
   {
        return appointedBy;
   }
   public boolean getJoined()
   {
        return joined;
   }
   public boolean getTerminated()
   {
       return terminated;
   }
   public String getShifts()
   {
       return shifts;
   }
   public void setshifts(String shifts)
   {
       if(joined==true){
           System.out.println("Staff is already hired,cannot change the shift");
        }
            else{
                this.shifts=shifts;
            }
   }
    //method to hire part time staff 
   public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
   {
       if(joined){
           System.out.println("The staff" +getStaffName()+ "is already hired on" +getJoiningDate());
       }
       else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
            System.out.println("The staff is successfully hired now"); 
       }
   }
    //method to terminate the staff
   public void terminated()
   {
       if(terminated==true)
       {
           System.out.println("The staff has been already terminated");
        }
        else
        {
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
            System.out.println("Staff is now sucessfull terminated");
        }
   }
    //method to display the details of the part time staff hire
   public void display()
   {
       super.display(); 
       if(joined==true)
       {
           System.out.println("Name of the Staff: "+this.staffName);
           System.out.println("Wages Per Hour: "+this.wagesPerHour);
           System.out.println("Working Hour: "+this.workingHour);
           System.out.println("Date of joining: "+this.joiningDate);
           System.out.println("Qualification: "+this.qualification);
           System.out.println("Appointed by: "+this.appointedBy);
           System.out.println("Income per day: "+(this.wagesPerHour*this.workingHour));
        }
    }
}
    