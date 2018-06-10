/**
 * this project is for student management purpose.
 * there are 4 functions add student, view all students, search students and exit. 
 */
package studentmgmt;

import java.util.*;


public class StudentMgmt{
    private String name;
    private int age;
    private int roll;
    private String course;
    private String year;
    private String section;

    /** Constructs a Student object with the given values */
    public StudentMgmt(String name, int age,int roll, String course, String year, String section){
        this.name = name;
        this.age = age;
        this.roll =roll;
        this.course = course;
        this.year = year;
        this.section = section;
    }

    /** Returns the name of this Student */
    public String getName(){
        return name;
    }

    /** Returns the age of this Student */
    public int getAge(){
        return age;
    }
    
    public int getRoll(){
        return roll;
    }

    /** Returns the course of this Student */
    public String getCourse(){
        return course;
    }

    /** Returns the year of this Student */
    public String getYear(){
        return year;
    }

    /** Returns the section of this Student */
    public String getSection(){
        return section;
    }

public static void main(String[] args) {
   int x = 0, roll=0;
   int menuChoice = -1;
   StudentMgmt[] students = new StudentMgmt[30]; 
    
   Scanner input = new Scanner (System.in);
   do{
       System.out.println("\t\t\tStudent Record Menu");
       System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
       System.out.println("Total roll numbers till now" + roll);
       System.out.println("Enter a choice: ");
       menuChoice = input.nextInt();
       
       if (menuChoice==1){
           if(x < 30) {
               roll++;// increment roll number on its own
                //Able to add new student.
               System.out.println("Full name:");
               String name = input.next();     
               System.out.println("Age:");
               int age = input.nextInt();
               System.out.println("Course:");
               String course = input.next();
               System.out.println("Year:");
               String year = input.next();
               System.out.println("Section:");
               String section = input.next();

               //Create the new student using the given inputs
               StudentMgmt s = new StudentMgmt(name, age,roll, course, year, section);

               //Place in array
               students[x] = s;

               //Increment x for next student placement
               x++;
           } else {  //Not able to add new student
               System.out.println("Can't add new student, students full");
           }
       }
       /** to view all the students enrolled*/
       else if (menuChoice==2) {
           for (int i=0; i<x; i++) {
               StudentMgmt s = students[i];
               System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getRoll() +"\t" + s.getCourse() 
                                      +"\t" + s.getYear() + "\t" +s.getSection());
           }
       }
       else if(menuChoice==3) /** to search a specific student using roll number.*/
       {
           System.out.println("Enter the roll no of the student: (with in the bound of rooll number)\n");
           int id = input.nextInt();
           
           StudentMgmt s1 = students[id-1];
            System.out.println(s1.getName() + s1.getAge() +s1.getRoll()  + s1.getCourse() 
                                      + s1.getYear() + s1.getSection());
       }
       /**to exit the loop*/
       else if(menuChoice < 1 || menuChoice > 4){
           System.out.println("Unrecognized menu choice; please re-enter");
       }
   } while (menuChoice != 4);

   input.close();
}
}
