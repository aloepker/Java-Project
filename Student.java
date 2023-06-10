import java.util.ArrayList;
import java.util.Scanner;
//student class has a course schedule represented by an ArrayList of Courses   !!!
//You must provide ways for a student to add and drop an existing Course.  !!!
public class Student extends Person{
    //In addition to the data inherited from Person   ---   check!
//need constructors!   ---   Check!
    public Student(){//setPerson();
        setStudent();}
    public Student(String Name){setName(Name);setAddress();setStudent();}
    // a student has CIN --- check!
    private String CIN; //string to avoid invalid type exception instead of exception handling.
    public String getCIN(){return CIN;}
    public void setCIN(String C){this.CIN = C;}
    public void setStudent(){
        Scanner nwScnr = new Scanner(System.in);
        show("Please set the Student's CIN: ");
        setCIN(nwScnr.nextLine());
        show("Set to: " + getCIN());
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
                this.getCIN();
    }
}