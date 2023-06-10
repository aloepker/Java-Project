import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class Person extends Address {//Note that the subclasses of Person inherit the fields and methods of Person.
    // some subclasses may need method overriding
    private String name = "";
    public String getName() {
        return name;
    }
    public void setName(String N) {
        this.name = N;
    }
    //Person Class A Person has a name   ---   check!
    // and an Address, somehow..    ----   Check!
    // also some kind of constructor perhaps   ---   Check!
    public Person() {
        setPerson();
    }
    public Person(String Name) {
        setName(Name);
        setAddress();
    }
    public void setPerson() {  //text user interface to set variables   ---   Check!
        Scanner newScnr = new Scanner(System.in);
        show("Please enter the Person's Name");
        setName(newScnr.nextLine());
        show("Set to: " + getName());
        setAddress();
    }
    // and a course schedule represented by an ArrayList of Courses   --- check!
    ArrayList CourseSchedule = new ArrayList();
    //   You must provide methods for a student (or faculty) to add and drop an existing Course   ---   Check!
    public void addCourse() {
        Scanner csScnr = new Scanner(System.in);
        show("Please chose a course: ");

        showCourses();

        show("Enter selection Number: ");
        String choice = (csScnr.nextLine());
        show("You chose: " + choice);
        CourseSchedule.add(choice);
    }
    public void dropCourse() {
        String TerminalChoice;
        Scanner csScnr = new Scanner(System.in);
        do {
            show("Please chose a course to drop: ");
            showCourses();
            show("Enter selection Number: ");
            int choice = parseInt(csScnr.nextLine());
            show("You chose: " + choice);
            show("Are you sure?");
            show("Enter 1 for Yes, 2 for No, 3 to cancel");
            TerminalChoice = (csScnr.nextLine());
            if (TerminalChoice == "1") {
                int indx = (choice - 1);
                CourseSchedule.remove(indx);
            }
        } while (TerminalChoice == "2");
    }
        public void showCourses() {  //show list of courses with loop that adds selection numbers   ---   check!
        int choiceNum;
        for (int i = 0; i< CourseSchedule.size(); i++){choiceNum=(i+1);show(CourseSchedule.get(i) + " :" + choiceNum);}
    }
}