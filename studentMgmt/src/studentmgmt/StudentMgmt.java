/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmgmt;

import java.util.*;


public class Student_1{
    private String name;
    private int age;
    private int roll;
    private String course;
    private String year;
    private String section;

    /** Constructs a Student object with the given values */
    public Student_1(String name, int age,int roll, String course, String year, String section){
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
   int x = 0;
   int menuChoice = -1;
   Student_1[] students = new Student_1[30]; //As a note, hard-coding this '30' is a bad idea.
                                         //Probably should be static, final const in class.
   Scanner input = new Scanner (System.in);
   do{
       System.out.println("\t\t\tStudent Record Menu");
       System.out.println("\t\t1. Add Student\t2. View Students\t3. Search Student\t4. Exit");
       System.out.println("Enter a choice: ");
       menuChoice = input.nextInt();

       if (menuChoice==1){
           if(x < 30) { //Able to add new student.
               System.out.println("Full name:");
               String name = input.next();     //This was your error - should be next like the others,
                                               //Not nextLine()
               System.out.println("Age:");
               int age = input.nextInt();
               System.out.println("Roll no:");
               int roll = input.nextInt();
               System.out.println("Course:");
               String course = input.next();
               System.out.println("Year:");
               String year = input.next();
               System.out.println("Section:");
               String section = input.next();

               //Create the new student using the given inputs
               Student_1 s = new Student_1(name, age,roll, course, year, section);

               //Place in array
               students[x] = s;

               //Increment x for next student placement
               x++;
           } else {  //Not able to add new student
               System.out.println("Can't add new student, students full");
           }
       }
       else if (menuChoice==2) {
           for (int i=0; i<x; i++) {
               Student_1 s = students[i];
               System.out.println(s.getName() + s.getAge() + s.getRoll() + s.getCourse() 
                                      + s.getYear() + s.getSection());
           }
       }
       else if(menuChoice==3)
       {
           System.out.println("Enter the roll no of the student:\n");
           int id = input.nextInt();
           Student_1 s1 = students[id];
            System.out.println(s1.getName() + s1.getAge() +s1.getRoll()  + s1.getCourse() 
                                      + s1.getYear() + s1.getSection());
       }
       else if(menuChoice < 1 || menuChoice > 4){
           System.out.println("Unrecognized menu choice; please re-enter");
       }
   } while (menuChoice != 4);

   //Do close your scanners when you're done with them to avoid a resource leak.
   //This is closing System.in (which is bad), but you're code is terminating anyway
   //so its ok
   input.close();
}
}