import java.util.Scanner;
public class Course{
// need constructors!   ---   Check!
public Course(){setCourse();}
    public Course(String Title){setName(Title);setCourse();}
    private String courseName = "";
    private String courseCode;
    private String numCredits;  // should be an int maybe..
    // Getters
    public String getName(){ return courseName; }
    public String getCourseCode() {
        return courseCode;
    }
    public String getNumCredits() {
        return numCredits;
    }

    // Setters
    public void setName(String Name){this.courseName = Name;}
    public void setCourseCode(String C) {
        this.courseCode = C;
    }
    public void setNumCredits(String N){
        this.numCredits = N;
    }
    //Course Class has a course code (eg, 2261 3)   ---   check!
    // and a number of credits (int).                       ---    Check!
public void show(Object O){System.out.println(O);}
    public void setCourse(){
        Scanner cScnr = new Scanner(System.in);
        if(this.courseName ==""){show("Please set the Course Name: ");
            setName(cScnr.nextLine());
            show("Set to: " + getName());}
        show("Please set the Course Code: ");
        setCourseCode(cScnr.nextLine());
        show("Set to: " + getCourseCode());
        show("Please set the Number of Credits: ");
        setNumCredits(cScnr.nextLine());
        show("Set to: " + getNumCredits());
    }

    public String toString() {
        return this.getName() +
                " " +
                this.getCourseCode() +
                " " +
                this.getNumCredits();
    }
}