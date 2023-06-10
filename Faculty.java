import java.util.ArrayList;
import java.util.Scanner;
//A Faculty Member has a teaching schedule, which is an ArrayList of Courses.  !!!
public class Faculty extends Person {
    // Faculty is also subclass of Person.   --- check!
    //need construsctors!     -----     Check!
    public Faculty(){setFaculty();}
    public Faculty(String Name){setName(Name); setAddress();setFaculty();}
    //  A Faculty Member has an employee id number   --- check!
    private String empID;
    //  and a teaching schedule, which is an ArrayList of Courses.   --- check!
    private ArrayList<Course> teachingSchedule = new ArrayList<>();
    public void setEmpID(String EID){this.empID = EID;}
    public String getEmpID(){return empID;}
    //Provide a method to assign a Faculty Member to teach an existing Course and for a faculty member to find a class in the list and drop it.   ---   Check!
    //add and drop course are finished in person
    public void setFaculty(){
        Scanner nwScnr = new Scanner(System.in);
        show("Please set the Faculty Member's Employee ID: ");
        setEmpID(nwScnr.nextLine());
        show("Set to: " + getEmpID());
    }

    public String toString() {
        return this.getName() +
                " " +
                this.getHouseNum() +
                " " +
                this.getStreet() +
                " "+
                this.getCity() +
                " " +
                this.getState() +
                " " +
                this.getCountry() +
                " "+
                this.getZip() +
                " " +
                this.getEmpID();
    }
}