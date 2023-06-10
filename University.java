import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
//University Class Write a University class that maintains lists of Students, Courses, and Faculty Members and has an instance method containing a menu that provides ways to list them and to create them and add them to the list.
public class University {

    public void show(Object O){System.out.println(O);}  //method to shorten print line syntax

//maintains (array?)lists of Students, Courses, and Faculty Members

    //so everytime a new student or faculty or course is created, I should add it to this list in its constructor perhaps?
ArrayList students = new ArrayList();  //ha ha! these are my objects to hold the new whatevers!!!! sweeet!!!!!!!!!
ArrayList courses = new ArrayList();
ArrayList faculty = new ArrayList();

boolean Continue = true;

//  and has an instance method containing a menu that provides ways to list
//  these three and to create them and add them to the existing list.
public void subMenuList(String menu){
    // so here i start with a case to print the first line, which is the menu name I am in based off the passed in parameter
    switch (menu){
        case "1":
            show("Student Menu");
            break;
        case "2":
            show("Courses menu");
            break; // not needed but does stop further testing in the case after the first match
        case "3":
        show("Faculty Menu");
    }
    //then I print the standard 4 questions
    show("");
    show("1. Show List");
    show("2. Add");
    show("3. Remove");
    show("4. Back to Main Menu");
    show("");
    show("Please enter a number to make a selection:");
// this will be repeated a lot followed by a request for the user's next line, which could be the return type if I choose..
//return
}

public void mainScreenList(){//simply prints the list for the main screen one line at a time
    show("University Menu Main Screen");
    show("");
    show("1. Students");
    show("2. Courses");
    show("3. Faculty");
    show("4. End program");
    show("");
    show("Please enter a number to make a selection:");
}
public String selectionLoop(String uInput, Scanner inpt){
    do {//while not 4
        if (uInput.matches("1") || uInput.matches("2") || uInput.matches("3")||uInput.matches("4")) {
            subMenuList(uInput);
            String thisInput = inpt.nextLine();
return thisInput;
        }else{show("Error: Please Enter a number from above:");}
    }
    //the variable sent in above to start this will never change, thes never equaling 4..
    while (uInput.matches("4")) ;
    return uInput;
}
    public void Menu(){
        //uhh..... we are gunna do a phone keypad/numeric style ui
        // press this for this, press this for this :D
// while loop and switch statement
do {mainScreenList();
    Scanner input = new Scanner(System.in);
    String userInput = input.nextLine();


//loop to cycle through the menu's with a case statement in a loop
    //error check in the loop with a case statement I think
    do{switch(userInput){
        case "1": // student sub menu
            do {switch (selectionLoop(userInput, input)){
                case "1":
                    showStudents();
                    break;
                case "2":
                    //ask for parameters and then create object
                   Student newS = new Student();
                   addStudent(newS);
                    break;

                case "3":
                  show("doesn't work, check next feature");
//attempted to run a for each loop of students in students, but was unable to access the "object"
// /in  my method that required a "student" object (changing the required type in the method did no work either)
// not having anyone to ask to help me figure things out, I guess this is where I give up on this project.
                    break;
                case "4":
                    userInput = "4";
                }}while (!userInput.matches("4"));
break;

        case "2": // courses sub menu
            do {switch (selectionLoop(userInput, input)){
                case "1":
                    showCourses();
                    break;
                case "2":
                    //ask for parameters and then create object
                    Course newC = new Course();
                    addCourses(newC);
                    break;

                case "3":
                    ///show list then select number
                    //but how do I translate their number into the name to remove? hmm..
 //                   removeCourses();
                    show("doesn't work, check next feature");
                    break;
                case "4":
                    userInput = "4";
            }}while (!userInput.matches("4"));

break;
        case "3": //faculty sub menu
            do {switch (selectionLoop(userInput, input)){
                case "1":
                    showFaculty();
                    break;
                case "2":
                    //ask for parameters and then create object
                    Faculty newF = new Faculty();
                    addFaculty(newF);
                    break;

                case "3":
                    ///show list then select number
                    //but how do I translate their number into the name to remove? hmm..
//                    removeFaculty();
                    show("doesn't work, check next feature");
                    break;
                case "4":
                    userInput = "4";
            }}while (!userInput.matches("4"));
break;
        case "4": //end
break;
        default: show("Please Select a number Above:");
        userInput = "4";
    }}while(!userInput.matches("4"));

//so this is the end of the loop for the menu, we are going to ask the user if they want to continue
show("Do you want to Continue? Hit N to End, otherwise press a key:");
    userInput = input.nextLine();
   if(userInput.matches("N")){Continue = false;}else{Continue = true;}
}while(Continue);}



    //display list methods
    public void showStudents(){for(var student : students){
        show(student);}}
    public void showCourses(){for(var course : courses){
 //       Object student1 = student;
        show(course);}}
    public void showFaculty(){for(var teacher : faculty){
     //   Object student1 = student;
        show(teacher);}}

    //add new to list
    //walk through the constuctor variables with each of these via text so everything is filled out!
public void addStudent(Student S){students.add(S);}
public void addCourses(Course C){courses.add(C);} //SO this passes in an object, not just string data
public void addFaculty(Faculty F){faculty.add(F);}// that means I need a menu for creating the object as it is being added

    //  Provide ways ( like methods) to delete Students and Faculty Members   ---   Check
    public void removeStudent(Student S){students.remove(S);}
    public void removeCourses(Course C){courses.remove(C);} //this is going to be refferanced using keypad/number from list
    public void removeFaculty(Faculty F){faculty.remove(F);}


    //  and for Students and Faculty to add and delete Courses from their course schedules(done in  ---   Check!
    // defined in person
}