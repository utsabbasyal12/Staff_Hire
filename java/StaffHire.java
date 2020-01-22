
/**
 * Write a description of class StaffHire here.
 *
 * @author (Utsav Basyal)
 * @version (0.1v)
 */
public class StaffHire
{  
    //declare private variable
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    //assign the constructor parameter
    public StaffHire(int vacancyNumber, String designation, String jobType){
      this.vacancyNumber=vacancyNumber;
      this.designation=designation;
      this.jobType=jobType;
    }
     
    //getter and setter method of all attributes
    public int getVacancyNumber(){
        return vacancyNumber;
    }
    
    public void setVacancyNumber(int VacancyNumber){
        this.vacancyNumber=VacancyNumber;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    public void setDesignation(String Designation){
        this.designation=Designation;
    }
    
    public String getJobType(){
        return jobType;
    }
    
    public void setJobType(String JobType){
        this.jobType=JobType;
    }
    
        //Display method to give the output
    public void display(){
        System.out.println("Vacancy No   = " +vacancyNumber);
        System.out.println("Designation  = " +designation);
        System.out.println("JobType      = " +jobType);
    }
}
    
     

