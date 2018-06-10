/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import studentmgmt.StudentMgmt;

/**
 *
 * @author lenovo
 */
public class TestStudent {
    private StudentMgmt S;
    
    public TestStudent() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         this.S = new StudentMgmt();
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void getName() {
     assertEquals("rohit",S.name="rohit");
     assertEquals("Darshi",S.name="Darshi");
     }
     @Test
     public void getAge() {
     assertEquals(15,S.age=15);
     assertEquals(18,S.age=18);
     }
     @Test
     public void getRoll() {
     assertEquals(21,S.roll=21);
     assertEquals(91,S.roll=91);
     }
     @Test
     public void getCourse() {
     assertEquals("cse",S.course="cse");
     assertEquals("ee",S.course="ee");
     }
     @Test
     public void getYear() {
     assertEquals("1991",S.year="1991");
     assertEquals("2015",S.year="2015");
     }
     @Test
     public void getSection() {
     assertEquals("a",S.section="a");
     assertEquals("b",S.section="b");
     assertEquals("c",S.section="c");
     }
}
