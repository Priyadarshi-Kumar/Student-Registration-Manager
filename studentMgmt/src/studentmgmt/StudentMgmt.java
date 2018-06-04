/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
    }
    
}
