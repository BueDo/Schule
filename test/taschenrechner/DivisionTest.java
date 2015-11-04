/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Domi
 */
public class DivisionTest {
    
    public DivisionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of berechnen method, of class Division.
     */
    @Test
    public void posTestPosZahlenBerechnen() {
        System.out.println("berechnen positiv");
        double a = 5.0;
        double b = 2.0;
        Division instance = new Division();
        double expResult = 2.5;
        double result = instance.berechnen(a, b);
        assertEquals(expResult, result, 0.0);
       
        
    }
    
    /**
     * Test of berechnen method, of class Division.
     */
    @Test (expected  = ArithmeticException.class) 
    public void negTestDurchNullBerechnen() {
        System.out.println("dividieren durch Null");
        double a = 5.0;
        double b = 0.0;
        Division instance = new Division();
        double expResult = 0.0;
        double result = instance.berechnen(a, b);
        //assertEquals(expResult, result, 0.0);
        
        
    }
}
